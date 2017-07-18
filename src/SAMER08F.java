import java.io.InputStreamReader;
import java.io.BufferedReader;
public class SAMER08F {
    public static void main(String[]args)throws Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       while(n>0)
       {
           long sum=0;
           for(int i=1;i<=n;i++)
               sum=sum+i*i;
           System.out.println(sum);
           n=Integer.parseInt(br.readLine());
       }
    }
}
