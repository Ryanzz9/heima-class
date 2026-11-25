package net.rzzz.arithmeticoperator;

public class ArithmeticoperatorDemo4 {
    static void main(String[] args) {
        System.out.println(3.7 + "abc");
        System.out.println("abc" + true);
        System.out.println('中'+ "abc" + true);

        int age = 18;
        System.out.println("我的年龄是" + age + "岁");
        System.out.println("我的年龄是" + "age" + "岁");

        System.out.println(1 + 2 + "abc" + 2 + 1);
        //"3abc21"

        //3.7abc
        // abctrue
        //中abctrue
        //我的年龄是18
        //我的年龄是age岁






    }
}
