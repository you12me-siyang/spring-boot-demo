package sy.api.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("sy.api")
public class ApiConfig {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiConfig.class, args);
	}

}
