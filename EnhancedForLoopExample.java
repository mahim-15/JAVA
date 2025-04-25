public class EnhancedForLoopExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Elements of the array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
