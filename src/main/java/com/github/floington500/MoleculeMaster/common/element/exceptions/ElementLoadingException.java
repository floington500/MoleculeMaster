package com.github.floington500.MoleculeMaster.common.element.exceptions;

/**
 * This exception is thrown if there is an error on behalf of
 * the program with loading the elements from the elements
 * datafile.
 */
public class ElementLoadingException extends RuntimeException {

    public ElementLoadingException() {
    }

    public ElementLoadingException(String msg) {
        super(msg);
    }

    public ElementLoadingException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementLoadingException(Throwable cause) {
        super(cause);
    }
}
