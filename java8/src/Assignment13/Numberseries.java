package Assignment13;

public class Numberseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 ,21,22,23,24,25,26,27,28,29,30};
		for(int i=0;i<a.length-1;i++) {
			if (i<=4) {
				String s=a[i]+"-"+(a[i+2]);
				System.out.println(s+",");
				i=i+2;
			}else if(i<=10) {
				String s=a[i]+"-"+(a[i+4]);
				System.out.println(s+",");
				i=i+4;
				
			}else {
				String s=a[i]+"-"+a[i+3];
				System.out.println(s);
				System.out.println("");
				i=i+4;
			}
		}	

	}
}
