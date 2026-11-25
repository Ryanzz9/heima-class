package net.rzzz.compareoperator;

public class CompareoperatorDemo1 {
    public static void main(String[] args) {
        // 1. == 判断左右两边是否相等：相等为 true，不相等为 false
        int a = 10;
        int b = 10;
        int c = 20;

        System.out.println(a == b); // true：10 和 10 相等
        System.out.println(a == c); // false：10 和 20 不相等

        // 2. != 判断左右两边是否不相等：结果与 == 正好相反
        System.out.println(a != b); // false：两者相等，所以"不相等"不成立
        System.out.println(a != c); // true：两者不相等，所以"不相等"成立

        // 其余四种（>、>=、<、<=）写法同理，课后自行练习
    }
}
