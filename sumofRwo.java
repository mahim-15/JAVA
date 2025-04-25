class sum{
    void sum(int x,int y){
        System.out.println("Sum of Integers= "+(x+y));
    }
    void sum(long x,long y){
        System.out.println("Sum of Long "+(x+y));
    }
}
public class sumofRwo {
    public static void main(String[] args) {
        sum obj=new sum();
        obj.sum(44,66);
        obj.sum(200L, 555L);
        
    }
}
