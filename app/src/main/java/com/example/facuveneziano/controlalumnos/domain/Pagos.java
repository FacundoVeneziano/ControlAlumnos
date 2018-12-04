package com.example.facuveneziano.controlalumnos.domain;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.ToOne;
import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(indexes = {
        @Index(value = "id", unique = true),
        @Index(value = "monto", unique = true)
})
public class Pagos {
    @org.greenrobot.greendao.annotation.Id
    private Long id;

    private Long personaId;
    @ToOne(joinProperty = "personaId")
    private Persona persona;

    private Long agenda;
    private Date fechaIngreso;
    private Double monto;
    private Boolean habilitado;

/** Used to resolve relations */
@Generated(hash = 2040040024)
private transient DaoSession daoSession;

/** Used for active entity operations. */
@Generated(hash = 297385570)
private transient PagosDao myDao;
@Generated(hash = 32467224)
public Pagos(Long id, Long personaId, Long agenda, Date fechaIngreso,
        Double monto, Boolean habilitado) {
    this.id = id;
    this.personaId = personaId;
    this.agenda = agenda;
    this.fechaIngreso = fechaIngreso;
    this.monto = monto;
    this.habilitado = habilitado;
}
@Generated(hash = 2101791316)
public Pagos() {
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
public Long getAgenda() {
    return this.agenda;
}
public void setAgenda(Long agenda) {
    this.agenda = agenda;
}
public Date getFechaIngreso() {
    return this.fechaIngreso;
}
public void setFechaIngreso(Date fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
}
public Double getMonto() {
    return this.monto;
}
public void setMonto(Double monto) {
    this.monto = monto;
}
public Boolean getHabilitado() {
    return this.habilitado;
}
public void setHabilitado(Boolean habilitado) {
    this.habilitado = habilitado;
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
@Generated(hash = 880450588)
public void __setDaoSession(DaoSession daoSession) {
    this.daoSession = daoSession;
    myDao = daoSession != null ? daoSession.getPagosDao() : null;
}



}
