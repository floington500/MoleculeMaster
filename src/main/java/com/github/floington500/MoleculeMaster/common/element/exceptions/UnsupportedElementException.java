package com.github.floington500.MoleculeMaster.common.element.exceptions;

/**
 * This exception is thrown if there is an error on the behalf of the user
 * and their input.
 */
public class UnsupportedElementException extends IllegalArgumentException {

    public UnsupportedElementException() {
    }

    public UnsupportedElementException(String msg) {
        super(msg);
    }

    public UnsupportedElementException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedElementException(Throwable cause) {
        super(cause);
    }
}
