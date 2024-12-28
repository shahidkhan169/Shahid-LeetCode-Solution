class Solution {
public:
    vector<int> twoSum(vector<int>& num, int t) {
        int n=num.size();
        int l=0,r=n-1;
        vector<int> res;
        while(l!=r)
        {
            int sum=num[l]+num[r];
            if(sum==t)
            {
                res.push_back(l+1);
                res.push_back(r+1);
                return res;
            }
            else if(t>sum) 
                l++;
            else 
                r--;
        }
        return res;
    }
};
