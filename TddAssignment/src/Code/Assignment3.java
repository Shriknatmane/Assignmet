package Code;
import java.util.Scanner;
public class Assignment3 {
	


		
		public static boolean match()
		{
			String email="shrikantmane@gmail.com";
			String Password="shri@1231";
			Scanner sc= new Scanner(System.in);
			String str=sc.nextLine();
			String str1=sc.nextLine();
			
			if(email.equals(str) && Password.endsWith(str1)) {
				return true;
				}
			else
			{
				return false;
			}
			
		}
		public static void main(String[] args) {
			System.out.println(Assignment3.match());
		}
}

	


