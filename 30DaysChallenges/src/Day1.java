import java.util.*;
public class Day1 {
	public static void ArrSort(int[] arr){
		int mid=0, low=0, high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[low] = temp;
				low++;
				mid++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				int temp = arr[mid];
				arr[high] = arr[mid];
				arr[high] = temp;
				high--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,2,1,0,2,1,0};
		System.out.println("Unsorted array : "+Arrays.toString(arr));
		ArrSort(arr);
		System.out.println("Sorted array : "+Arrays.toString(arr));
	}
}
