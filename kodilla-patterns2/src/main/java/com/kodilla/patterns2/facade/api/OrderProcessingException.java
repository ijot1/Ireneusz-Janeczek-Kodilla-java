package com.kodilla.patterns2.facade.api;

public class OrderProcessingException extends Throwable {
    public static String ERR_NOT_AUTHORISED = "User is  not authorised";
    public static String ERR_PAYMENT_REJECTED = "User is  not authorised";
    public static String ERR_VERIFICATION_ERROR = "User is  not authorised";
    public static String ERR_SUBMITTING_ERROR = "User is  not authorised";

    public OrderProcessingException(String message) {
        super(message);
    }
}
