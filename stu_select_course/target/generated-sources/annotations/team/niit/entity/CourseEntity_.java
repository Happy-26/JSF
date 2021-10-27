package team.niit.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CourseEntity.class)
public abstract class CourseEntity_ {

	public static volatile SingularAttribute<CourseEntity, Integer> no;
	public static volatile SingularAttribute<CourseEntity, String> teacher;
	public static volatile SingularAttribute<CourseEntity, String> major;
	public static volatile SingularAttribute<CourseEntity, Integer> quota;
	public static volatile SingularAttribute<CourseEntity, String> name;
	public static volatile SingularAttribute<CourseEntity, String> id;
	public static volatile SingularAttribute<CourseEntity, String> category;

	public static final String NO = "no";
	public static final String TEACHER = "teacher";
	public static final String MAJOR = "major";
	public static final String QUOTA = "quota";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String CATEGORY = "category";

}

