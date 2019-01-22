package com.gardener.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用入口
 * @author gardener
 *
 */
@SpringBootApplication
public class HelloServer {

	public static void main(String[] args) {
		SpringApplication.run(HelloServer.class, args);
	}

}
