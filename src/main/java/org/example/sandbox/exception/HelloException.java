package org.example.sandbox.exception;

public class HelloException {
    public static void main(String[] args) {


        // try-catch block to handle the excpetion
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // do something else
    }

}
