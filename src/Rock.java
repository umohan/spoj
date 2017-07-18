import java.io.InputStreamReader;
import java.io.BufferedReader;
class Rock {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            char cc[]=br.readLine().toCharArray();
            int dp[][]=new int[n][n];
            int sum[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
                int a=0;
                for(int j=i;j<n;j++)
                {
                    if(i==0)
                    {
                       if(cc[j]-'0'==0) 
                       {
                           dp[a][j]=0;
                           sum[a][j]=-1;
                       }
                       else
                       {
                           dp[a][j]=1;
                           sum[a][j]=1;
                       }
                    }
                    else
                    {
                        sum[a][j]=sum[a][j-1]+(cc[j]-'0');
                        if(sum[a][j]==sum[a][j-1])
                            sum[a][j]--;
                        if(sum[a][j]>0)
                            dp[a][j]=j-a+1;
                        else
                        {
                            for(int k=a;k<j;k++)
                            {
                                int q=dp[a][k]+dp[k+1][j];
                                if(q>dp[a][j])
                                {
                                   dp[a][j]=q;
                                }
                            }
                        }
                    }
                    a++;
                }
            }
//            for(int i=0;i<n;i++)
//            {
//                for(int j=0;j<n;j++)
//                {
//                    if(j<i)
//                        System.out.print("-");
//                    else
//                    System.out.print(dp[i][j]);
//                }
//                System.out.println();
//            }
            System.out.println(dp[0][n-1]);
        }
    }
}
