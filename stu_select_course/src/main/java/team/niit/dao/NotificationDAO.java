package team.niit.dao;

import team.niit.entity.NotificationEntity;

import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.dao.impl
 * @Date: 2021/10/26 20:09
 * Explain:
 */
public interface NotificationDAO {
    /**
     * 发布通知
     * @param notificationEntity 要发布的通知实体
     * @return 发布的通知实体
     */
    NotificationEntity insertNotification(NotificationEntity notificationEntity);

    /**
     * 更改通知
     * @param notificationEntity 要更改的通知
     * @return 返回更改后的通知
     */
    NotificationEntity updateNotification(NotificationEntity notificationEntity);

    /**
     * 根据id查询通知
     * @param notificationEntity
     * @return
     */
    NotificationEntity insertNotificationById(NotificationEntity notificationEntity);

    /**
     * 管理员查询所有通知
     * @return 返回所有通知
     */
    List<NotificationEntity> insertAll();

    /**
     * 学生查询所有通知的方法，但是只能查询本学院的所有通知
     * @param major 学生学院
     * @return 返回所有通知
     */
    NotificationEntity insertAllByMajor(String major);

    /**
     * 删除通知
     * @param id 通知编号
     * @return 成功与否
     */
    boolean deleteNotificationById(String id);

}
