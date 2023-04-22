package com.github.flo456123.common.equation;

public class InvalidEquationException extends IllegalArgumentException {

    public InvalidEquationException() {
    }

    public InvalidEquationException(String msg) {
        super(msg);
    }

    public InvalidEquationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidEquationException(Throwable cause) {
        super(cause);
    }
}
