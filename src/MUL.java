import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
class MUL {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    while(n-->0)
    {
        String s[]=br.readLine().split(" ");
        BigInteger b1=new BigInteger(s[0]);
        BigInteger b2=new BigInteger(s[1]);
        b1=b1.multiply(b2);
        System.out.println(b1);
    }
}
}
