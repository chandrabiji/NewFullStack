import java.util.Arrays;
import java.util.Scanner;

public class SingleDimArraySorting {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Array Size ?");
	int size = sc.nextInt();
	int[] arr = new int[size];
	System.out.println("Enter Array Elements ?");
	for(int i=0;i<arr.length;++i) {
		arr[i]=sc.nextInt();
	}
	System.out.println("without sorting array Elements ");
	for(int i=0;i<size;++i) {
		System.out.println(arr[i]);
	}
	Arrays.sort(arr);
	System.out.println("After Sorting Array Elements are");
	for(int i=0;i<size;++i) {
		System.out.println(arr[i]);
	}
	System.out.println("Array Minimum Element =  "+arr[0]);
	System.out.println("Array Maximum Element = "+arr[size-1]);
	System.out.println("2nd Highest Array Element = "+arr[size-2]);
	}

}
