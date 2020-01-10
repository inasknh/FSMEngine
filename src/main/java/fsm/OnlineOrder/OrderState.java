package fsm.OnlineOrder;

import fsm.ProcessState;
/**
 * DEFAULT    -  submit -> orderProcessor()   -> orderCreated   -> PMTPENDING
 * PMTPENDING -  pay    -> paymentProcessor() -> paymentError   -> PMTPENDING
 * PMTPENDING -  pay    -> paymentProcessor() -> paymentSuccess -> COMPLETED
 */
public enum OrderState implements ProcessState {
    DEFAULT,
    PAYMENT_PENDING,
    COMPLETED
}
