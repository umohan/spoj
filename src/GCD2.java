import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
public class GCD2 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {for(int i=0;i<test;i++){
            String s[]=br.readLine().split(" ");
            BigInteger b=new BigInteger(s[0]);
            BigInteger a=new BigInteger(s[1]);
            BigInteger temp;
            while(b.intValue()>=-1)
            {
                if(b.intValue()<=0)
                {
                    System.out.println(a);
                    break;
                }
                temp=a;
                a=b;
                b=temp.mod(b);}
            }
        }
    }
}
