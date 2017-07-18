import java.io.InputStreamReader;
import java.io.BufferedReader;
class pour1 {
    static int a;
    static int b;
    static int c;
    static int ck;
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            int emp=Math.min(a, b);
            a=Math.max(a, b);
            b=emp;
            c=Integer.parseInt(br.readLine());
            int g=gcd(a,b);
            if((c%g!=0)||(c>a))
                System.out.println(-1);
            else{
            ck=0;
            int axx=(call1(0,0,0));
            ck=0;
            int ax=call2(0,0,0);
            System.out.println(Math.min(axx,ax));}
        }
    }
    static int call1(int p,int m,int r)
    {
        if((p==c)||(m==c)||(ck==c))
        {
            return r;
            
        }
        else if(ck>a)
        {
            ck-=a;
            m=0;
            r+=1;
            m=p;
            r+=1;
            p=0;
            return call1(p,m,r);
        }
        else
        {
            ck+=b;
            p+=b;
            r++;
            if(p==c)
                return r;
            int t=Math.min(a-m,p);
            m+=t;p-=t;r++;
            if((p==c)||(m==c))
                return r;
            return call1(p,m,r);
        }
    }
    static int call2(int p,int m,int r)
    {
        if((ck==c)||(p==c)||(m==c))
        {
            return r;
        }
        else if((ck>c)&&(ck>=b))
        {
            ck-=b;
            int temp=b-p;
            m-=temp;p+=temp;
            r+=1;
            if((p==c)||(m==c))
                return r;
            p=0;
            r+=1;
            return call2(p,m,r);
        }
        else
        {
            ck+=a;
            if(m!=0)
            {
                p=m;
                r++;
            }
            r+=1;
            m=a;
            if(m==c)
                return r;
            return call2(p,m,r);
        }
    }
    static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
