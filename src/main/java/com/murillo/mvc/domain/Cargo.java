package com.murillo.mvc.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long>{

    // Set para o nome da coluna, obrigatoriedade, unica e tamanho
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    // Referencia a chave estrangeira
    @ManyToOne
    // Nome da chave estrangeira no BD
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
