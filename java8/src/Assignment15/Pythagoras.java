package Assignment15;

public class Pythagoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {7,9,5,12,13,4,8,55,99};
			int temp=0;
			for(int i=0;i<a.length-3;i++) {
				int b=a[i]*a[i];
				int c=a[i+1]*a[i+1];
				int d=a[i+2]*a[i+2];
				if (b==c+d||c==b+d||d==b+c){
					temp++;
					System.out.println("Pythagoras Theorem satisfying Pair="+a[i]+" "+a[i+1]+" "+a[i+2]);	
				}
			}
			
			System.out.println("Total Number Of Pairs : "+temp);
		}
		
	}


