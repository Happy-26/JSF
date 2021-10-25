package team.niit.handler;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.handler
 * @Date: 2021/10/19 9:16
 * explain:
 */
public class ValueChangeHandler implements ValueChangeListener {
    @Override
    public void processValueChange(ValueChangeEvent valueChangeEvent) throws AbortProcessingException {
        System.out.println("值更改事件发生," + valueChangeEvent.getPhaseId() + ",旧的值是：" + valueChangeEvent.getOldValue()
                + ",新的值是：" + valueChangeEvent.getNewValue()
                + ",修改的地方是：" + valueChangeEvent.getComponent() + valueChangeEvent.getSource());
    }
}
