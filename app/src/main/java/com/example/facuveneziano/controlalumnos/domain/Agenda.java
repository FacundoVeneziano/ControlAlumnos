package com.example.facuveneziano.controlalumnos.domain;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Index;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.DaoException;

@Entity(indexes = {
        @Index(value = "id", unique = true),
        @Index(value = "personaId,cursoId,dia", unique = true),
        @Index(value = "personaId"),
        @Index(value = "cursoId"),
        @Index(value = "saldo")
})
public class Agenda {
    @org.greenrobot.greendao.annotation.Id
    private Long id;

    private Long personaId;
    @ToOne(joinProperty = "personaId")
    private Persona persona;

    private Long cursoId;
    private Date dia;
    private Boolean habilitado;
    private Date fechaIngreso;
    private Boolean asistencia;
    private Double importe;
    private Double saldo;

/** Used to resolve relations */
@Generated(hash = 2040040024)
private transient DaoSession daoSession;

/** Used for active entity operations. */
@Generated(hash = 1497564739)
private transient AgendaDao myDao;
@Generated(hash = 2044374489)
public Agenda(Long id, Long personaId, Long cursoId, Date dia,
        Boolean habilitado, Date fechaIngreso, Boolean asistencia,
        Double importe, Double saldo) {
    this.id = id;
    this.personaId = personaId;
    this.cursoId = cursoId;
    this.dia = dia;
    this.habilitado = habilitado;
    this.fechaIngreso = fechaIngreso;
    this.asistencia = asistencia;
    this.importe = importe;
    this.saldo = saldo;
}
@Generated(hash = 337343201)
public Agenda() {
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
public Long getCursoId() {
    return this.cursoId;
}
public void setCursoId(Long cursoId) {
    this.cursoId = cursoId;
}
public Date getDia() {
    return this.dia;
}
public void setDia(Date dia) {
    this.dia = dia;
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
public Boolean getAsistencia() {
    return this.asistencia;
}
public void setAsistencia(Boolean asistencia) {
    this.asistencia = asistencia;
}
public Double getImporte() {
    return this.importe;
}
public void setImporte(Double importe) {
    this.importe = importe;
}
public Double getSaldo() {
    return this.saldo;
}
public void setSaldo(Double saldo) {
    this.saldo = saldo;
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
@Generated(hash = 1302045406)
public void __setDaoSession(DaoSession daoSession) {
    this.daoSession = daoSession;
    myDao = daoSession != null ? daoSession.getAgendaDao() : null;
}

}
