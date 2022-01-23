import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DependencyInjectionApplication.class, args);
		
		 ArunHomeNetwork network=context.getBean( ArunHomeNetwork.class);
		 network.connection.connect();
	}
	@PostConstruct
	public void postConstruct()
	{
		System.out.println("post component is called AfterConstructing Bean!");
	
	}
	@PreDestroy
	public void preDestroy()
	{
		System.out.println("Before Destroying Bean this method is Called?");
	}
	
}
