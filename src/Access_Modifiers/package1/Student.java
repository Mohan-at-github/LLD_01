package Access_Modifiers.package1;

public class Student {
    private int age;//can be accessed with this class only
    int psp; //default
    protected String email;
    public String name;
   public void print_name()
   {
       System.out.println(this.name);
   }
}
