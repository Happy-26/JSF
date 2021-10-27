package team.niit.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AdminEntity.class)
public abstract class AdminEntity_ {

	public static volatile SingularAttribute<AdminEntity, String> password;
	public static volatile SingularAttribute<AdminEntity, String> phone;
	public static volatile SingularAttribute<AdminEntity, String> name;
	public static volatile SingularAttribute<AdminEntity, String> id;

	public static final String PASSWORD = "password";
	public static final String PHONE = "phone";
	public static final String NAME = "name";
	public static final String ID = "id";

}

