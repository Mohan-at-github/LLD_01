package Generics.withoutGeneric;

import static Generics.withoutGeneric.printIntarray.printint;

public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        float[] f={1.1F, 2.2F, 3.3F, 4.4F, 5.5F, 6.6F};
        char[] c={'a','b','c','d','e','f'};
        printint(a);
        printchararray ch=new printchararray();
        ch.printchar(c);

        printfloat(f);
    }
}
