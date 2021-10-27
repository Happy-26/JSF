package team.niit.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(NotificationEntity.class)
public abstract class NotificationEntity_ {

	public static volatile SingularAttribute<NotificationEntity, String> major;
	public static volatile SingularAttribute<NotificationEntity, Integer> id;
	public static volatile SingularAttribute<NotificationEntity, String> time;
	public static volatile SingularAttribute<NotificationEntity, String> title;
	public static volatile SingularAttribute<NotificationEntity, String> content;

	public static final String MAJOR = "major";
	public static final String ID = "id";
	public static final String TIME = "time";
	public static final String TITLE = "title";
	public static final String CONTENT = "content";

}

