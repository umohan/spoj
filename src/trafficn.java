import java.io.InputStreamReader;
import java.io.BufferedReader;
class trafficn {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while(n-->0)
        {
            int in=Integer.parseInt(br.readLine());
            if(in%2==0)
            {
                StringBuilder sb=new StringBuilder(Integer.toBinaryString(in));
                sb=sb.reverse();
                in=Integer.parseInt(sb.toString(),2);
            }
            System.out.println(in);
        }
    }
}
