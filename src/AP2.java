import java.io.BufferedReader;
import java.io.InputStreamReader;
public class AP2 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long test=Long.parseLong(br.readLine());
        while(test-->0)
        {
            String s[]=br.readLine().split(" ");
            long a=Long.parseLong(s[0]);
            long b=Long.parseLong(s[1]);
            long su=Long.parseLong(s[2]);
            long n=(su*2)/(a+b);
            long r=(b-a)/(n-5);
            long f=a-(2*r);
            System.out.println(n);
           StringBuilder ss=new StringBuilder("");
            for(long i=0;i<n/2;i++)
            {
                ss=ss.append(f+" "+(f+r)+" ");
                //System.out.print(f+" "+(f+r)+" ");
                f=f+2*r;
            }
           if(n%2==1)
               ss=ss.append(f+" ");
               //System.out.print(f+" ");
           System.out.print(ss);
        }
    }
}
