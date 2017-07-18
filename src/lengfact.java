import java.io.InputStreamReader;
import java.io.BufferedReader;
class lengfact {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            long n=Long.parseLong(br.readLine());
            if(n<=1)
                System.out.println(1);
            else{
             double ans1 = (Math.log10(2*Math.PI*n) / 2 + n*(Math.log10(n) - Math.log10(Math.E))) + 1;
                System.out.println((long)Math.floor(ans1));
            //System.out.println(res);
            }
        }
    }
}
