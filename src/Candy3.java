import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
public class Candy3 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long test=Long.parseLong(br.readLine());
       
        while(test-->0)
        {
            //String ss=br.readLine();
        BigInteger b=BigInteger.ZERO;
        long n=Long.parseLong(br.readLine());
        for(long i=0;i<n;i++)
            b=b.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
        System.out.println();
        BigInteger c=b.mod(BigInteger.valueOf(n));
        //System.out.println(c);
        //System.out.println("ss"+c.toString());
        if(c.toString().compareTo("0")==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }}
            
}
