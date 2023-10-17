package p3;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y =15;
        double z = 15;

        int a = x+y;
        int b = 10+x;
        int c = x-y;
        int d = 10-x;
        int e = x*y;
        int f = x/y;
        double f1 = (double)x/y;
        System.out.println(f1);
        int g = x%y;
        System.out.println(g); //(15  - 10*1 = 5)
        int h = ++y;//
        System.out.println(h);
        System.out.println(y);
        int k =x++;
        System.out.println(k);
        System.out.println(x);
        //1 приор - x++ y--
        //2 проир - ++x --y
        //3 приор - *x /x %x
        //4 прир - + и -

       // int m = x+5 * ++y;
       // System.out.println(m);
        int m1 = (x+5)*++y;
        System.out.println(m1);

        int n = 10/5*2;
        System.out.println(n);

        double l = 2.0 - 1.0;
        System.out.println(l);

        byte b1 =7; //0000 0111
        short s1 = 7;//0000 0000 0000 0111
        //1- 0000 0001
        //-1 - 1111 1111
        //1111 0011 - 13
    }
}
