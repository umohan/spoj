import java.io.*;
import java.util.*;
class comdiv {
    public static void main(String[]arg)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
         StringTokenizer st=new StringTokenizer(br.readLine());
         int a=Integer.parseInt(st.nextToken());
         int b=Integer.parseInt(st.nextToken());
         int g=gcd(a,b);
         int res=0;
         int temp=(int)Math.sqrt(g);
         for(int i=1;i<=temp;i++)
         {
             if(g%i==0)
                 res++;
         }
         res*=2;
         if(temp*temp==g)
             res--;
         System.out.println(res);
        }
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
