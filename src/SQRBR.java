import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;
class SQRBR {
    static char cc[];
    static int n;
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine().trim());
    while(t-->0)
    {
        StringTokenizer st;
        st=new StringTokenizer(br.readLine().trim());
        n=Integer.parseInt(st.nextToken());
        cc=new char[2*n];
        Arrays.fill(cc,'2');
        int k=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine().trim());
        for(int i=0;i<k;i++)
            cc[Integer.parseInt(st.nextToken())-1]='0';
       if(cc[2*n-1]=='0')
           System.out.println(0);
       else
       {
           if(cc[0]!='0')
           {
               cc[0]='0';
               k+=1;
           }
           cc[2*n-1]='1';
           int res=check(cc,1,1,k);
           System.out.println(res);
       }
    }
}
public static int check(char cx[],int a,int b,int bb)
{
    if(b>n)
        return 0;
    if(bb>n)
        return 0;
    if(a==2*n-1)
    {
        if(b==1)
           return 1;
        else
           return 0;
    }
    if(b<0)
        return 0;
    if(cx[a]=='0')
        return check(cx,a+1,b+1,bb);
    else
    {
        cx[a]='0';
        int q=check(cx,a+1,b+1,bb+1);
        cx[a]='1';
        int w=check(cx,a+1,b-1,bb);
        return w+q;
    }
}

}
