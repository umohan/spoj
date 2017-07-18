import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class rootciph {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            long a=Long.parseLong(st.nextToken());
            long b=Long.parseLong(st.nextToken());
           // long c=Long.parseLong(st.nextToken());
            a*=a;
            b*=2;
            a=a-b;
            System.out.println(a);
        }
    }
}
