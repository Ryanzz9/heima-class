package net.rzzz.arithmeticoperator;

import java.sql.SQLOutput;

public class ArithmeticoperatorDemo6 {
    static void main() {
        //++ 和 --
        int a = 10;
        a++;
        System.out.println(a);

        ++a;
        System.out.println(a);

        a--;
        System.out.println(a);

        --a;
        System.out.println(a);

        int z = 10;
        int b = z++;
        System.out.println("现在b是:"+ b);
        System.out.println("现在z是:"+ z);

        int y = 10;
        int c = ++y;
        System.out.println("现在c是:"+ c);


    }


}
