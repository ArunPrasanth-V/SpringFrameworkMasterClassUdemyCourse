
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DependencyInjectionApplication.class, args);
		
	    BinarySearch search=context.getBean(BinarySearch.class);
	    System.out.println(search.searching(new int[] {1,2,3,4,5,6,7,8,9}));  
	}

}
