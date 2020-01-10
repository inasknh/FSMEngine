package fsm;

import fsm.exception.ProcessException;

public abstract class AbstractStateTransitionManager implements StateTransitionManager {
    protected abstract ProcessData initializeState(ProcessData data) throws ProcessException;
    protected abstract ProcessData processStateTransition(ProcessData data) throws ProcessException;

    public ProcessData processEvent(ProcessData data) throws ProcessException {
        initializeState(data);
        return processStateTransition(data);
    }
}
