class CustomAverageException extends Exception {
    public CustomAverageException(String message) {
        super(message);
    }

    public CustomAverageException(String message, Throwable cause) {
        super(message, cause);
    }
}
