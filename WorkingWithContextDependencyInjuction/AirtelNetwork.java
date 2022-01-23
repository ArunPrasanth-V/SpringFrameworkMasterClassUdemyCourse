import javax.inject.Named;

@Named("airtel")
public class AirtelNetwork implements HomeNetwork{
	public void connect()
	{
		System.out.println("Home Network Connected to BSNL Service!!");
	}

}
