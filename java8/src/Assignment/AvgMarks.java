package Assignment;
import java.util.ArrayList;
import java.util.Scanner;

public class AvgMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,avg;
		System.out.println("Enter the matchs marks");
		int mth=sc.nextInt();
		System.out.println("Enter the phy marks");
		int phy=sc.nextInt();
		System.out.println("Enter the chemestry marks");
		int chy=sc.nextInt();
		System.out.println("Enter the biology marks");
		int bio=sc.nextInt();
		System.out.println("Enter the English marks ");
		int eng=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(mth);
		list.add(phy);
		list.add(chy);
		list.add(bio);
		list.add(eng);
		for(int i=0;i<list.size();i++)
		
			sum=sum+list.get(i);
		avg=sum/list.size();
		
		System.out.println("Sum of avrage is "+avg);

	}

}
