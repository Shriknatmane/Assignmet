package Assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Assignment10mainclass {
	public static void main(String[] args) {
		List<Emp> elist=new ArrayList<Emp>();
		elist.add(new Emp(1,"Shree",10000f));
		elist.add(new Emp(2,"DADA",20000f));
		elist.add(new Emp(3,"akash",15000f));
		elist.add(new Emp(4,"addi",25000f));
		elist.add(new Emp(5,"aday",12000f));
		elist.add(new Emp(6,"shiv",32000f));
		elist.add(new Emp(7,"roit",22000f));
		elist.add(new Emp(8,"parth",21000f));
		elist.add(new Emp(9,"athrava",16000f));
		elist.add(new Emp(10,"sandy",17000f));
		Map<Integer,String> promap=elist.stream().collect(Collectors.toMap(p->p.empid,p->p.empname));
		System.out.println(promap);
		Set<String> empset=elist.stream().map(p->p.empname).collect(Collectors.toSet());
		System.out.println(empset);
	}

}