package TimeSpaceComplexity;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] ar = { 10, 20, 30, 40, 50 };
		// int[] arr = { 5, 15, 30, 45, 60, 70, 80 };
		//
		// int[] ans = merge2sortedarryas(ar, arr);
		//
		// for (int val : ans)
		// System.out.print(val + " ");
		int[] ar = { 20, 40, 10, 50, 45, 6, 80 };

		int[] ans = mergesort(ar, 0, ar.length - 1);
		for (int val : ans)
			System.out.print(val + " ");
	}

	public static int[] merge2sortedarryas(int ar[], int arr[]) {
		int[] merged = new int[ar.length + arr.length];
		int i = 0, j = 0, k = 0;
		while (i < ar.length && j < arr.length) {
			if (ar[i] <= arr[j]) {
				merged[k] = ar[i];
				i++;
				k++;
			} else {
				merged[k] = arr[j];
				j++;
				k++;
			}

		}
		while (i < ar.length) {
			merged[k] = ar[i];
			i++;
			k++;
		}
		while (j < arr.length) {
			merged[k] = arr[j];
			j++;
			k++;
		}
		return merged;
	}

	public static int[] mergesort(int[] ar, int low, int hi) {
		if (low == hi) {
			int br[] = new int[1];
			br[0] = ar[low];
			return br;
		}
		int mid =( low + hi) / 2;
	
		int[] firsthlf = mergesort(ar, low, mid);
		int[] secondhlf = mergesort(ar, mid + 1, hi);
		int[] arr = merge2sortedarryas(firsthlf, secondhlf);
		return arr;

	}
}
