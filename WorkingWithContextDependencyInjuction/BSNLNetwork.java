import javax.inject.Named;


@Named("bsnl")
public class BSNLNetwork implements HomeNetwork{
	public void connect()
	{
		System.out.println("Home Network Connected to BSNL Service!!");
	}

}
