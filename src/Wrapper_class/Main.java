package Wrapper_class;
import java.lang.Integer;
public class Main {
    public static void main(String[] args) {
        int num=10;
        Integer wrapper_num=num; //Autoboxing  //or
         //Integer wrapper_num1=new Integer(10);  Unnecessary boxing
        int n= wrapper_num; //unboxing

        String s=Integer.toString(num); //primitive to string
        int num1=Integer.parseInt(s); //String to primitive

        String s1=wrapper_num.toString(); //wrapper to string
        Integer num3=Integer.valueOf(s1); //String to wrapper

    }
}
