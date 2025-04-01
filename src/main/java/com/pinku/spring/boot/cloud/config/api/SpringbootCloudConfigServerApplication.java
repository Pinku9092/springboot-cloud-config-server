package com.pinku.spring.boot.cloud.config.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// https://www.youtube.com/watch?v=kaNHT6_MV-Q&t=1376s

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SpringbootCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudConfigServerApplication.class, args);
	}

}
