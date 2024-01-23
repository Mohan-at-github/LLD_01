package Access_Modifiers.package2;

import Access_Modifiers.package1.Student;

public class test {
    Student s=new Student();
    void print(){
        // System.out.println(s.age);//age is private member of student class
        // System.out.println(s.psp); //different package and access modifier default
        //System.out.println(s.email); //different package no Inheritance and access modifier protected
        System.out.println(s.name);
    }

}
