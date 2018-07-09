package io.korhner.codilitypractice.permcheck;

import java.math.BigDecimal;

public class Solution {
	public int solution(int[] A) {
		int[] flags = new int[A.length];
		int toCheck = flags.length;

		for (int number : A) {
			if (number > A.length || flags[number - 1] == 1) {
				return 0;
			}
			toCheck--;
			flags[number - 1] = 1;

		}

		if (toCheck == 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
