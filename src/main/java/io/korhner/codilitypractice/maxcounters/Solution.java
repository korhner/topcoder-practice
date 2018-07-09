package io.korhner.codilitypractice.maxcounters;

import java.util.Arrays;

public class Solution {
	public static int[] solution(int N, int[] A) {

		int[] counters = new int[N];
		int currentMax = 0;
		int currentMin = 0;
		for (int num : A) {
			if (num > N) {
				currentMin = currentMax;
			} else {
				if (counters[num - 1] < currentMin) {
					counters[num - 1] = currentMin + 1;
				} else {
					counters[num - 1]++;
				}
				currentMax = Math.max(currentMax, counters[num - 1]);
			}
		}
		
		for (int i = 0; i<counters.length; i++) {
			if (counters[i] < currentMin) {
				counters[i] = currentMin;
			}
		}
		return counters;
	}

	public static void main(String[] args) {
		Arrays.toString(solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 }));
	}
	
	//5, [3, 4, 4, 6, 1, 4, 4]
}
