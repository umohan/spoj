import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class zsum {
    static long MOD=10000007;
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(br.readLine());
    long a=Integer.parseInt(st.nextToken());
    long b=Integer.parseInt(st.nextToken());
    while(true)
    {
        if((a==0)&&(b==0))
            break;
        long q=(fast_exp(a-1,b)*2)%MOD;
        long w=(fast_exp(a-1,a-1)*2)%MOD;
        long e=fast_exp(a,b);
        long r=fast_exp(a,a);
        q=(q+w+e+r)%MOD;
        System.out.println(q);
        st=new StringTokenizer(br.readLine());
        a=Integer.parseInt(st.nextToken());
        b=Integer.parseInt(st.nextToken());
    }
}
 public static long fast_exp(long base, long exp) {
    long res=1;
    while(exp>0) {
       if(exp%2==1) res=(res*base)%MOD;
       base=(base*base)%MOD;
       exp/=2;
    }
    return res%MOD;
}
}
