package Assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Assign6Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			List<Assignment6ItemTest> ilist=new ArrayList<Assignment6ItemTest>();
			ilist.add(new Assignment6ItemTest(1,"pen",20f));
			ilist.add(new Assignment6ItemTest(2,"pencil",10f));
			ilist.add(new Assignment6ItemTest(3,"pant",600f));
			ilist.add(new Assignment6ItemTest(5,"mobile",5000f));
			ilist.add(new Assignment6ItemTest(6,"shoes",700f));
			
			double avgprice=ilist.stream().collect(Collectors.averagingDouble(s1->s1.itemprice));
			System.out.println("avg price:"+avgprice);
			List<Float> ilist1=ilist.stream().filter(p -> p.itemprice>=avgprice).map(p->p.itemprice).collect(Collectors.toList());
			
			System.out.println(ilist1);
		}
		}