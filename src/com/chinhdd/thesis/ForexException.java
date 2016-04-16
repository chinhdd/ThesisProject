package com.chinhdd.thesis;

public class ForexException extends Exception {

    public ForexException(Exception e, String message) {
        super(message, e);
    }
}
