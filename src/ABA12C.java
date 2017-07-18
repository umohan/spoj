import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class ABA12C {
    static int arr[];
    static int dp[][];
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            arr=new int[k+1];
            st=new StringTokenizer(br.readLine());
            for(int i=1;i<=k;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            dp=new int[n+1][k+1];
            for(int i=0;i<n+1;i++)
                for(int j=0;j<k+1;j++)
                    dp[i][j]=-2;
            System.out.println(find(n,k));
        }
    }
    static int find(int n,int k)
    {
//        System.out.println(n+" "+k);
        if(n<0||k<0)
            return -1;
        int temp=10000;
        if(k==0)
        {
//            System.out.println("A");
            return 0;
        }
        
        else if(dp[n][k]==-2)
        {
//            System.out.println("C");
            for(int i=1;i<=k;i++)
            {
//                 System.out.println(n+" "+k);
                if(arr[i]==-1)
                    continue;
                int tt;
                tt=find(n-1,k-i);
                if(tt==-1)
                    continue;
                temp=Math.min(tt+arr[i],temp);
            }
            if(temp==10000)
                temp=-1;
            dp[n][k]=temp;
        }
//        System.out.println("D");
        return dp[n][k];
    }
}
