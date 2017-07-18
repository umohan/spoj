import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class GNYR09F {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int dp0[][]=new int[101][101];
        int dp1[][]=new int[101][101];
        for(int i=0;i<101;i++)
        {
            dp0[0][i]=0;
            dp1[0][i]=0;
        }
        dp0[1][0]=1;
        dp1[1][0]=1;
        for(int i=2;i<101;i++)
        {
            dp0[i][0]=dp0[i-1][0]+dp1[i-1][0];
            dp1[i][0]=dp0[i-1][0];
        }
        for(int i=1;i<101;i++)
        {
            for(int j=1;j<101;j++)
            {
                dp0[i][j]=dp0[i-1][j]+dp1[i-1][j];
                dp1[i][j]=dp1[i-1][j-1]+dp0[i-1][j];
            }
        }
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int res=dp0[a][b]+dp1[a][b];
            System.out.println(n+" "+res);
        }
    }
}
