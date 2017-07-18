import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class ENIGMATH {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            long a=Long.parseLong(st.nextToken());
            long b=Long.parseLong(st.nextToken());
            long c=gcd(a,b);
            System.out.println(b/c+" "+a/c+"\n");
        }
    }
    public static long gcd(long a,long b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
                    
    }
}
