import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class BYECAKES {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(3>2)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            int d=Integer.parseInt(st.nextToken());
            int a1=Integer.parseInt(st.nextToken());
            int b1=Integer.parseInt(st.nextToken());
            int c1=Integer.parseInt(st.nextToken());
            int d1=Integer.parseInt(st.nextToken());
            if((a==-1)&&(b==-1))
                System.exit(0);
            int a3=a/a1;if(a%a1>0)a3++;
            int b3=b/b1;if(b%b1>0)b3++;
            int c3=c/c1;if(c%c1>0)c3++;
            int d3=d/d1;if(d%d1>0)d3++;
            int max=Math.max(a3>=b3?a3:b3,c3>=d3?c3:d3);
            a=max*a1-a;
            b=max*b1-b;
            c=max*c1-c;
            d=max*d1-d;
            System.out.println(a+" "+b+" "+c+" "+d);
        }
    }
}
