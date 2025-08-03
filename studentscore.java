import java.util.Scanner;

// 链表节点
class Node {
    String id;
    String name;
    int math;
    Node next;
    Node(String id, String name, int math) {
        this.id = id;
        this.name = name;
        this.math = math;
    }
}

public class studentscore {

    static Node head = null;   // 链表头

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n------------ 学生成绩管理系统 ------------");
            System.out.println("1. 新增学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查询学生");
            System.out.println("0. 退出");
            System.out.print("请选择：");
            String xuanze = sc.nextLine();

            switch (xuanze) {
                case "1": add(sc);    break;
                case "2": shanchu(sc); break;
                case "3": xiugai(sc); break;
                case "4": chaxun(sc);  break;
                case "0": System.out.println("已退出！"); return;
                default:  System.out.println("输入错误！");
            }
        }
    }

    static void add(Scanner sc) {
        System.out.print("请输入学号：");
        String id = sc.nextLine().trim();
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.id.equals(id)) {
                System.out.println("该学号已存在！");
                return;
            }
        }

        System.out.print("请输入姓名：");
        String name = sc.nextLine().trim();

        int math;
        while (true) {
            System.out.print("请输入数学成绩：");
            try {
                math = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误！");
            }
        }

        Node node = new Node(id, name, math);
        node.next = head;
        head = node;
        System.out.println("添加成功！");
    }

    static void shanchu(Scanner sc) {
        System.out.print("请输入要删除的学号：");
        String id = sc.nextLine().trim();

        Node prev = null, cur = head;
        while (cur != null) {
            if (cur.id.equals(id)) {
                if (prev == null) head = cur.next;
                else prev.next = cur.next;
                System.out.println("删除成功！");
                return;
            }
            prev = cur;
            cur = cur.next;
        }
        System.out.println("学号不存在！");
    }

    static void xiugai(Scanner sc) {
        System.out.print("请输入要修改的学号：");
        String id = sc.nextLine().trim();
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.id.equals(id)) {
                System.out.print("新姓名（回车跳过）：");
                String newName = sc.nextLine().trim();
                if (!newName.isEmpty()) cur.name = newName;

                System.out.print("新数学成绩（回车跳过）：");
                String newMathScore = sc.nextLine().trim();
                if (!newMathScore.isEmpty()) {
                    // 内嵌 while：保证输入合法整数
                    while (true) {
                        try {
                            cur.math = Integer.parseInt(newMathScore);
                            break;                 // 正确就跳出
                        } catch (NumberFormatException e) {
                            System.out.print("输入非法，请重新输入整数：");
                            newMathScore = sc.nextLine().trim();
                        }
                    }
                }
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("学号不存在！");
    }

    static void chaxun(Scanner sc) {
        if (head == null) {
            System.out.println("暂无数据！");
            return;
        }
        System.out.println("1. 查全部  2. 按学号查");
        String sel = sc.nextLine().trim();
        if (sel.equals("1")) {
            System.out.println("学号\t姓名\t数学");
            for (Node cur = head; cur != null; cur = cur.next) {
                System.out.println(cur.id + "\t" + cur.name + "\t" + cur.math);
            }
        } else if (sel.equals("2")) {
            System.out.print("请输入学号：");
            String id = sc.nextLine().trim();
            for (Node cur = head; cur != null; cur = cur.next) {
                if (cur.id.equals(id)) {
                    System.out.println("学号\t姓名\t数学");
                    System.out.println(cur.id + "\t" + cur.name + "\t" + cur.math);
                    return;
                }
            }
            System.out.println("学号不存在！");
        } else {
            System.out.println("输入错误！");
        }
    }
}