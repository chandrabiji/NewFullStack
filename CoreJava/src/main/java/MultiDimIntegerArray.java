import java.util.Scanner;

public class MultiDimIntegerArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No Of Rows ?");
		int rows = sc.nextInt();
		System.out.println("Enter No Of Cols ?");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array Elements are");
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Each Row Sum Value?");
		for (int i = 0; i < rows; ++i) {
			int sum = 0;
			for (int j = 0; j < cols; ++j) {
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
			}
			System.out.println(" = " + sum);
		}
		System.out.println("Right Elements sum");
		int sum = 0;
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				if (i == j) {
					System.out.print(arr[i][j] + " ");
					sum += arr[i][j];
				}
			}
		
		}
		System.out.println(" = " + sum);

	}

}
