package com.murillo.mvc.dao;

import com.murillo.mvc.domain.Departamento;

import java.util.List;

public interface DepartamentoDao {
    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
