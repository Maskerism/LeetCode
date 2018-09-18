class Solution {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length-1, mid = 0;
        while(lo < hi){
            mid = (lo + hi) / 2;
            if(nums[mid] > nums[hi]) lo = mid+1;
            else hi = mid;
        }
        int rot = lo;
        lo = 0;
        hi = nums.length-1;
        int realmid = 0;
        while(lo <= hi){
            mid = (lo + hi) / 2;
            realmid = (mid + rot) % nums.length;
            if(nums[realmid] == target) return realmid;
            if(nums[realmid] < target) lo = mid+1;
            else hi = mid-1;
        }
        return -1;
    }
}
