package team.niit.service.impl;

import team.niit.entity.NotificationEntity;
import team.niit.service.NotificationService;

import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.service.impl
 * @Date: 2021/10/26 20:01
 */
public class NotificationServiceImpl implements NotificationService {
    @Override
    public NotificationEntity publishNotification(NotificationEntity notificationEntity) {
        return null;
    }

    @Override
    public NotificationEntity modifyNotification(NotificationEntity notificationEntity) {
        return null;
    }

    @Override
    public NotificationEntity queryNotificationById(NotificationEntity notificationEntity) {
        return null;
    }

    @Override
    public List<NotificationEntity> queryAll() {
        return null;
    }

    @Override
    public NotificationEntity queryAllByMajor(String major) {
        return null;
    }

    @Override
    public boolean deleteNotificationById(String id) {
        return false;
    }
}
