package com.example.facuveneziano.controlalumnos.domain;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Index;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.DaoException;

@Entity(indexes = {
        @Index(value = "id", unique = true),
        @Index(value = "documento", unique = true),
        @Index(value = "tipoPersonaId"),
        @Index(value = "apellido"),
        @Index(value = "nombre"),
        @Index(value = "fechaIngreso")
})
public class Persona {
    @org.greenrobot.greendao.annotation.Id
    private Long id;

    private Long tipoPersonaId;
    @ToOne(joinProperty = "tipoPersonaId")
    private TipoPersona tipoPersona;

    private Long documento;
    private String nombre;
    private String apellido;
    private Boolean habilitado;
    private Date fechaIngreso;
    private Date fechaNacimiento;
    private Long celular;
    private String email;

/** Used to resolve relations */
@Generated(hash = 2040040024)
private transient DaoSession daoSession;

/** Used for active entity operations. */
@Generated(hash = 709859051)
private transient PersonaDao myDao;
@Generated(hash = 1282259774)
public Persona(Long id, Long tipoPersonaId, Long documento, String nombre,
        String apellido, Boolean habilitado, Date fechaIngreso,
        Date fechaNacimiento, Long celular, String email) {
    this.id = id;
    this.tipoPersonaId = tipoPersonaId;
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;
    this.habilitado = habilitado;
    this.fechaIngreso = fechaIngreso;
    this.fechaNacimiento = fechaNacimiento;
    this.celular = celular;
    this.email = email;
}
@Generated(hash = 1270265349)
public Persona() {
}
public Long getId() {
    return this.id;
}
public void setId(Long id) {
    this.id = id;
}
public Long getTipoPersonaId() {
    return this.tipoPersonaId;
}
public void setTipoPersonaId(Long tipoPersonaId) {
    this.tipoPersonaId = tipoPersonaId;
}
public Long getDocumento() {
    return this.documento;
}
public void setDocumento(Long documento) {
    this.documento = documento;
}
public String getNombre() {
    return this.nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellido() {
    return this.apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public Boolean getHabilitado() {
    return this.habilitado;
}
public void setHabilitado(Boolean habilitado) {
    this.habilitado = habilitado;
}
public Date getFechaIngreso() {
    return this.fechaIngreso;
}
public void setFechaIngreso(Date fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
}
public Date getFechaNacimiento() {
    return this.fechaNacimiento;
}
public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}
public Long getCelular() {
    return this.celular;
}
public void setCelular(Long celular) {
    this.celular = celular;
}
public String getEmail() {
    return this.email;
}
public void setEmail(String email) {
    this.email = email;
}
@Generated(hash = 1486057812)
private transient Long tipoPersona__resolvedKey;
/** To-one relationship, resolved on first access. */
@Generated(hash = 1519184797)
public TipoPersona getTipoPersona() {
    Long __key = this.tipoPersonaId;
    if (tipoPersona__resolvedKey == null
            || !tipoPersona__resolvedKey.equals(__key)) {
        final DaoSession daoSession = this.daoSession;
        if (daoSession == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        TipoPersonaDao targetDao = daoSession.getTipoPersonaDao();
        TipoPersona tipoPersonaNew = targetDao.load(__key);
        synchronized (this) {
            tipoPersona = tipoPersonaNew;
            tipoPersona__resolvedKey = __key;
        }
    }
    return tipoPersona;
}
/** called by internal mechanisms, do not call yourself. */
@Generated(hash = 1659518032)
public void setTipoPersona(TipoPersona tipoPersona) {
    synchronized (this) {
        this.tipoPersona = tipoPersona;
        tipoPersonaId = tipoPersona == null ? null : tipoPersona.getId();
        tipoPersona__resolvedKey = tipoPersonaId;
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
@Generated(hash = 1301839720)
public void __setDaoSession(DaoSession daoSession) {
    this.daoSession = daoSession;
    myDao = daoSession != null ? daoSession.getPersonaDao() : null;
}

}
