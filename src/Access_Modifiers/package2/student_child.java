package Access_Modifiers.package2;

import Access_Modifiers.package1.Student;

public class student_child extends Student {
    void print()
    {
       // System.out.println(age);//age is private member of student class
       //System.out.println(psp); //different package and access modifier default
        System.out.println(email);
        System.out.println(name);
    }

}
