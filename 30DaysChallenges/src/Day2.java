import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		System.out.print("Enter the elements in an array: ");
		int[] arr = new  int[n];
		int actualsum = 0;
		int expectedvalue = n*(n+1)/2;
		for(int i=0;i<n-1;i++) {
			arr[i] = sc.nextInt();
			actualsum+=arr[i];
		}
		int missing = expectedvalue-actualsum;
		System.out.println("Missing Integer: "+missing);
	}

}
