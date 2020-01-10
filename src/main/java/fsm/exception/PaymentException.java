package fsm.exception;

public class PaymentException extends Exception {

    public PaymentException(String s) {
        super(s);
    }

    public PaymentException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
