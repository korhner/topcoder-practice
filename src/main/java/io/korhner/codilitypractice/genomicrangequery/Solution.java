package io.korhner.codilitypractice.genomicrangequery;

public class Solution {
	public static int[] solution(String S, int[] P, int[] Q) {

		int[][] prefix = new int[4][S.length()];

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);

			if (i == 0) {
				prefix['A'][i] = (c == 'A' ? 1 : 0);
				prefix['C'][i] = (c == 'C' ? 1 : 0);
				prefix['G'][i] = (c == 'G' ? 1 : 0);
				prefix['T'][i] = (c == 'T' ? 1 : 0);
			} else {
				prefix['A'][i] = prefix['A'][i - 1] + (c == 'A' ? 1 : 0);
				prefix['C'][i] = prefix['C'][i - 1] + (c == 'C' ? 1 : 0);
				prefix['G'][i] = prefix['G'][i - 1] + (c == 'G' ? 1 : 0);
				prefix['T'][i] = prefix['T'][i - 1] + (c == 'T' ? 1 : 0);
				
			}
		}

		int[] solution = new int[P.length];
		for (int i = 0; i < P.length; i++) {
			int a = prefix[0][Q[i]];
			int b = prefix[1][Q[i]];
			int c = prefix[2][Q[i]];

			if (P[i] > 0) {
				a -= prefix[0][P[i] - 1];
				b -= prefix[1][P[i] - 1];
				c -= prefix[2][P[i] - 1];
			}

			if (a > 0) {
				solution[i] = 1;
			} else if (b > 0) {
				solution[i] = 2;
			} else if (c > 0) {
				solution[i] = 3;
			} else {
				solution[i] = 4;
			}
		}

		return solution;
	}

	public static void main(String[] args) {
		solution("AC", new int[] { 0, 0, 1 }, new int[] { 0, 1, 1 });
	}
}
