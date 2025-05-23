package ru.akbirov.core.exception;

public class NotRetryableException extends RuntimeException {
    public NotRetryableException(Exception exception) {
        super(exception);
    }

    public NotRetryableException(String message) {
        super(message);
    }
}
