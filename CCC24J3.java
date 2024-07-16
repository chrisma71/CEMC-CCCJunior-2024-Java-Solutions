import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] score = new int[N];
		int largest = 0;
		int secondLargest = 0;
		int thirdLargest = 0;
		int count = 0;
		
		for (int i =0; i<N;i++) {
			score[i] = sc.nextInt();
		}
		
		for (int i =0; i<N;i++) {
			if (score[i]>largest) {
				largest = score[i];
			}
		}
		
		for (int i =0; i<N;i++) {
			if (score[i] > secondLargest && score[i]!= largest) {
				secondLargest=score[i];
			}
		}
		
		for (int i =0; i<N;i++) {
			if (score[i] > thirdLargest && score[i]!= largest&&score[i]!=secondLargest) {
				thirdLargest=score[i];
			}
		}
	
		for (int i =0; i<N;i++) {
			if (score[i] == thirdLargest) {
				count++;
			}
        }
		System.out.println(thirdLargest + " " + count);
	}
}
