package Access_Modifiers.package1;
    public class student_child_same_pack extends Student {
        void print()
        {
            //System.out.println(age);//age is private member of student class
            System.out.println(psp);
            System.out.println(email);
            System.out.println(name);
        }
}
