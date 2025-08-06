<?php
// 完整的 99 乘法表页面
?><!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>九九乘法表</title>
    <style>
    body{
            margin:0;
            background:#f4f4f9;
            font-family: "Fira Code","Consolas",monospace;
            display:flex;
            justify-content:center;
            align-items:center;
            min-height:100vh;
        }
        pre{
            background:#fff;
            padding:25px 35px;
            border-radius:12px;
            box-shadow:0 8px 20px rgba(0,0,0,.08);
            font-size:18px;
            line-height:1.6;
            white-space:pre;
            color:#333;
        }
    </style>
</head>
<body>
<pre><?php
for ($i = 1; $i <= 9; $i++) {
    for ($j = 1; $j <= $i; $j++) {
        printf("%d*%d=%-2d ", $j, $i, $i * $j);
    }
    echo PHP_EOL;
}
?></pre>
</body>

</html>
