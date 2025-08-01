import java.util.Scanner;
import java.util.LinkedList;

class Student {
    int id;
    String name;
    int[] points = new int[6]; // 语文、数学、英语、物理、化学、生物

    // 构造方法
    public Student(int id, String name, int[] points) {
        this.id = id;
        this.name = name;
        this.points = points;
    }

    // 打印学生所有信息
    public void print() {
        System.out.println("学号：" + id);
        System.out.println("姓名：" + name);
        System.out.println("成绩：");
        String[] subjects = {"语文", "数学", "英语", "物理", "化学", "生物"};
        for (int i = 0; i < 6; i++) {
            System.out.println(subjects[i] + "：" + points[i]);
        }
        System.out.println("---------------------");
    }
}

public class Main {
    // 用于存储所有学生的链表
    static LinkedList<Student> students = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    // 显示菜单
    static void menu() {
        int choice;
        System.out.println("\n欢迎使用学生成绩管理系统（Java版）！");
        System.out.println("1. 添加学生");
        System.out.println("2. 删除学生");
        System.out.println("3. 查找学生");
        System.out.println("4. 修改学生信息");
        System.out.println("5. 显示所有学生");
        System.out.println("0. 退出系统");
        System.out.print("请输入选择：");
        choice = scanner.nextInt();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    findStudent();
                    break;
                case 4:
                    changeStudent();
                    break;
                case 5:
                    showAllStudents();
                    break;
                default:
                    System.out.println("无效的选择，请重新输入！");
            }

            // 再次显示菜单
            System.out.println("\n1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 查找学生");
            System.out.println("4. 修改学生信息");
            System.out.println("5. 显示所有学生");
            System.out.println("0. 退出系统");
            System.out.print("请输入选择：");
            choice = scanner.nextInt();
        }
        System.out.println("谢谢使用，再见！");
    }

    // 添加学生
    static void addStudent() {
        System.out.print("请输入学生学号：");
        int id = scanner.nextInt();

        // 检查学号是否已存在
        if (findStudentIndex(id) != -1) {
            System.out.println("该学号已存在，无法添加！");
            return;
        }

        scanner.nextLine(); // 清空缓冲区
        System.out.print("请输入学生姓名：");
        String name = scanner.nextLine();

        int[] points = new int[6];
        String[] subjects = {"语文", "数学", "英语", "物理", "化学", "生物"};
        for (int i = 0; i < 6; i++) {
            System.out.print("请输入" + subjects[i] + "成绩：");
            points[i] = scanner.nextInt();
        }

        // 添加到链表
        students.add(new Student(id, name, points));
        System.out.println("学生添加成功！");
    }

    // 删除学生
    static void deleteStudent() {
        System.out.print("请输入要删除的学生学号：");
        int id = scanner.nextInt();

        int index = findStudentIndex(id);
        if (index != -1) {
            students.remove(index);
            System.out.println("学生删除成功！");
        } else {
            System.out.println("未找到该学生！");
        }
    }

    // 查找学生
    static void findStudent() {
        System.out.print("请输入要查找的学生学号：");
        int id = scanner.nextInt();

        int index = findStudentIndex(id);
        if (index != -1) {
            System.out.println("找到该学生信息：");
            students.get(index).print();
        } else {
            System.out.println("未找到该学生！");
        }
    }

    // 修改学生信息
    static void changeStudent() {
        System.out.print("请输入要修改的学生学号：");
        int id = scanner.nextInt();

        int index = findStudentIndex(id);
        if (index != -1) {
            Student student = students.get(index);
            System.out.println("找到该学生，当前信息如下：");
            student.print();

            scanner.nextLine(); // 清空缓冲区
            System.out.print("请输入新姓名（不修改请按回车）：");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) {
                student.name = newName;
            }

            String[] subjects = {"语文", "数学", "英语", "物理", "化学", "生物"};
            for (int i = 0; i < 6; i++) {
                System.out.print("请输入新的" + subjects[i] + "成绩（不修改请输入-1）：");
                int newScore = scanner.nextInt();
                if (newScore != -1) {
                    student.points[i] = newScore;
                }
            }

            System.out.println("学生信息修改成功！");
        } else {
            System.out.println("未找到该学生！");
        }
    }

    // 显示所有学生
    static void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("当前没有学生信息！");
            return;
        }

        System.out.println("所有学生信息如下：");
        System.out.println("---------------------");
        for (Student s : students) {
            s.print();
        }
    }

    // 查找学生在链表中的索引，不存在返回-1
    static int findStudentIndex(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        menu();
        scanner.close();
    }
}
