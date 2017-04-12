package com.panda.distributed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer //开启配置服务器的支持
@EnableEurekaClient //开启作为Eureka Server客户端的支持
public class DistributedConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedConfigApplication.class, args);
	}
}
