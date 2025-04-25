import java.util.Scanner;
interface Ivehicle{
    void brake();
    void steering();
}
class car implements Ivehicle{
    public void steering(){
        System.out.println("Car steerring");
    }
    public void brake(){
        System.out.println("Car brake");
    }

}
class lorry implements Ivehicle{
    public void steering(){
        System.out.println("Lorry steerring");
    }
    public void brake(){
        System.out.println("Lorry brake");
    }

}
public class lab21 {
    public static void main(String[]args){
       
        Ivehicle obj=new car();
        obj.steering();
        obj.brake();
        Ivehicle obj2=new lorry();
        obj2.brake();
        obj.steering();
    }
    
}
