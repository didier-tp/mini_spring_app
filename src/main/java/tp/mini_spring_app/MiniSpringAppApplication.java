package tp.mini_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniSpringAppApplication.class, args);
		System.out.println("http://localhost:8181");
	}

}
