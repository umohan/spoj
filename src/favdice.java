import java.io.BufferedReader;
import java.io.InputStreamReader;
class favdice {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-->0)
    {
        int n=Integer.parseInt(br.readLine());
        double d=1;
        for(int i=2;i<=n;i++)
        {
            d=d+(1f/i);
        }
        d=Math.round(d*n*100);
        d=d/100f;
        System.out.println(d);
    }
}
}
