package TimeSpaceComplexity;

public class QuickSort {
	public static void main(String[] args) {
		int ar[] = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
		Quicksort(ar, 0, ar.length - 1);
		for (int var : ar)
			System.out.print(var + " ");
	}

	public static void Quicksort(int ar[], int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		int piviot = ar[mid];
		int low = left;
		int hig = right;
		while (low <= hig) {
			while (ar[low] < piviot) {
				low++;
			}
			while (ar[hig] > piviot) {
				hig--;
			}
			if (low <= hig) {
				int temp = ar[low];
				ar[low] = ar[hig];
				ar[hig] = temp;
				low++;
				hig--;
			}

		}
		Quicksort(ar, left, hig);
		Quicksort(ar, low, right);

	}

}
