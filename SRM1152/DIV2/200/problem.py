class MagicSubset:
    def findBest(self, value):
        magical = value[0]
        sum_positive = 0
        sum_negative = 0
        for stone in value[1:]:
            if stone > 0:
                sum_positive += stone
            elif stone < 0:
                sum_negative += stone
        positive_with_magical = -(magical + sum_positive)
        negative_with_magical = -(magical + sum_negative)
        return max(0, sum_positive, sum_negative, positive_with_magical, negative_with_magical)