class Solution {
    public void merge(int nums[],int low,int mid,int high){
        int left = low;
        int right = mid+1;
        List<Integer> ans = new ArrayList<>();

        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                ans.add(nums[left]);
                left++;
            }
            else{
                ans.add(nums[right]);
                right++;
            }
        }
        while(left <= mid){
            ans.add(nums[left]);
            left++;
        }
        while(right <= high){
            ans.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            nums[i] = ans.get(i-low);
        }
    }
    public int countPairs(int nums[],int low,int mid,int high){
        int right = mid+1;
        int count = 0;
        
        for(int i=low;i<=mid;i++){
            while(right <= high && nums[i] > 2 * (long)nums[right]){
                right++;
            }
            count += right - (mid+1);
        }
        return count;
    }
    public int mergeSort(int nums[],int low,int high){
        int mid = low + (high-low) / 2;
        int count = 0;

        if(low >= high) return count;

        count += mergeSort(nums,low,mid);
        count += mergeSort(nums,mid+1,high);
        count += countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    }
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums,0,n-1);
    }
}
