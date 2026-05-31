import java.util.Arrays;

public class productOfArray {
    public static int[] exceptSelf(int[] nums) {
        int n = nums.length;

        int prefix[] = new int[n];
        int suffix[] = new int[n];

        prefix[0] = 1;
        suffix[n-1] = 1;

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        for(int i = n-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        int[] answer = new int[n];

        for(int i = 0; i< n; i++) {
            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {5,2,1,4};

        int answer[] = exceptSelf(nums);
        System.out.println(Arrays.toString(answer));
    }
}
