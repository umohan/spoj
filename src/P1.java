import java.io.InputStreamReader;
import java.io.BufferedReader;
public class P1 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(5>1)
        {
            int i=Integer.parseInt(br.readLine());
            if(i==42)
                System.exit(0);
            else
                System.out.println(i);
        }
    }
    
}
