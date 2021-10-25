package team.niit.handler;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.handler
 * @Date: 2021/10/19 9:42
 * explain:
 */
public class PhaseHandler implements PhaseListener {
    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println("after phase" + getPhaseId());
    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        if (phaseEvent.getPhaseId() == PhaseId.APPLY_REQUEST_VALUES) {
            System.out.println(PhaseId.APPLY_REQUEST_VALUES);
        }
        System.out.println("before phase" + getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
