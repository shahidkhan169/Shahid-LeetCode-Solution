int minBitFlips(int start, int goal) {
    int val=start^goal;
    int count=0;
    while(val>0)
    {
        count+= val & 1;
        val=val>>1;
    }
    return count;
}
