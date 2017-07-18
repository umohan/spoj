import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class DOTAA {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            int d=Integer.parseInt(st.nextToken());
            int c=0;
            for(int i=0;i<n;i++)
            {
                int s=Integer.parseInt(br.readLine());
                if(s%d>0)
                   c+=s/d;
            }
           if(c>=m)
               System.out.println("YES");
           else
               System.out.println("NO");
        }
    }
}
