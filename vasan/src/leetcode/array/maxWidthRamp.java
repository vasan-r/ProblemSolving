package leetcode.array;

public class maxWidthRamp {
    public static void main(String[] args) {
        int[] nums = {6,0,8,2,1,5};
        System.out.println(maxWidthRamp(nums));
    }
    public static int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] max = new int[n];
        int[] min = new int[n];
        min[0] = nums[0];
        max[n-1] = nums[n-1];
        for (int i = 1; i < n; i++) {
            min[i] = Math.min(nums[i],min[i-1]);
        }
        for (int i = n-2; i >= 0; i--) {
            max[i] = Math.max(nums[i],max[i+1]);
        }
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j<n){
            if(min[i]<=max[j]){
                ans = Math.max(ans,j-i);
                j++;
            }else{
                i++;
            }
        }
        return ans;
    }
}
