import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	@Autowired
	@Qualifier("quick")
	SortRule bubbleSort;

	public int searching(int[] arr)
	{
		bubbleSort.sort(arr);
		return 3;
	}
	
	

}
