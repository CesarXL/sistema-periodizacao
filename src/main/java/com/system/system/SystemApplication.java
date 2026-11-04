package com.system.system;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan(basePackages = "com.system.system.entity")
public class SystemApplication {

	public static void main(String[] args) {

        SpringApplication.run(SystemApplication.class, args);
	}
    @Bean
    CommandLineRunner verificarEntidades(EntityManagerFactory emf) {
        return args -> {
            System.out.println("===== ENTIDADES RECONHECIDAS =====");

            emf.getMetamodel().getEntities().forEach(entity ->
                    System.out.println(entity.getName())
            );

            System.out.println("==================================");
        };
    }

}
