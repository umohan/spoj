import java.io.InputStreamReader;
import java.io.BufferedReader;
class TSHOW1 {
    static long val[];
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    val=new long[50];
    long a=1;
    for(int i=1;i<=50;i++)
    {
        a*=2;
        val[i-1]=a-2;
    }
    
    int n=Integer.parseInt(br.readLine());
    
    while(n-->0)
    {
        long t=Long.parseLong(br.readLine());
        if(t==1)
        System.out.println('5');
    else if(t==2)
            System.out.println('6');
    else
    {
        int len=cllength(t);
        long nth=t-val[len-1];
        
        System.out.println(res(nth,len));
    }
        
     }
}
public static int cllength(long t)
{
    int i=0;
    for(i=0;i<50;i++)
    {if(val[i]<t)
            continue;
    else
        break;
    }
    return i;
}
public static String res(long a,int l)
{
    if(l==1)
    {
        if(a==1)
            return "5";
        else
            return "6";
    }
    String s="";
    long k=val[l-2]+2;
    if((a-1)/k==1)
        s+="6";
    else
        s+="5";
    return s+res(((a-1)%k)+1,l-1);
        
}
}
