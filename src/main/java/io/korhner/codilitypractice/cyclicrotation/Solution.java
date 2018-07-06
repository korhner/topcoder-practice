package io.korhner.codilitypractice.cyclicrotation;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] A, int K) {
		if (A == null || A.length == 0) {
			return A;
		}

		int realK = K % A.length;

		if (realK == 0) {
			return A;
		}

		reverseArray(A, 0, A.length - 1);
		reverseArray(A, 0, realK - 1);
		reverseArray(A, realK, A.length - 1);
		return A;
	}

	private void reverseArray(int[] array, int start, int end) {
		for (int i = 0; i <= (end - start) / 2; i++) {
			int leftValue = array[i + start];
			array[i + start] = array[end - i];
			array[end - i] = leftValue;
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String a = Arrays.toString(s.solution(new int[] { 3, 8, 9, 7, 6 }, 6));
		System.out.println(a);
	}
}
