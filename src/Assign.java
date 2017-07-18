import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class Assign {
    static int n;
    static int arr[];
    static long dp[][];
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            n=Integer.parseInt(br.readLine());
            arr=new int[n];
            dp=new long[n][1<<n];
            for(int i=0;i<n;i++)
                for(int j=0;j<1<<n;j++)
                    dp[i][j]=-1;
            StringTokenizer st;
            for(int i=0;i<n;i++)
            {
                st=new StringTokenizer(br.readLine());
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++)
                    sb.append(st.nextToken());
                arr[i]=Integer.parseInt(sb.toString(),2);
            }
            System.out.println(calc(0,0));
        }
    }
    static long calc(int a,int val)
    {
        long count=0;
        if(dp[a][val]!=-1)
            return dp[a][val];
        if(a==n-1)
        {
            for(int i=0;i<n;i++)
               if((((arr[n-1]>>i)&1)==1)&&((val>>i&1)!=1))
                   count+=1;
            dp[a][val]=count;
            return count;
        }
        else
        {   
            for(int i=0;i<n;i++)
            {
                if(((arr[a]>>i&1)==1)&&((val>>i)&1)==0)
                {
                    int re=val;
                    re+=1<<i;
                    count+=calc(a+1,re);
                }
            }
            dp[a][val]=count;
            return count;
        }
    }
}
