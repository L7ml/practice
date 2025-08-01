下面是菜鸟教程上给出的例子
——————————————
<!DOCTYPE html>      /*声明为HTML5文档*/
<html>      %%  为HTML页面的根元素 %%
<head>     %%  包含了文档的元数据%%
<meta charset="utf-8">%%%%
<title>菜鸟教程(runoob.com)</title>   %%描述了文档的表头%%
</head>    %% 与<head>构成头部元素（头部元素指的是从<head>到</head>）%%
<body>     %%  包含了可见的页面内容%%

<h1>我的第一个标题</h1>        %%定义一个大标题%%

<p>我的第一个标题。</p>        %% 定义一个段落%%
</body>    %%与<body>构成可见内容页面（指的是<body>到</body>）%%
</html>   %% 与<html>构成完整的HTML页面（从<html>到</html>） %%
__________________________________________________________________
为了避免在中文网页页面出现乱码，需要通过<meta charset="utf-8">声明编码
对于部分浏览器譬如360浏览器使用的是GBK编码，则需要通过<meta charset="gbk">声明编码

HTML的标题：HTML 标题是通过<h1> -<h6> 标签来定义的。——例：<h1>minecraft</h1>，则其对应的页面显示是minecraft

HTML的段落篇：HTML 段落是通过标签 <p> 来定义的。
例：<p>这是一个段落。</p>
<p>这是另外一个段落。</p>

HTML的链接：HTML的链接是通过标签<a>来定义的
例：<a href="https://www.bilibili.com/">这是一个链接</a>（其中href中的链接地址可以更改，这里我设置的是bilibili官网）

HTML图像：HTML 图像是通过标签 <img> 来定义的.
例：<img src="https://ts3.tc.mm.bing.net/th/id/OIP-C.Jmnjh2SZHljW6swAHHqqeAHaEZ?rs=1&amp;pid=ImgDetMain&amp;o=7&amp;rm=3">（其中src里使用的是指定外部资源的 URL，这里我使用的是我从网上找的图片的地址）


