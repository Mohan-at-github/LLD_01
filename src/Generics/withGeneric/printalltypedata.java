package Generics.withGeneric;
public class printalltypedata {
    public static <T> void print(T[] array)
    {
        for(T i:array)
        {
            System.out.print(" "+ i);

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6};
        Float[] f={1.1F, 2.2F, 3.3F, 4.4F, 5.5F, 6.6F};
        Character[] c={'a','b','c','d','e','f'};
        print(a);
        print(c);
        print(f);

    }
}
