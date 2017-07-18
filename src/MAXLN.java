import java.io.InputStreamReader;
import java.io.BufferedReader;
public class MAXLN {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        {
            int test=Integer.parseInt(br.readLine());
            for(int ch=1;ch<=test;ch++)
            {
             double in=Double.parseDouble(br.readLine());
             double res=(4*in*in);
             res=res+0.25f;
             String ss=String.format("%.2f", res);
             System.out.println("Case "+ch+": "+ss);
            }
        }
    }
}
