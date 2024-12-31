class Solution {
public:
    int compute(int val)
    {
        int sum=0;
        while(val>0)
        {
            int d=val%10;
            sum+=(d*d);
            val=val/10;
        }
        return sum;
    }
    bool isHappy(int n) {
            unordered_set<int> set;
            int val=n;
            do{
                val=compute(val);
               if(set.count(val)!=0)
                    return false;
                else
                    set.insert(val);
            }while(val!=1);
        return true;
    }
};
