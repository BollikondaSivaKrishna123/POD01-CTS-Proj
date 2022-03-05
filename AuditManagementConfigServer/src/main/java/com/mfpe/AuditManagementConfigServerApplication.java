package com.mfpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AuditManagementConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditManagementConfigServerApplication.class, args);
	}

}
