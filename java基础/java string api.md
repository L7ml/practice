下面是 String 类支持的方法，更多详细，参看 [Java String API](https://www.runoob.com/manual/jdk11api/java.base/java/lang/String.html) 文档:

|SN(序号)|方法描述|
|---|---|
|1|[char charAt(int index)](https://www.runoob.com/java/java-string-charat.html)  <br>返回指定索引处的 char 值。|
|2|[int compareTo(Object o)](https://www.runoob.com/java/java-string-compareto.html)  <br>把这个字符串和另一个对象比较。|
|3|[int compareTo(String anotherString)](https://www.runoob.com/java/java-string-compareto.html)  <br>按字典顺序比较两个字符串。|
|4|[int compareToIgnoreCase(String str)](https://www.runoob.com/java/java-string-comparetoignorecase.html)  <br>按字典顺序比较两个字符串，不考虑大小写。|
|5|[String concat(String str)](https://www.runoob.com/java/java-string-concat.html)  <br>将指定字符串连接到此字符串的结尾。|
|6|[boolean contentEquals(StringBuffer sb)](https://www.runoob.com/java/java-string-contentequals.html)  <br>当且仅当字符串与指定的StringBuffer有相同顺序的字符时候返回真。|
|7|[static String copyValueOf(char[] data)](https://www.runoob.com/java/java-string-copyvalueof.html)  <br>返回指定数组中表示该字符序列的 String。|
|8|[static String copyValueOf(char[] data, int offset, int count)](https://www.runoob.com/java/java-string-copyvalueof.html)  <br>返回指定数组中表示该字符序列的 String。|
|9|[boolean endsWith(String suffix)](https://www.runoob.com/java/java-string-endswith.html)  <br>测试此字符串是否以指定的后缀结束。|
|10|[boolean equals(Object anObject)](https://www.runoob.com/java/java-string-equals.html)  <br>将此字符串与指定的对象比较。|
|11|[boolean equalsIgnoreCase(String anotherString)](https://www.runoob.com/java/java-string-equalsignorecase.html)  <br>将此 String 与另一个 String 比较，不考虑大小写。|
|12|[byte[] getBytes()](https://www.runoob.com/java/java-string-getbytes.html)  <br> 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。|
|13|[byte[] getBytes(String charsetName)](https://www.runoob.com/java/java-string-getbytes.html)  <br>使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。|
|14|[void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)](https://www.runoob.com/java/java-string-getchars.html)  <br>将字符从此字符串复制到目标字符数组。|
|15|[int hashCode()](https://www.runoob.com/java/java-string-hashcode.html)  <br>返回此字符串的哈希码。|
|16|[int indexOf(int ch)](https://www.runoob.com/java/java-string-indexof.html)  <br>返回指定字符在此字符串中第一次出现处的索引。|
|17|[int indexOf(int ch, int fromIndex)](https://www.runoob.com/java/java-string-indexof.html)  <br>返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。|
|18|[int indexOf(String str)](https://www.runoob.com/java/java-string-indexof.html)  <br> 返回指定子字符串在此字符串中第一次出现处的索引。|
|19|[int indexOf(String str, int fromIndex)](https://www.runoob.com/java/java-string-indexof.html)  <br>返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。|
|20|[String intern()](https://www.runoob.com/java/java-string-intern.html)  <br> 返回字符串对象的规范化表示形式。|
|21|[int lastIndexOf(int ch)](https://www.runoob.com/java/java-string-lastindexof.html)  <br> 返回指定字符在此字符串中最后一次出现处的索引。|
|22|[int lastIndexOf(int ch, int fromIndex)](https://www.runoob.com/java/java-string-lastindexof.html)  <br>返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。|
|23|[int lastIndexOf(String str)](https://www.runoob.com/java/java-string-lastindexof.html)  <br>返回指定子字符串在此字符串中最右边出现处的索引。|
|24|[int lastIndexOf(String str, int fromIndex)](https://www.runoob.com/java/java-string-lastindexof.html)  <br> 返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。|
|25|[int length()](https://www.runoob.com/java/java-string-length.html)  <br>返回此字符串的长度。|
|26|[boolean matches(String regex)](https://www.runoob.com/java/java-string-matches.html)  <br>告知此字符串是否匹配给定的正则表达式。|
|27|[boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)](https://www.runoob.com/java/java-string-regionmatches.html)  <br>测试两个字符串区域是否相等。|
|28|[boolean regionMatches(int toffset, String other, int ooffset, int len)](https://www.runoob.com/java/java-string-regionmatches.html)  <br>测试两个字符串区域是否相等。|
|29|[String replace(char oldChar, char newChar)](https://www.runoob.com/java/java-string-replace.html)  <br>返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。|
|30|[String replaceAll(String regex, String replacement)](https://www.runoob.com/java/java-string-replaceall.html)  <br>使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。|
|31|[String replaceFirst(String regex, String replacement)](https://www.runoob.com/java/java-string-replacefirst.html)  <br> 使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。|
|32|[String[] split(String regex)](https://www.runoob.com/java/java-string-split.html)  <br>根据给定正则表达式的匹配拆分此字符串。|
|33|[String[] split(String regex, int limit)](https://www.runoob.com/java/java-string-split.html)  <br>根据匹配给定的正则表达式来拆分此字符串。|
|34|[boolean startsWith(String prefix)](https://www.runoob.com/java/java-string-startswith.html)  <br>测试此字符串是否以指定的前缀开始。|
|35|[boolean startsWith(String prefix, int toffset)](https://www.runoob.com/java/java-string-startswith.html)  <br>测试此字符串从指定索引开始的子字符串是否以指定前缀开始。|
|36|[CharSequence subSequence(int beginIndex, int endIndex)](https://www.runoob.com/java/java-string-subsequence.html)  <br> 返回一个新的字符序列，它是此序列的一个子序列。|
|37|[String substring(int beginIndex)](https://www.runoob.com/java/java-string-substring.html)  <br>返回一个新的字符串，它是此字符串的一个子字符串。|
|38|[String substring(int beginIndex, int endIndex)](https://www.runoob.com/java/java-string-substring.html)  <br>返回一个新字符串，它是此字符串的一个子字符串。|
|39|[char[] toCharArray()](https://www.runoob.com/java/java-string-tochararray.html)  <br>将此字符串转换为一个新的字符数组。|
|40|[String toLowerCase()](https://www.runoob.com/java/java-string-tolowercase.html)  <br>使用默认语言环境的规则将此 String 中的所有字符都转换为小写。|
|41|[String toLowerCase(Locale locale)](https://www.runoob.com/java/java-string-tolowercase.html)  <br> 使用给定 Locale 的规则将此 String 中的所有字符都转换为小写。|
|42|[String toString()](https://www.runoob.com/java/java-string-tostring.html)  <br> 返回此对象本身（它已经是一个字符串！）。|
|43|[String toUpperCase()](https://www.runoob.com/java/java-string-touppercase.html)  <br>使用默认语言环境的规则将此 String 中的所有字符都转换为大写。|
|44|[String toUpperCase(Locale locale)](https://www.runoob.com/java/java-string-touppercase.html)  <br>使用给定 Locale 的规则将此 String 中的所有字符都转换为大写。|
|45|[String trim()](https://www.runoob.com/java/java-string-trim.html)  <br>返回字符串的副本，忽略前导空白和尾部空白。|
|46|[static String valueOf(primitive data type x)](https://www.runoob.com/java/java-string-valueof.html)  <br>返回给定data type类型x参数的字符串表示形式。|
|47|[contains(CharSequence chars)](https://www.runoob.com/java/java-string-contains.html)  <br>判断是否包含指定的字符系列。|
|48|[isEmpty()](https://www.runoob.com/java/java-string-isempty.html)  <br>判断字符串是否为空。|