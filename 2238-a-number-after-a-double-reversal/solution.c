bool isSameAfterReversals(int num) {
    if(num==0)
        return 1;
    int n=num%10;
    return n>0;
}
