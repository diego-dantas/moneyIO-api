package in.blackscreen.moneyio.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import in.blackscreen.moneyio.api.utils.PasswordUtils;

@RestController
@SpringBootApplication
public class MoneyioApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(MoneyioApiApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String passwordEncoder = PasswordUtils.setEncod("123456");
			System.out.println("Senha encoder " + passwordEncoder);
			
			passwordEncoder = PasswordUtils.setEncod("123456");
			System.out.println("Senha encoder 2 " + passwordEncoder);
			
			System.out.println("Senha válida " + PasswordUtils.valPassword("123456", passwordEncoder));
		};
	}
}
