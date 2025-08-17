import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter elements of array: ");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=-1;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count=arr[i];
					break;
				}
			}if(count!=-1) break;
		}System.out.println("Duplicate Number: "+count);
	}

}
