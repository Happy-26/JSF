import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class AjaxPhase implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent pe) {
        System.out.println(pe.getPhaseId() + " 已完成");
        if (pe.getPhaseId() == PhaseId.RENDER_RESPONSE)
            System.out.println(" 页面已加载");
    }

    @Override
    public void beforePhase(PhaseEvent arg0) {

    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

}

