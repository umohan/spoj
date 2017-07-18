import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
class NY10E {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        long arr[]=new long[64];
        arr[0]=10;
        BigInteger b1=BigInteger.valueOf(9);
        BigInteger b2=BigInteger.valueOf(10);
        BigInteger b3=BigInteger.ONE;
        int a=1;
        for(int i=1;i<=63;i++)
        {
            b1=b1.multiply(b2);
            b2=b2.add(BigInteger.ONE);
            a++;
            b3=b3.multiply(BigInteger.valueOf(a));
            arr[i]=(b1.divide(b3)).longValue();
        }
        for(int i=1;i<64;i++)
        {
            arr[i]+=arr[i-1];
        }
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            String s[]=br.readLine().split(" ");
            System.out.println(s[0]+" "+arr[Integer.parseInt(s[1])-1]);
        }
                
    }
}
