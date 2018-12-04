package com.example.facuveneziano.controlalumnos.domain;

import android.content.Intent;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(indexes = {
        @Index(value = "id", unique = true),
        @Index(value = "codigo", unique = true),
        @Index(value = "precio"),
})
public class Materia {
    @org.greenrobot.greendao.annotation.Id
    private Long id;

    private Long personaId;
    @ToOne(joinProperty = "personaId")
    private Persona persona;

    private Integer codigo;
    private String descripcion;
    private Date fechaIngreso;
    private Boolean habilitado;
    private Double precio;

/** Used to resolve relations */
@Generated(hash = 2040040024)
private transient DaoSession daoSession;

/** Used for active entity operations. */
@Generated(hash = 854471744)
private transient MateriaDao myDao;
@Generated(hash = 1444876303)
public Materia(Long id, Long personaId, Integer codigo, String descripcion,
        Date fechaIngreso, Boolean habilitado, Double precio) {
    this.id = id;
    this.personaId = personaId;
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.fechaIngreso = fechaIngreso;
    this.habilitado = habilitado;
    this.precio = precio;
}
@Generated(hash = 1335119846)
public Materia() {
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
public Integer getCodigo() {
    return this.codigo;
}
public void setCodigo(Integer codigo) {
    this.codigo = codigo;
}
public String getDescripcion() {
    return this.descripcion;
}
public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}
public Date getFechaIngreso() {
    return this.fechaIngreso;
}
public void setFechaIngreso(Date fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
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
@Generated(hash = 2095101660)
public void __setDaoSession(DaoSession daoSession) {
    this.daoSession = daoSession;
    myDao = daoSession != null ? daoSession.getMateriaDao() : null;
}
}
