package io.korhner.codilitypractice.countdiv;

public class Solution {
	public static int solution(int A, int B, int K) {

		long solution = 0;
		if (A == 0 || B == 0) {
			solution++;
		}

		if (K > B) {
			return (int) solution;
		}

		// calulate left
		long left;
		if (K < A) {
			long div = A / K;
			left = div * K;
			if (left < A) {
				left += K;
			}
		} else {
			left = K;
		}

		// calculate right
		long right;
		long div = B / K;
		right = div * K;
		if (right + K <= B) {
			right += K;
		}

		solution += (right - left) / K + 1;

		return (int) solution;
	}
	
	public static void main(String[] args) {
		solution(0, 2000000000, 2000000000);
	}
}
