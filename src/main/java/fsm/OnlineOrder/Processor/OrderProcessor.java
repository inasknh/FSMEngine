package fsm.OnlineOrder.Processor;

import fsm.OnlineOrder.OrderData;
import fsm.OnlineOrder.OrderEvent;
import fsm.ProcessData;
import fsm.exception.ProcessException;
import fsm.Processor;

public class OrderProcessor implements Processor {
    public ProcessData process(ProcessData data) throws ProcessException {
        ((OrderData) data).setEvent(OrderEvent.ORDER_CREATED);
        return data;
    }
}
