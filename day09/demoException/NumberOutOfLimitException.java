package com.lanou.day09.demoException;

public class NumberOutOfLimitException extends Exception{
    public NumberOutOfLimitException() {
    }

    public NumberOutOfLimitException(String message) {
        super(message);
    }
}
