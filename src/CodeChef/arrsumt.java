package CodeChef;

public class arrsumt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

	public int[] twoSum(int[] nums, int target) {
		int ar[] = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					ar[0] = i;
					ar[1] = j;
				}

			}
		}
		return ar;
	}