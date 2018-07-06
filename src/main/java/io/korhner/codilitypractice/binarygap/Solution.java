package io.korhner.codilitypractice.binarygap;

public class Solution {
	public int solution(int N) {
        int mask = 0b1000000000000000000000000000000;
        int endMasl = 0b0000000000000000000000000000001;
        boolean gapStarted = (N & mask) == mask;
        int currentGap = 0;
        int maxGap = 0;
        while (mask != endMasl) {
        	mask = mask >> 1;
        	boolean currentOne = (N & mask) == mask;
        	if (currentOne) {
        		if (currentGap > maxGap) {
    				maxGap = currentGap;
    			}
        		gapStarted = true;
        		currentGap = 0;
        	} else {
        		if (gapStarted) {
        			currentGap++;
        		}
        	}
        }
        
        return maxGap;
        
    }
}
