package net.rzzz.assigningoperator;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        // += 的运算规则：将左边和右边进行相加，再把结果赋值给左边
        int a = 10;
        int b = 20;

        // 把 a + b 的结果赋值给左边的变量 a
        a += b;
        // 等同于 a = a + b;
        System.out.println(a); // 30
        System.out.println(b); // 20（b 没有被改动，改的只有左边）

        // 细节：+=、-=、*=、/=、%= 底层都隐藏了一个强制类型转换
        short s = 1;
        // 把左边和右边进行相加，得到结果 2，再赋值给左边的变量
        s += 1;
        // 等同于：s = (short) (s + 1);
        // 注意不是 s = s + 1; —— s 参与运算会先提升为 int，int 不能直接赋给 short，那样写会编译报错
        System.out.println(s); // 2
    }
}
