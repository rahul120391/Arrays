public class MaxSubArraySum {

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumSoFar = 0;
        for (int num : nums) {
            maxSumSoFar += num;
            if (maxSum < maxSumSoFar) {
                maxSum = maxSumSoFar;
            }
            if (maxSumSoFar < 0) {
                maxSumSoFar = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] A = {-3,-2,-1};
        int number = maxSubArray(A);
        System.out.println(number);
    }
}
