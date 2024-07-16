import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int n = 0;
		
		while (true) {
			n = sc.nextInt();
			if (D>n) {
				D+=n;
			} else {
				System.out.println(D);
				break;
			}
		}
	}
}
