package net.rzzz.arithmeticoperator;

public class ArithmeticoperatorDemo5 {
     void main() {
        char c = 'a';
        int result = c + 0;
        System.out.println(result);

        System.out.println(1 + 'a'); //98
        System.out.println('a' + "abc"); //"aabc"

        //在 Python 中，字符串和整数相乘（*）表示将字符串重复指定的次数，这是一种“自连接”操作
        //print("abc" * 2)
        // 输出: abcabc

        //Java 不支持字符串乘法
        //System.out.println("abc" * 2);
        //但 Java 11 及以上版本提供了 repeat() 方法

        System.out.println("abc".repeat(2));

        //字符+字符
        //字符+数字
        //时，会把字符通过ASCII码表查询到对应的数字再进行计算。
        //
    }
}
