package team.niit.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StudentEntity.class)
public abstract class StudentEntity_ {

	public static volatile SingularAttribute<StudentEntity, String> password;
	public static volatile SingularAttribute<StudentEntity, String> gender;
	public static volatile SingularAttribute<StudentEntity, String> major;
	public static volatile SingularAttribute<StudentEntity, String> classes;
	public static volatile SingularAttribute<StudentEntity, String> name;
	public static volatile SingularAttribute<StudentEntity, String> birth;
	public static volatile SingularAttribute<StudentEntity, String> id;

	public static final String PASSWORD = "password";
	public static final String GENDER = "gender";
	public static final String MAJOR = "major";
	public static final String CLASSES = "classes";
	public static final String NAME = "name";
	public static final String BIRTH = "birth";
	public static final String ID = "id";

}

