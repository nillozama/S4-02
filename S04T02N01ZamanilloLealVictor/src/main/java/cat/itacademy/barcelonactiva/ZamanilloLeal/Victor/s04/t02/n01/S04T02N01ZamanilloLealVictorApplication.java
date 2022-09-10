package cat.itacademy.barcelonactiva.ZamanilloLeal.Victor.s04.t02.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"cat.itacademy.barcelonactiva.ZamanilloLeal.Victor.s04.t02.n01.controllers","cat.itacademy.barcelonactiva.ZamanilloLeal.Victor.s04.t02.n01.model.services"})
@EntityScan("cat.itacademy.barcelonactiva.ZamanilloLeal.Victor.s04.t02.n01.model.domain")
@EnableJpaRepositories("cat.itacademy.barcelonactiva.ZamanilloLeal.Victor.s04.t02.n01.model.repository")
@SpringBootApplication

public class S04T02N01ZamanilloLealVictorApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N01ZamanilloLealVictorApplication.class, args);
	}

}
