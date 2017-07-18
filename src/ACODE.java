import java.io.InputStreamReader;
import java.io.BufferedReader;
class ACODE {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(3>2)
        {   
            String s=br.readLine();
            char cc[]=s.toCharArray();
            if(cc[0]=='0')
                System.exit(0);
            long dp[]=new long[cc.length+1];
            dp[0]=1;
            dp[1]=1;
            for(int i=2;i<dp.length;i++)
            {
                int a=cc[i-1]-'0';
                int b=cc[i-2]-'0';
                int c=b*10+a;
                if(a==0)
                    dp[i]=dp[i-2];
                else if(b==0)
                    dp[i]=dp[i-1];
                else if(c<=26&&c>=11)
                {
                    dp[i]=dp[i-1]+dp[i-2];
                }
                else
                    dp[i]=dp[i-1];
            }
            System.out.println(dp[dp.length-1]);
        }
    }
}
