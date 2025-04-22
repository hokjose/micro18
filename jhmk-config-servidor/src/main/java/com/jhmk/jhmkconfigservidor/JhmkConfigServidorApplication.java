package com.jhmk.jhmkconfigservidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class JhmkConfigServidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JhmkConfigServidorApplication.class, args);
	}

}
