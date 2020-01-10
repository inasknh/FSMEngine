package fsm;

import fsm.exception.ProcessException;

public interface ProcessEvent {
    abstract Class<? extends Processor> nextStepProcessor(ProcessEvent event);
    abstract ProcessState nextState(ProcessData data) throws ProcessException;
}
