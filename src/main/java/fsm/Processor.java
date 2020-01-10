package fsm;

import fsm.exception.PaymentException;
import fsm.exception.ProcessException;

public interface Processor {
    ProcessData process(ProcessData data) throws ProcessException, PaymentException;
}
