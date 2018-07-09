package io.korhner.codilitypractice.frogriverone;

public class Solution {
	public int solution(int X, int[] A) {
        int[] flags = new int[X];
        int toProcess = X;
        int second = 0;
        for (int num: A) {
        	if (flags[num-1] == 0) {
        		flags[num-1] = 1;
        		if (--toProcess == 0) {
        			return second;
        		}
        	}
        	second++;
        }
        
        return -1;
    }
}
