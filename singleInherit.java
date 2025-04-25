import java.util.Scanner;
public class singleInherit {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        
        int rr=0,ans=0;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c=='1')
            {
                rr=0;
                
            }
            else 
            {
                rr++;
            }
            if(rr==m)
            {
                ans++;
                i=i+k-1;
                rr=0;
            }

        }
        System.out.println(ans);
        //sc.close();


      }
        
    }
    
}
