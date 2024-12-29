class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int l=1,r=*max_element(piles.begin(),piles.end());
        while(l<r)
        {
            int mid=(l+r)/2;
            int total=0;
            for(int pile:piles)
            {
                total+=(pile/mid)+(pile%mid!=0);
                if(total>h)
                    break;
            }
            if(total<=h) r=mid;
            else l=mid+1;
        }
        return l;
    }
};
