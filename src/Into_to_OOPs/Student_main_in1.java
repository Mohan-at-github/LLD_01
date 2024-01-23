package Into_to_OOPs;

public class Student_main_in1 {
     public class Student {
        String name;

        String email;

        int age;

        void changeBatch(){
            System.out.println(this.name + " is changing their batch.");
        }

        void pauseCourse(){
            System.out.println(this.name + " is pausing their course.");
        }
    }
    public static void main(String[] args) {
        Into_to_OOPs.Student S1=new Into_to_OOPs.Student();
        S1.name="mohan";
        S1.age=20;
        S1.email="mmcvx@gmail.com";
        S1.changeBatch();
        S1.pauseCourse();
    }
}
