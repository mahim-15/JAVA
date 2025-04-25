class Thread2 extends Thread{
    public void run(){
        System.out.println("THread2 is running...");
        System.out.println("Enter stop");
    }
}
class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread 1 is running..");
        System.out.println("Execution ...");
    }
}
public class threadd {
    public static void main(String[] args) {
        Thread1 x=new Thread1();
        Thread2 y=new Thread2();
        y.start();
        x.start();
        
    }
    
}
