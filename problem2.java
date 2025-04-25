abstract class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    abstract void display();
}
interface identity{
    void identify();
}
class Employe extends Person implements identity{
    int id;
    Employe(String name,int id){
        super(name);
        this.id=id;
    }
    void display(){
        System.out.println("name ="+name);
    }
    public void identify(){
        System.out.println("ID= "+id);
    }
}
public class problem2 {
    public static void main(String []args){
        Employe obj=new Employe("Mahim",230121);
        obj.display();
        obj.identify();

    }
  
    
}
