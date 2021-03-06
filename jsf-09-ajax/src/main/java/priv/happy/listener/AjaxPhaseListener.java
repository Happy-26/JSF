package priv.happy.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class AjaxPhaseListener implements PhaseListener {
    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println(phaseEvent.getPhaseId() + "completely");
        if (phaseEvent.getPhaseId() == PhaseId.RENDER_RESPONSE) {
            System.out.println("page load completely");
        }
    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {

    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
