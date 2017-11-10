package com.greenfoxacademy.peertopeerchat;

import com.greenfoxacademy.peertopeerchat.model.ChatLog;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class PeertopeerchatApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PeertopeerchatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
