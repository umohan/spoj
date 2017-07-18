import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class Atoms {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            long n=Long.parseLong(st.nextToken());
            double k=Double.parseDouble(st.nextToken());
            double m=Double.parseDouble(st.nextToken());
            if(n>=m)
                System.out.println(0);
            else if(k>=m)
                System.out.println(0);
            else
            {
            m=m/n;
            int res=(int)(Math.log10(m)/Math.log10(k));
            System.out.println(res);
            }
        }
    }
}
