package br.com.fiap.api.dao;

import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class CondominioDao {
    private final DataSource dataSource;
    public CondominioDao(DataSource dataSource) {
    this.dataSource = dataSource;
    }

}

