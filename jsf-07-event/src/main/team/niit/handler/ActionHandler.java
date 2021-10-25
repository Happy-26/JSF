package team.niit.handler;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import java.util.Date;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.handler
 * @Date: 2021/10/19 9:05
 * explain: 实现自定义事件监听器
 */
public class ActionHandler implements ActionListener {

    @Override
    public void processAction(ActionEvent actionEvent) throws AbortProcessingException {
        // id: INVOKE_APPLICATION
        System.out.println("操作事件发生：" + actionEvent.getPhaseId() + new Date().toString());
    }
}
