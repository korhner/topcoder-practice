package io.korhner.codilitypractice.missinginteger;

public class Solution {
	public int solution(int[] A) {
		int[] flags = new int[A.length];
		long sum = (long) A.length * (long) (A.length + 1) / 2l;
		long maxSum = sum;

		for (int num : A) {
			if (num > 0 && num <= A.length && flags[num - 1] == 0) {
				flags[num - 1] = 1;
				sum--;
			}
		}

		for (int i = 0; i < flags.length; i++) {
			if (flags[i] == 0) {
				return i + 1;
			}

		}

		return A.length + 1;
	}
}
