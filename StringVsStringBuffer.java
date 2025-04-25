public class StringVsStringBuffer {
    public static void main(String[] args) {
        int iterations = 100_000;

        // Test String performance
        long startTime = System.nanoTime();
        String str = "Hello";
        for (int i = 0; i < iterations; i++) {
            str += "!";
        }
        long endTime = System.nanoTime();
        System.out.println("String Time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Test StringBuffer performance
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer("Hello");
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("!");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
