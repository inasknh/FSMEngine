package fsm;

import fsm.exception.ProcessException;

public interface StateTransitionManager {
    ProcessData processEvent(ProcessData data) throws ProcessException;
}
