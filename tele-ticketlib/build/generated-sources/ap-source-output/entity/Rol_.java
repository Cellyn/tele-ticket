package entity;

import entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-09T09:00:21")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> descripcion;
    public static volatile SingularAttribute<Rol, Integer> idRol;
    public static volatile ListAttribute<Rol, Usuario> usuarioList;
    public static volatile SingularAttribute<Rol, Date> fechacreo;
    public static volatile SingularAttribute<Rol, String> usuariomodifico;
    public static volatile SingularAttribute<Rol, Date> fechamodifico;
    public static volatile SingularAttribute<Rol, String> nombre;
    public static volatile SingularAttribute<Rol, String> usuariocreo;
    public static volatile SingularAttribute<Rol, Boolean> status;

}