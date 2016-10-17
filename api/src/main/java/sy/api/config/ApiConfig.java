package sy.api.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import sy.dao.config.DaoConfig;
import sy.service.config.ServiceConfig;

@EnableAutoConfiguration
@ComponentScan("sy.api")
@Import(value={DaoConfig.class,ServiceConfig.class})
public class ApiConfig {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiConfig.class, args);
	}

}
