class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        unordered_map<int,int> map;
        int c=0;
        for(auto ele:nums)
        {
            c+=map[ele];
            map[ele]+=1;
        }
        return c;
    }
};
