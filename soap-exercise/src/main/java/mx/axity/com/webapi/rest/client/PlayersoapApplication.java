package mx.axity.com.webapi.rest.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "mx.axity.com.webapi")
@EnableJpaRepositories("mx.axity.com.webapi.persistance")
@EntityScan("mx.axity.com.webapi.model")
public class PlayersoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayersoapApplication.class, args);
	}

}
