import java.io.InputStreamReader;
import java.io.BufferedReader;
public class NY10OA {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    int test=Integer.parseInt(br.readLine());
    while(test-->0)
    {int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
        String n=br.readLine();
        String s=br.readLine();
        for(int i=0;i<38;i++)
        {
            if(s.charAt(i)=='T')
            {
                if(s.charAt(i+1)=='T')
                {
                    if(s.charAt(i+2)=='T')
                        a++;
                    else
                        b++;
                }
                else
                {
                  if(s.charAt(i+2)=='T')
                        c++;
                    else
                        d++;   
                }
            }
            else
            {
                if(s.charAt(i+1)=='T')
                {
                    if(s.charAt(i+2)=='T')
                        e++;
                    else
                        f++;
                }
                else
                {
                  if(s.charAt(i+2)=='T')
                        g++;
                    else
                        h++;   
                }
            }
        }
        System.out.println(n+" "+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
    }
}
}
