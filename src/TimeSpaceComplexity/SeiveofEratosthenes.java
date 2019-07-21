package TimeSpaceComplexity;

import java.util.Arrays;

public class SeiveofEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seiveoferatostheses(10);
	}

	public static void seiveoferatostheses(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int table = 2; table <= n; table++) {
			if (prime[table] == false)
				continue;
			for (int mulp = 2; mulp * table <= n; mulp++)
				prime[mulp * table] = false;
		}
		for (int i = 0; i < n; i++) {
			if (prime[i])
				System.out.println(i);
		}
	}

}
