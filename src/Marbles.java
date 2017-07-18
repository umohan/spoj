import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class Marbles {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        String res="";
        while(test-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(a==b)
                res=res+1+"\n";
            else
            {
                a--;
                b--;
                long r=1;
                if((a-b)<b)
                    b=a-b;
                for(int i=1;i<=b;i++)
                {
                    r=(r*a)/i;
                    a--;
                }
                res=res+r+"\n";
            }
        }
        System.out.print(res);
    }
}
