package com.ExceptionHandling;

public class EcDef extends Exception {
    static final long serialVersionUID = -7034897190745766939L;

    public EcDef() {
    }

    public EcDef(String message) {
        super(message);
    }
}
