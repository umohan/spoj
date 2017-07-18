import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class SPEED {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-->0)
    {
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int hcf=gcd(Math.abs(a),Math.abs(b));
        System.out.println((Math.max(a, b)-Math.min(a, b))/hcf);
    }
}
public static int gcd(int a,int b)
{
    if(b==0)
        return a;
    else
        return gcd(b,a%b); 
}
}
