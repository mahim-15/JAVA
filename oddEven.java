import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        oddEven checker = new oddEven();
        checker.checkOddEven(number);
        
        scanner.close();
    }
    
    // Method to check if a number is odd or even
    public void checkOddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
