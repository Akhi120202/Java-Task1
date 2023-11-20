class RethrowingExceptions {

    public static double calculateAverage(int[] numbers) throws CustomAverageException {
        if (numbers == null || numbers.length == 0) {
            throw new CustomAverageException("Array is empty or null");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        try {
            return sum / numbers.length;
        } catch (ArithmeticException e) {
            throw new CustomAverageException("Error calculating average: " + e.getMessage(), e);
        }
    }
}
