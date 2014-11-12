import java.util.Scanner;
public class inwords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] b = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		
		Scanner numb=new Scanner(System.in);
		
		System.out.println("enter a three digit number: ");
		int n=numb.nextInt();
		
		int d1=0,d2=0,d3=0;
		while(n!=0)
		{
			d3=n%10;
			n=n/10;
			d2=n%10;
			n=n/10;
			d1=n%10;
			n=n/10;
		}
		System.out.println("In words:");
		if(d3==0)
			System.out.print(a[d1]+" hundred and "+b[d2]);
		else
			System.out.print(a[d1]+" hundred and "+b[d2]+" "+a[d3]);
		
		
		
		
	}

}
