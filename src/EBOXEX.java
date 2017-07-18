import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class EBOXEX {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    StringTokenizer st;
    while(t-->0)
    {
        st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int tt=Integer.parseInt(st.nextToken());
        int f=Integer.parseInt(st.nextToken());
        long rr=f-n;
        rr/=(k-1);
        System.out.println(rr+f);
    }
}
}
