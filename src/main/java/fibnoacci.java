import java.io.InputStream;
import java.util.Scanner;

public class fibnoacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int a = 1;
		int b = 1;
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum = a + b;
			System.out.println(a+","+b+","+sum);
			a = b;
			b = sum;	
		}
		System.out.println(sum);

	}

}
