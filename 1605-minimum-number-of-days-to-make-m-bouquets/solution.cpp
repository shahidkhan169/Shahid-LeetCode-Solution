class Solution {
public:
    int minDays(vector<int>& day, int m, int k) {
        int n=day.size();
        if(n<(long)m*k)
            return -1;
        int l=1,r=*max_element(day.begin(),day.end());
        while(l<=r)
        {
            int mid=(l+r)/2;
            int f=0,b=0;
            for(auto d:day)
            {
                if(d<=mid)
                    f++;
                else
                    f=0;
                if(f==k)
                {
                    b++;
                    f=0;
                }
            }
            if(b>=m)
            {
                r=mid-1;
            }
            else
                l=mid+1;

        }
        return l;
    }
};
