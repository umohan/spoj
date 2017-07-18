import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class AE2A {
    
    
    //This Code Gives WA for some unknown reason
    static int dp[][];
    public static void main(String[]args)throws Exception
    {
        BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            if(n>1000&&m>1000)
                System.out.println(0);
            else{
            dp=new int[n+1][m+1];
            double res=count(n,m);
            res*=100;
            for(int i=0;i<n;i++)
                res/=6;
            System.out.println((int)res);
            }
        }
    }
    static int count(int n,int val)
    {
        if(val<0)
            return 0;
        if(n==0)
            return 0;
        else if(n==1)
        {
            if(val<=6)
                return 1;
            else
                return 0;
        }
        else
        {
           int res=(count(n-1,val-1)+count(n-1,val-2)+count(n-1,val-3)+count(n-1,val-4)+count(n-1,val-5)+count(n-1,val-6));
           dp[n][val]=res;
           return dp[n][val];
        }
    }
}
