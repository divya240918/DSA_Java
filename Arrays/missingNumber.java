public class missingNumber {
    public static int missingNumber( int[] nums) {
        int n = nums.length;
        int actualSum = 0;
        for(int i= 0;i < n; i++) {
            actualSum += nums[i];
        }

        int expectedSum = n * (n+1) / 2;

        int missingNum = expectedSum - actualSum;

        return missingNum;
    }

    public static void main( String[] args) {
        int[] nums = {0,1,2,3,4,5,6,8,9};

        int missingNum = missingNumber(nums);

        System.out.println("Missing Number is " + missingNum);
    }
}
