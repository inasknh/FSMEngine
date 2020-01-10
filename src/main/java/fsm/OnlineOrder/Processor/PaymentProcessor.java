package fsm.OnlineOrder.Processor;

import fsm.OnlineOrder.OrderData;
import fsm.OnlineOrder.OrderEvent;
import fsm.ProcessData;
import fsm.Processor;
import fsm.exception.PaymentException;
import fsm.exception.ProcessException;

public class PaymentProcessor implements Processor {

    @Override
    public ProcessData process(ProcessData data) throws ProcessException, PaymentException {
        if(((OrderData) data).getPayment() < 1.00) {
            ((OrderData) data).setEvent(OrderEvent.PAYMENT_ERROR);
            throw new PaymentException(OrderEvent.PAYMENT_ERROR.name());
        } else {
            ((OrderData) data).setEvent(OrderEvent.PAYMENT_SUCCESS);
        }
        return data;
    }
}
