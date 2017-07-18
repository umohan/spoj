import java.io.InputStreamReader;
import java.io.BufferedReader;
class alicesieve {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            long in=Long.parseLong(br.readLine());
            long res=0;
            if(in%2==1)
                res+=1;
            res=res+in/2;
            System.out.println(res);
        }
    }
}
