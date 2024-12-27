class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int> s;
        vector<int> res(nums1.size(),-1);
        unordered_map<int,int> m;
        for(auto ele:nums2)
        {
            while(!s.empty() && s.top()<ele)
            {
                m[s.top()]=ele;
                s.pop();
            }
            s.push(ele);
        }
        for(int i=0;i<nums1.size();i++)
        {
            if(m[nums1[i]])
                res[i]=m[nums1[i]];
        }
        return res;
        
    }
};
