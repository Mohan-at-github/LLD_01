package Access_Modifiers.package1;

public class mains {
    public static void main(String[] args) {
        Student s1=new Student();
        //System.out.println(s1.age);age is private member of student class
        System.out.println(s1.psp);
        System.out.println(s1.email);
        System.out.println(s1.name);
    }
}
