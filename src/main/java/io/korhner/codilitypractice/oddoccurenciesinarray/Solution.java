package io.korhner.codilitypractice.oddoccurenciesinarray;

public class Solution {
	public int solution(int[] A) {
        int occurrence = 0;
        for (int number: A) {
        	occurrence ^= number;
        }
        return occurrence;
    }
}
