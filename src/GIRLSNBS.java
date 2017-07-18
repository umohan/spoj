import java.io.InputStreamReader;
import java.io.BufferedReader;
public class GIRLSNBS {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        while((a>-1)&&(b>-1))
        {
        int max=a>=b?a:b;
        int min=a>=b?b:a;
        int res=(max)/(min+1);
        if(max%(min+1)>0)
            res++;
        System.out.println(res);
        String  ss[]=br.readLine().split(" ");
        a=Integer.parseInt(ss[0]);
        b=Integer.parseInt(ss[1]);
        }
    }
}
