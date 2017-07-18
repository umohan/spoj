import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
class DSUBSEQ {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long mod=1000000007;
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            char cc[]=br.readLine().toCharArray();
            int arr[]=new int[26];
            Arrays.fill(arr,-1);
            long dp[]=new long[cc.length+1];
            dp[0]=1;
            for(int i=1;i<=cc.length;i++)
            {
                int n=cc[i-1]-'A';
                if(arr[n]==-1)
                {
                    dp[i]=(dp[i-1]*2)%mod;
                    arr[n]=i;
                }
                else
                {
                    dp[i]=(dp[i-1]*2)%mod;
                    dp[i]=(mod+dp[i]-dp[arr[n]-1])%mod;
                    arr[n]=i;
                }
            }
            System.out.println(dp[cc.length]);
        }
    }
}
