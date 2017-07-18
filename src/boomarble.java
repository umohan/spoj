import java.io.InputStreamReader;
import java.io.BufferedReader;
class boomarble {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    while(3>2)
    {
        int a=Integer.parseInt(br.readLine());
        if(a==0)
            break;
        long res=0;
        res=5+4*(a-1)+(3*(a*(a-1))/2);
        System.out.println(res);
    }
}
}
