import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan
public class MainClass {
	@Autowired
	SubClass subClass;
	public static void main(String [] args)
	{
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MainClass.class);
		SubClass subClass=context.getBean(SubClass.class);
		subClass.hello();
		
		context.close();
	}

}
