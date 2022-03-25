package com.murillo.mvc.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntity <ID extends Serializable> implements Serializable{

    // O atributo Id é extendido para as outras classes-filho
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AbstractEntity<?> that = (AbstractEntity<?>) obj;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "id=" + id;
    }
}
