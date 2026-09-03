
import java.util.*;
class Solution {
   public int[] bubbleSort(int[] nums) {
int n = nums.length;
for(int i=0;i<n-1;i++){
    for(int j=0;j<n-1-i;j++){
        if(nums[j] > nums[j+1]){
            int temp = nums[j];
            nums[j] = nums[j+1];
            nums[j+1] = temp;
        }
    }
}
return nums;
}
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {7, 4, 1, 5, 3};
        System.out.println("Array Before Using Bubble Sort: " + Arrays.toString(nums));
        nums = solution.bubbleSort(nums);
        System.out.println("Array After Using Bubble Sort: " + Arrays.toString(nums));
    }
}

