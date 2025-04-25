public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int it = 100_000;

        // Test StringBuffer performance
        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer("Hello");
        for (int i = 0; i < it; i++) {
            stringBuffer.append("!");
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Test StringBuilder performance
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder("Hello");
        for (int i = 0; i < it; i++) {
            stringBuilder.append("!");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
