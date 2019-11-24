import java.util.Scanner;
public class SelectionSort {
	public static void sort() {
		Scanner scanner = new Scanner(System.in);
		int [] arr = new int[5];
		for (int i = 0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		for (int min = 0; min < arr.length - 1; min++) {
			int least = min;
			for (int j = min + 1; j < arr.length; j++) {
			    if (arr[j] < arr[least]) {
					least = j;
				}
			}
			    int tmp = arr[min];
			    arr[min] = arr[least];
			    arr[least] = tmp;
		}
	for (int i = 0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
	}
	public static void main(String[] args) {
		sort();
	}
}