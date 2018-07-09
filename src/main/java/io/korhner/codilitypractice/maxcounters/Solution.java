package io.korhner.codilitypractice.maxcounters;

import java.util.Arrays;

public class Solution {
	public static int[] solution(int N, int[] A) {
		//preprocess, find last max
		int lastMax = A.length;
		for (int i = A.length-1; i>=0; i--) {
			if ()
		}
		
		
		
		int[] counters = new int[N];
		int currentMax = 0;
		for (int num : A) {
			if (num > N) {
				for (int i = 0; i < N; i++) {
					counters[i] = currentMax;
				}
			} else {
				counters[num-1]++;
				currentMax = Math.max(currentMax, counters[num-1]);
			}
		}

		return counters;
	}

	public static void main(String[] args) {
		Arrays.toString(solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 }));
	}
}
