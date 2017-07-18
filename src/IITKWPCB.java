import java.io.InputStreamReader;
import java.io.BufferedReader;
class IITKWPCB {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            long n=Long.parseLong(br.readLine());
            if(n==1)
                System.out.println(0);
            else if(n<=4)
                System.out.println(1);
            else if(n%2==0)
                System.out.println(n/2-1);
              else
                System.out.println(n/2);
        }
    }
}
