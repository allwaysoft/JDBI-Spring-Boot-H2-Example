package com.example.demo;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import org.jdbi.v3.core.h2.H2DatabasePlugin;

@Configuration
public class AppConfig {

    @Bean
    public Jdbi jdbi(DataSource dataSource) {
        return Jdbi.create(dataSource)
                .installPlugin(new H2DatabasePlugin())
                .installPlugin(new SqlObjectPlugin());
    }

}
