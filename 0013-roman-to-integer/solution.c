int romanToInt(char* s) 
{
       int n=strlen(s);
    
    int b=0;
    for(int i=0;i<n;i++)
    {
        if(s[i]=='I')
        {
            if(i==n-1)
            {
                b=b+1;
                s[i]='0';
            }
            else if(s[i+1]=='V')
            {
                b=b+4;
                s[i]=0;
                s[i+1]=0;
            }
            else if(s[i+1]=='X')
            {
                b=b+9;
                s[i]=0;
                s[i+1]=0;
            }
            else
            {
                b=b+1;
                s[i]='0';
            }
            
        }
         else if(s[i]=='V')
        {
            b=b+5;
            s[i]='0';
        }
        else if(s[i]=='X')
        {
            if(i==n-1)
            {
                b=b+10;
                s[i]='0';
            }
            else if(s[i+1]=='L')
            {
                b=b+40;
                s[i]=0;
                s[i+1]=0;
            }
            else if(s[i+1]=='C')
            {
                b=b+90;
                s[i]=0;
                s[i+1]=0;
            }
            else
            {
                b=b+10;
                s[i]='0';
            }
        }
        else if(s[i]=='L')
        {
            b=b+50;
            s[i]='0';
        }
        else if(s[i]=='C')
        {
            if(i==n-1)
            {
                b=b+100;
                s[i]='0';
            }
            else if(s[i+1]=='D')
            {
                b=b+400;
                s[i]=0;
                s[i+1]=0;
            }
            else if(s[i+1]=='M')
            {
                b=b+900;
                s[i]=0;
                s[i+1]=0;
            }
            else
            {
                b=b+100;
                s[i]='0';
            }
        }
        else if(s[i]=='D')
        {
            b=b+500;
            s[i]='0';
        }
        else if(s[i]=='M')
        {
            b=b+1000;
            s[i]='0';
        }
       
    }
    return b; 
}
