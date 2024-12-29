class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n=nums.size();
        int l=0,r=n-1;
        int fo=0,lo=0;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            {
                if(l==mid || nums[mid-1]!=target)
                {
                    fo=mid;
                    break;
                }
                r=mid-1;
            }
            else if(target>nums[mid])
                l=mid+1;
            else
                r=mid-1;
        }
        if(l>r) return {-1,-1};
        l=0,r=n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            {
                if(r==mid || nums[mid+1]!=target)
                {
                    lo=mid;
                    break;
                }
                l=mid+1;
            }
            else if(target>nums[mid])
                l=mid+1;
            else
                r=mid-1;
        }
        return {fo,lo};
    }
};
