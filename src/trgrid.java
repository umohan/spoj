import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class trgrid {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            String s="";
            if((a==1)&(b==1))
               s="R";
            else if(a==1)
                s="R";
            else if(b==1)
                s="D";
            else if(a==b)
            {
                if(a%2==0)
                    s="L";
                else
                    s="R";
            }
            else if(a>b)
            {
                if(b%2==0)
                    s="U";
                else
                    s="D";
            }
            else if(a%2==0)
                s="L";
            else
                s="R";
            System.out.println(s);
        }
    }
}
