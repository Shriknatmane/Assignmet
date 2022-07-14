package Assignment7;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assign7Main {

	public static void main(String[]args)
	{
			
			List<Assign7Evenprice> evenprice= new ArrayList<Assign7Evenprice>();
			
			evenprice.add(new Assign7Evenprice(1,"pen",15f));
			evenprice.add(new Assign7Evenprice(2,"pencil",10f));
			evenprice.add(new Assign7Evenprice(3,"pant",600));
			evenprice.add(new Assign7Evenprice(4,"shirt",700f));
			List<Float> eprice=evenprice.stream().filter(p->p.productprice%2==0).map(p->p.productprice).collect(Collectors.toList());
			System.out.println(eprice);
		}
		

	}
	


