import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		double divisor, divident, sum;
		int loop_count;

		Scanner sc = new Scanner(System.in);
		divisor = 1.0;
		divident = 4.0;
		sum = 0.0;
		System.out.print("¹Ýº¹È½¼ö:");
		loop_count = sc.nextInt();

		while (loop_count > 0) {
			sum = sum + divident / divisor;
			divident = -1.0 * divident;
			divisor = divisor + 2;
			loop_count--;
		}
		System.out.println("Pi = " + sum);
	}
}