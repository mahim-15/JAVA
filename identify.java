 import java.util.Scanner;
 interface Id {
void displayId();
    
}
interface contact{
  void displaycontact();
}
abstract class person{
    String name;
    int age;
    person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    abstract void info();
}
class student extends person implements Id,contact{
    String stId;
    String contact;
    student(String name,int age,String stId,String contact){
        super(name,age);
        this.stId=stId;
        this.contact=contact;

    }
    void info()
    {
        System.out.println("Name: "+name+"Age: "+age);
    }
    public void displayId(){
        System.out.println("Id is: "+stId);
    }
    public void displaycontact(){
        System.out.println("Contact: "+contact);
    }

}
public class identify {
    public static void main(String[] args) {
        
        student std1=new student("Mahim",22,"23012","01306192878");
        std1.info();
        std1.displayId();
        std1.displaycontact();
        
    }
    
}
