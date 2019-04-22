package com.example.encrypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EncryptApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext context = SpringApplication.run(EncryptApplication.class, args);

        final DatabaseProperties databaseProperties = (DatabaseProperties) context.getBean("databaseProperties");
        System.out.println("dbPassword: " + databaseProperties.getDbPassword());

        final SftpProperties sftpProperties = (SftpProperties) context.getBean("sftpProperties");
        System.out.println("sftpPassword: " + sftpProperties.getSftpPassword());
    }
}
