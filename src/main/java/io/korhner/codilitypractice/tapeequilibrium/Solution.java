package io.korhner.codilitypractice.tapeequilibrium;

public class Solution {
	public int solution(int[] A) {
		long sum = 0;
		for (int x: A) {
			sum += x;
		}
		
		long leftSum = 0;
		long rightSum = sum;
		long minDiff = Integer.MAX_VALUE;
		
		for (int i = 0; i<A.length - 1; i++) {
			leftSum += A[i];
			rightSum -= A[i];
			
			minDiff = Math.min(Math.abs(leftSum - rightSum), minDiff);
		}
		
		return (int) minDiff;
	}
}
