import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;


@Named
public class ArunHomeNetwork {
	@Inject()
	@Qualifier("bsnl")
	HomeNetwork connection;
	ArunHomeNetwork()
	{
		System.out.println("Arun Home is Connected to Internet Now!!");
	}

}
