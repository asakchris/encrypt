package com.example.encrypt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SftpProperties {
    @Value("${app.sftp.password}")
    private String sftpPassword;

    public String getSftpPassword() {
        return sftpPassword;
    }
}
