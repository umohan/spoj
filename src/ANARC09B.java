import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class ANARC09B {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(3>2){
        StringTokenizer st=new StringTokenizer(br.readLine());
        long a=Long.parseLong(st.nextToken());
        long b=Long.parseLong(st.nextToken());
        if((a==0)&&(b==0))
            System.exit(0);
        long gc=gcd(a,b);
        a/=gc;
        b/=gc;
        a*=b;
        System.out.println(a);
        }
    }
    static long gcd(long a,long b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
