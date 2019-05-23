package com.example.sqlite.demosqlite.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {

    @Value("${spring.local.data-source.driver-class-name}")
    private String driverClassName;

    @Value("${spring.local.data-source.url}")
    private String url;


    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(this.driverClassName);
        dataSourceBuilder.url(this.url);
        return dataSourceBuilder.build();
    }
}
