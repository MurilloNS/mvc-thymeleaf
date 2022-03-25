package com.murillo.mvc.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{

    // Set para o nome da coluna, obrigatoriedade, unica e tamanho
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    // Mapeando o atributo e definindo o atributo que está fazendo parte do lado forte da relação
    @OneToMany(mappedBy = "departamento")
    // Lista para os cargos
    private List<Cargo> cargos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }
}
