package com.rabbitmq.rabbitMQDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rabbitmq")
public class RabbitMqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqDemoApplication.class, args);

	}

}
