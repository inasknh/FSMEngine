package fsm.OnlineOrder;

import fsm.*;
import fsm.OnlineOrder.Processor.OrderProcessor;
import fsm.exception.ProcessException;


/**
 * DEFAULT    -  submit -> orderProcessor()   -> orderCreated   -> PMTPENDING
 * PMTPENDING -  pay    -> paymentProcessor() -> paymentError   -> PMTPENDING
 * PMTPENDING -  pay    -> paymentProcessor() -> paymentSuccess -> COMPLETED
 */
public enum OrderEvent implements ProcessEvent {
    SUBMIT {
        public Class<? extends Processor> nextStepProcessor(ProcessEvent event) {
            return OrderProcessor.class;
        }

        public ProcessState nextState(ProcessData data) throws ProcessException {
            return null;
        }
    }, ORDER_CREATED {
        public Class<? extends Processor> nextStepProcessor(ProcessEvent event) {
            return null;
        }

        public ProcessState nextState(ProcessData data) throws ProcessException {
            return null;
        }
    }, PAY {
        public Class<? extends Processor> nextStepProcessor(ProcessEvent event) {
            return null;
        }

        public ProcessState nextState(ProcessData data) throws ProcessException {
            return null;
        }
    }, PAYMENT_SUCCESS {
        public Class<? extends Processor> nextStepProcessor(ProcessEvent event) {
            return null;
        }

        public ProcessState nextState(ProcessData data) throws ProcessException {
            return null;
        }
    }, PAYMENT_ERROR {
        public Class<? extends Processor> nextStepProcessor(ProcessEvent event) {
            return null;
        }

        public ProcessState nextState(ProcessData data) throws ProcessException {
            return null;
        }
    };


}
