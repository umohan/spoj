import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class MMAXPER {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        int dp[][]=new int[n][2];
        dp[0][0]=arr[0][0]+arr[0][1];
        dp[0][1]=arr[0][0]+arr[0][1];
        for(int i=1;i<n;i++)
        {
            int t1=arr[i][1]+arr[i][0];
            int t2=Math.abs(arr[i-1][0]-arr[i][0])-arr[i-1][0]+dp[i-1][0]+t1;
            int t3=Math.abs(arr[i-1][1]-arr[i][0])-arr[i-1][1]+dp[i-1][1]+t1;
            dp[i][0]=Math.max(t2,t3);
            t2=Math.abs(arr[i-1][0]-arr[i][1])-arr[i-1][0]+dp[i-1][0]+t1;
            t3=Math.abs(arr[i-1][1]-arr[i][1])-arr[i-1][1]+dp[i-1][1]+t1;
            dp[i][1]=Math.max(t2,t3);
//            System.out.println(dp[i][0]+" "+dp[i][1]);
        }
        dp[n-1][0]-=arr[n-1][0];
        dp[n-1][1]-=arr[n-1][1];
        System.out.println(Math.max(dp[n-1][0],dp[n-1][1]));
    }
}
