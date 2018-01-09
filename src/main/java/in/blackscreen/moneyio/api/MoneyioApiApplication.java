package in.blackscreen.moneyio.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MoneyioApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(MoneyioApiApplication.class, args);

	}

	@GetMapping("/")
	public String view(){
		return "Hello MoneyIO";
	}
}
