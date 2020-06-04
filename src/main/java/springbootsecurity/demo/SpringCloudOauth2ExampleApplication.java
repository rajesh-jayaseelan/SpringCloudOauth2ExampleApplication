package springbootsecurity.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ref url - https://www.youtube.com/watch?v=D2FuRIL95kk 
 * Spring Boot application starter class
 */
@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SpringCloudOauth2ExampleApplication {

	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi " + principal.getName() + " welcome to Spring Cloud OAuth2 Example Application!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOauth2ExampleApplication.class, args);
	}
}
