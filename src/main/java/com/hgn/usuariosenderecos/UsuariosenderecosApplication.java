package com.hgn.usuariosenderecos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UsuariosenderecosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariosenderecosApplication.class, args);
	}

}
