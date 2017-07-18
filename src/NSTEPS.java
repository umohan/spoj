import java.io.InputStreamReader;
import java.io.BufferedReader;
public class NSTEPS {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
        String s[]=br.readLine().split(" ");
        int i=Integer.parseInt(s[0]);
        int j=Integer.parseInt(s[1]);
        if((j==i)||(j==(i-2)))
        {
            int c=i*2;
            if(i%2!=0)
                c--;
            int res=0;
            if(j==i)
                res=c;
            else
                res=c-2;
            System.out.println(res);
        }
        else
        System.out.println("No Number");
    }
}
}