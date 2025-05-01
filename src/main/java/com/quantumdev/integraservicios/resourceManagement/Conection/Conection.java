package com.quantumdev.integraservicios.resourceManagement.Conection;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import jakarta.transaction.Transactional;

public class Conection {
    private static Conection instance;
    private JdbcTemplate template;

    private Conection() {
        DriverManagerDataSource data = new DriverManagerDataSource();
        data.setDriverClassName("org.postgresql.Driver");
        data.setUrl("");
        data.setUsername("");
        data.setPassword("");

        this.template = new JdbcTemplate();
    }

    @Transactional
    public List<Map<String, Object>> SelectQuery(String sql) {
        try {
            List<Map<String, Object>> result = this.template.queryForList(sql);
            return result;
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

    public void ExecuteQuery(String sql) {
        try {
            this.template.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

    public static Conection getInstance() {
        if(instance == null) {
            instance = new Conection();
        }
        return instance;
    }
}
