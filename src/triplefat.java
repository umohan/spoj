import java.io.InputStreamReader;
import java.io.BufferedReader;
public class triplefat {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test>0)
        {
            test--;
           long k=Long.parseLong(br.readLine());
           long res=192+(k-1)*250;  
           System.out.println(res);
           
        }
    }
}
