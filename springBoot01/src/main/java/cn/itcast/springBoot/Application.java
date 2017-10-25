package cn.itcast.springBoot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		/*SpringApplication.run(Application.class, args);*/
		
		SpringApplication springApplication = new SpringApplication(Application.class);
		
		springApplication.setBannerMode(Mode.OFF);
		System.out.print("wq");
		springApplication.run(args);
	}
}
