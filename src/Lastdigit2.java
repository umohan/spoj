import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Lastdigit2 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s[]=br.readLine().split(" ");
            int a=s[0].charAt(s[0].length()-1)-48;
            int h=1;
            long c=Long.parseLong(s[1]);
            if(c==0)
                System.out.println(h);
            else{
                    c%=4;
                    if(c==0)
                        System.out.println((a*a*a*a)%10);
                    else{
            for(int i=0;i<c;i++)
                h=h*a;
            System.out.println(h%10);}
            }
        }
    }
}
