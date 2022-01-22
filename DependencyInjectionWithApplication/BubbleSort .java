import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bubble")
@Primary
public class BubbleSort implements SortRule 
{
	public int[] sort(int[] arr)
	{
		System.out.println("Performing BubbleSort");
		//BubbleSort Algorithm
		return arr;
	}

}
