package LeetCode;

public class code17 {
    public boolean containsDuplicate(int[] nums){
        for (int i = 0;i<nums.length;i++){
            for (int j = 0;j<i;j++){
                if (nums[j] == nums[i])
                    return true;
            }
        }
        return false;
    }
}
