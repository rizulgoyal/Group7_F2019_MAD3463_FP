package com.lambton;

public class SalaryException extends Exception {
    String message;

    public void setMessage(String message) {
        this.message = message;
    }
}
