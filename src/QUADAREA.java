import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class QUADAREA {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            double a=Double.parseDouble(st.nextToken());
            double b=Double.parseDouble(st.nextToken());
            double c=Double.parseDouble(st.nextToken());
            double d=Double.parseDouble(st.nextToken());
            double s=(a+b+c+d)/2;
            double res=Math.sqrt((s-a)*(s-b)*(s-c)*(s-d));
            System.out.printf("%.2f\n",res);
        }
    }
}
