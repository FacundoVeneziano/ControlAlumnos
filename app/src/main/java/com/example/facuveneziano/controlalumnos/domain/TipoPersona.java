package com.example.facuveneziano.controlalumnos.domain;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Generated;

@Entity(indexes = {
        @Index(value = "id", unique = true),
        @Index(value = "codigo", unique = true),
        @Index(value = "descripcion")
})
public class TipoPersona {
    @org.greenrobot.greendao.annotation.Id
    private Long id;

    private Integer codigo;

    private String descripcion;

@Generated(hash = 974935294)
public TipoPersona(Long id, Integer codigo, String descripcion) {
    this.id = id;
    this.codigo = codigo;
    this.descripcion = descripcion;
}

@Generated(hash = 1052507042)
public TipoPersona() {
}

public Long getId() {
    return this.id;
}

public void setId(Long id) {
    this.id = id;
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


}