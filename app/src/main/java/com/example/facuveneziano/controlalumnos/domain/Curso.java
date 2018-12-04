package com.example.facuveneziano.controlalumnos.domain;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;


@Entity(indexes = {
        @Index(value = "id", unique = true),
        @Index(value = "materia"),
        @Index(value = "precio"),

})
public class Curso {
    @org.greenrobot.greendao.annotation.Id
    private Long id;

    private Long personaId;
    @ToOne(joinProperty = "personaId")
    private Persona persona;

    private String materia;
    private Date fechaIngreso;
    private Date fechaInicio;
    private Date fechaFinal;
    private Boolean habilitado;
    private Double precio;
    private Short minutos;

/** Used to resolve relations */
@Generated(hash = 2040040024)
private transient DaoSession daoSession;

/** Used for active entity operations. */
@Generated(hash = 140197897)
private transient CursoDao myDao;
@Generated(hash = 1132346785)
public Curso(Long id, Long personaId, String materia, Date fechaIngreso,
        Date fechaInicio, Date fechaFinal, Boolean habilitado, Double precio,
        Short minutos) {
    this.id = id;
    this.personaId = personaId;
    this.materia = materia;
    this.fechaIngreso = fechaIngreso;
    this.fechaInicio = fechaInicio;
    this.fechaFinal = fechaFinal;
    this.habilitado = habilitado;
    this.precio = precio;
    this.minutos = minutos;
}
@Generated(hash = 2085409587)
public Curso() {
}
public Long getId() {
    return this.id;
}
public void setId(Long id) {
    this.id = id;
}
public Long getPersonaId() {
    return this.personaId;
}
public void setPersonaId(Long personaId) {
    this.personaId = personaId;
}
public String getMateria() {
    return this.materia;
}
public void setMateria(String materia) {
    this.materia = materia;
}
public Date getFechaIngreso() {
    return this.fechaIngreso;
}
public void setFechaIngreso(Date fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
}
public Date getFechaInicio() {
    return this.fechaInicio;
}
public void setFechaInicio(Date fechaInicio) {
    this.fechaInicio = fechaInicio;
}
public Date getFechaFinal() {
    return this.fechaFinal;
}
public void setFechaFinal(Date fechaFinal) {
    this.fechaFinal = fechaFinal;
}
public Boolean getHabilitado() {
    return this.habilitado;
}
public void setHabilitado(Boolean habilitado) {
    this.habilitado = habilitado;
}
public Double getPrecio() {
    return this.precio;
}
public void setPrecio(Double precio) {
    this.precio = precio;
}
public Short getMinutos() {
    return this.minutos;
}
public void setMinutos(Short minutos) {
    this.minutos = minutos;
}
@Generated(hash = 1268167600)
private transient Long persona__resolvedKey;
/** To-one relationship, resolved on first access. */
@Generated(hash = 359833273)
public Persona getPersona() {
    Long __key = this.personaId;
    if (persona__resolvedKey == null || !persona__resolvedKey.equals(__key)) {
        final DaoSession daoSession = this.daoSession;
        if (daoSession == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        PersonaDao targetDao = daoSession.getPersonaDao();
        Persona personaNew = targetDao.load(__key);
        synchronized (this) {
            persona = personaNew;
            persona__resolvedKey = __key;
        }
    }
    return persona;
}
/** called by internal mechanisms, do not call yourself. */
@Generated(hash = 1141115150)
public void setPersona(Persona persona) {
    synchronized (this) {
        this.persona = persona;
        personaId = persona == null ? null : persona.getId();
        persona__resolvedKey = personaId;
    }
}
/**
 * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
 * Entity must attached to an entity context.
 */
@Generated(hash = 128553479)
public void delete() {
    if (myDao == null) {
        throw new DaoException("Entity is detached from DAO context");
    }
    myDao.delete(this);
}
/**
 * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
 * Entity must attached to an entity context.
 */
@Generated(hash = 1942392019)
public void refresh() {
    if (myDao == null) {
        throw new DaoException("Entity is detached from DAO context");
    }
    myDao.refresh(this);
}
/**
 * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
 * Entity must attached to an entity context.
 */
@Generated(hash = 713229351)
public void update() {
    if (myDao == null) {
        throw new DaoException("Entity is detached from DAO context");
    }
    myDao.update(this);
}
/** called by internal mechanisms, do not call yourself. */
@Generated(hash = 1909642594)
public void __setDaoSession(DaoSession daoSession) {
    this.daoSession = daoSession;
    myDao = daoSession != null ? daoSession.getCursoDao() : null;
}

}
