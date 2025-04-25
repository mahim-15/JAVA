import java.util.Scanner;
class fruit
{
    public float unitprice;
    public int quantity;
    public float totalcost()
    { 
        return quantity*unitprice;
    }
    public void readdata()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the price per kg");
    unitprice=sc.nextFloat();
    System.out.println("How many kg you want to purchase");
    quantity=sc.nextInt();
    sc.close();
    

}
public void display()
{
    System.out.printf("%.2f Tk per kg\n",unitprice);
    System.out.printf("purchase quantity %d kg\n",quantity);
    System.out.printf("Cost=%.2f TK\n",totalcost());
}
}

class Mango extends fruit{
    public String name;
    public String taste;
    public Mango(String t,String s)
    {
        taste=t;
        name=s;
    }
    public void makejuice()
    {
        System.out.println("peel off and slice the fruit \n Crush the fruit slices to make juice");
    }
}
class eight {
    public static void main(String[] args) {
        Mango malgova=new Mango("Sweet","malgova");
        System.out.printf("Taste of %s is very %s\n",malgova.name,malgova.taste);
        malgova.readdata();
        malgova.display();
        malgova.makejuice();
        //sc.close();
        
    }
    
}