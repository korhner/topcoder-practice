package io.korhner.codilitypractice.perfmissingelem;

import java.math.BigDecimal;

public class Solution {
	public int solution(int[] A) {
        BigDecimal expectedSum = new BigDecimal(1);
        expectedSum.multiply(BigDecimal.valueOf(A.length + 2));
        expectedSum.multiply(BigDecimal.valueOf(A.length + 1));
        expectedSum.divide(BigDecimal.valueOf(2));
        for (int number: A) {
        	expectedSum.subtract(BigDecimal.valueOf(number));
        }
        return expectedSum.intValue();
    }
}
