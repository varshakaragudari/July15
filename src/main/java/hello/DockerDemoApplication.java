package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DockerDemoApplication {

	@RequestMapping("/message")
	  public String home() {
	    return "Hello Docker World";
	  }

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
