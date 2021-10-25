package team.niit.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 获取SessionFactory 的工具类
 */
public class SessionFactoryUtil {
    static SessionFactory sessionFactory;
    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
