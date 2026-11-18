package in.strike.curdSpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CurdSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdSpringBootDemoApplication.class, args);
		System.out.println("Hello World ");

	}

}
