import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
public class FTRL2 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       while(t-->0)
       {
           int in=Integer.parseInt(br.readLine());
           BigInteger b=BigInteger.valueOf(in);
           
           for(int i=in;i>=2;i--)
               b=b.multiply(BigInteger.valueOf(i-1));
           System.out.println(b);
       }
       
    }
}
