package com.adriendr.dota2.dota2privatelearning;

import com.adriendr.dota2.dota2privatelearning.game.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = "com.adriendr.dota2.dota2privatelearning")
public class Dota2PrivateLearningApplication implements CommandLineRunner{

	@Autowired
	private GameService gameService;

	public static void main(String[] args) {
		SpringApplication.run(Dota2PrivateLearningApplication.class, args);
	}

	@Override
	public void run(String... args){
		try {
			gameService.loadAndSaveGame(args[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	//useful for debug, print elastic search details
	private void printElasticSearchInfo() {

		System.out.println("--ElasticSearch--");
//		Client client = es.getClient();
//		Map<String, String> asMap = client.settings().getAsMap();

//		asMap.forEach((k, v) -> {
//			System.out.println(k + " = " + v);
//		});
		System.out.println("--ElasticSearch--");
	}
}
