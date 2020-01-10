package fsm.OnlineOrder;

import fsm.ProcessData;
import fsm.ProcessEvent;

public class OrderData implements ProcessData {
    private double payment;
    private ProcessEvent event;

    public ProcessEvent getEvent() {
        return event;
    }

    public void setEvent(ProcessEvent event) {
        this.event = event;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}
