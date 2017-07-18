import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class CRSCNTRY {
    static int arr[];
    static int ar[];
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            arr=new int[st.countTokens()-1];
            for(int i=0;i<arr.length;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            st=new StringTokenizer(br.readLine());
            int n=st.countTokens();
            int max=0;
            while(n>1)
            {
                ar=new int[st.countTokens()-1];
                for(int i=0;i<ar.length;i++)
                    ar[i]=Integer.parseInt(st.nextToken());
                int temp=lcs();
                if(temp>max)
                    max=temp;
                st=new StringTokenizer(br.readLine());
                n=st.countTokens();
            }
            System.out.println(max);
        }
    }
    public static int lcs()
    {
        int dp[][]=new int[arr.length+1][ar.length+1];
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=0;j<=ar.length;j++)
            {
                if(i==0||j==0)
                    dp[i][j]=0;
                else
                {
                    if(arr[i-1]==ar[j-1])
                        dp[i][j]=Math.max(1+dp[i-1][j-1],Math.max(dp[i][j-1],dp[i-1][j]) );
                    else
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[arr.length][ar.length];
    }
}
