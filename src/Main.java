// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main
{
    public static void main(String[] args)
    {
        String s="中国你好!";

        int length = s.length();

        char c = s.charAt(0);
        int i = s.lastIndexOf("or", 9); //反向indexOf

        /*boolean b = s.startsWith("hell");
        boolean b1 = s.endsWith("11");*/

        boolean equals = s.equals("111");
        boolean b = s.equalsIgnoreCase("aaa");


        byte[] bytes = s.getBytes();
        char[] charArray = s.toCharArray();
        String substring = s.substring(1, 3);
        String[] s1 = s.split(" ");

        s.replace("abc","cba");
        System.out.println(charArray);

        int i1 = s.compareTo("111");


        String lowerCase = s.toLowerCase();
        String upperCase = s.toUpperCase();

    }
}