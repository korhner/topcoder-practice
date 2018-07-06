package io.korhner.codilitypractice.forgjmp;

public class Solution {
	public int solution(int X, int Y, int D) {
		if (X >= Y) {
			return 0;
		} else {
			return (int) Math.ceil((Y - X) / (double) D);
		}
	}
	
	public static void main(String[] args) {
	}
}
