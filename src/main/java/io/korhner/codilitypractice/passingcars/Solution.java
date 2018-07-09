package io.korhner.codilitypractice.passingcars;

public class Solution {
	public int solution(int[] A) {
        int numOnes = 0;
        for (int num: A) {
        	numOnes += num;
        }
        
        long sum = 0;
        for (int num: A) {
        	if (num == 1) {
        		numOnes--;
        	} else {
        		sum += numOnes;
        	}
        }
        
        if (sum > 1000000000) {
        	return -1;
        }
        return (int)sum;
    }
}
