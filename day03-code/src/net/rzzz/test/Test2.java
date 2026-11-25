package net.rzzz.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /* 需求：
           您和您的约会对象正试图在餐厅获得一张桌子。
           键盘录入两个整数，表示你和你约会对象衣服的时髦度
           （手动录入 0~10 之间的整数，不能录其他）。
           如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出 true；否则输出 false。
        */

        // 1. 键盘录入两个整数，表示衣服的时髦度
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入我们自己的衣服时髦度");
        int myFashion = sc.nextInt();          // 记录自己的时髦度

        System.out.println("请输入相亲对象的衣服时髦度");
        int girlFashion = sc.nextInt();        // 记录相亲对象的时髦度

        // 2. 把自己的时髦度和女孩的时髦度进行比较
        //    题目要求"大于"，所以用 > ；若题目改成"大于等于"，这里就要写 >=
        boolean result = myFashion > girlFashion;

        // 3. 打印结果：true 表示相亲成功，false 表示失败
        System.out.println(result);

        // 说明：题目要求录入 0~10 之间的整数，这里暂未做范围校验（判断语句还没学，后续再补）
    }
}
