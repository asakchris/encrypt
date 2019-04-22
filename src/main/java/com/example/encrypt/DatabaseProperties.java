package com.example.encrypt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseProperties {
    @Value("${app.db.password}")
    private String dbPassword;

    public String getDbPassword() {
        return dbPassword;
    }
}
