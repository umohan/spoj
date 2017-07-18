import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
public class BISHOPS {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       for(int i=0;i<1024;i++)
       {
           String s=br.readLine();
           if(s.compareTo("1")==0)
               System.out.println(1);
           else{
           BigInteger b=new BigInteger(s);
           System.out.println(b.multiply(BigInteger.valueOf(2)).subtract(BigInteger.valueOf(2)));}
        //   Arrays.
       }
        
    }
}
