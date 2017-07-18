import java.io.InputStreamReader;
import java.io.BufferedReader;
public class CARDS {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            long n=Integer.parseInt(br.readLine());
            n=((3*((n*(n+1))/2))-n)%1000007;
            System.out.println(n);
        }
    }
}
