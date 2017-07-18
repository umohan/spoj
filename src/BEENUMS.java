import java.io.InputStreamReader;
import java.io.BufferedReader;
public class BEENUMS {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long t=Integer.parseInt(br.readLine());
                while(t>-1)
                {
                   t=(t*4-1)/3;
                   int a=(int)Math.sqrt(t);
                   if(a*a==t)
                       System.out.println("Y");
                   else
                       System.out.println("N");
                   t=Integer.parseInt(br.readLine());
                }
    }
}
