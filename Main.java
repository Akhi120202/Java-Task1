import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Handling multiple exceptions
        try {
            MultipleExceptions multipleExceptions = new MultipleExceptions();
            multipleExceptions.writeList();
        } catch (IOException e) {
            // This block will catch the IOException thrown in the writeList method
            System.out.println("IOException caught: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            // This block will catch the IndexOutOfBoundsException thrown in the writeList method
            System.out.println("IndexOutOfBoundsException caught: " + e.getMessage());
        }

        // Rethrowing Exceptions
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            double average = RethrowingExceptions.calculateAverage(numbers);
            System.out.println("Average: " + average);
        } catch (CustomAverageException e) {
            // This block will catch the CustomAverageException thrown in the calculateAverage method
            System.err.println("CustomAverageException caught: " + e.getMessage());
        }

        // Resource Management

        ResourceManagement resourceManager = new ResourceManagement();
        // Simulate multiple threads trying to acquire and release resources
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                // Simulate resource acquisition
                resourceManager.acquireResource();

                // Simulate with the acquired resource
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Simulate resource release
                resourceManager.releaseResource();
            }).start();
        }

        // Chain exception
        try {
            performOperation();
        } catch (ChainingExceptions ce) {
            // This block will catch the ChainingExceptions thrown in the performOperation method
            System.out.println("ChainingExceptions caught: " + ce.getMessage());
            System.out.println("Original cause: " + ce.getCause().getMessage());
        }
    }

    static void performOperation() throws ChainingExceptions {
        try {
            // Simulate an arithmetic operation that leads to an exception
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ae) {
            // This block will catch the ArithmeticException thrown in the divideNumbers method
            System.out.println("ArithmeticException caught: " + ae.getMessage());
        }
    }

    static int divideNumbers(int dividend, int divisor) {
        // Simulate a division operation
        return dividend / divisor;
    }
}
