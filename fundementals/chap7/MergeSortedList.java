import java.util.Scanner;

public class MergeSortedList {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter the two arrays.");
		int[] list = createList();
		int[] list2 = createList();
		//for new sorted list.
		int[] mergedList = new int[list.length + list2.length];
		mergedList = merge(list, list2);
		for (int e : mergedList) System.out.print(e + " ");
		System.out.println("\n");
	}
	public static int[] merge(int[] list, int[] list2) {
		int[] list0 = new int[list.length + list2.length];
		System.arraycopy(list, 0, list0, 0, list.length);
		System.arraycopy(list2, 0, list0, list.length, list2.length);
		java.util.Arrays.sort(list0);
		return list0;
	}
	public static int[] createList() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] list = new int[input.nextInt()];
		for (int i = 0; i < list.length; i++) list[i] = input.nextInt();
		return list;
	}
}
