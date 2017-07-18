import java.io.InputStreamReader;
import java.io.BufferedReader;
class FCTRL {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
            int n=Integer.parseInt(br.readLine());
            int res=0;
            int temp=5;
            while(temp<=n)
            {
                res+=n/temp;
                temp*=5;
            }
            System.out.println(res);
        }
    }
}
