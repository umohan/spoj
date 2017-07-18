import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class LASTDIG {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(b==0)
                System.out.println(1);
            else
            {
                b%=4;
                int tt=a;
                if(b==0)
                    b=4;
                for(int i=0;i<b-1;i++)
                {
                    a*=tt;
                    a%=10;
                }
                
                System.out.println(a%10);
            }
        }
    }
}
