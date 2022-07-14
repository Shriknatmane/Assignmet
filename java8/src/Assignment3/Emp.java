package Assignment3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Emp {
	public Emp(int i, String string, float f) {
		
	}

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Shree");
		list.add("DADA");
		list.add("deepak");
		list.add("akash");
		list.add("aniket");
		
		List<String>emp=list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(emp);
	}
}
