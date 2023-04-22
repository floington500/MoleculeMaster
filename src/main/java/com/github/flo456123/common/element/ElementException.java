package com.github.flo456123.common.element;

public class ElementException extends IllegalArgumentException {

    public ElementException() {
    }

    public ElementException(String msg) {
        super(msg);
    }

    public ElementException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementException(Throwable cause) {
        super(cause);
    }
}
