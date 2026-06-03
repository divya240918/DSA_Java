import java.util.Arrays;
public class containsDuplicate {
    public static boolean isDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,4,5,6};

        if(isDuplicate(nums)){
            System.out.println("Array contains duplicate");
        } else {
            System.out.println("Array does not contain duplicate");
        }
    }
}
