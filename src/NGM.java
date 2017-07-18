import java.io.BufferedReader;
import java.io.InputStreamReader;
public class NGM {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long l=Long.parseLong(br.readLine());
         String s=Long.toString(l);
          int max=0;
          //count++;
          for(int i=0;i<s.length();i++)
          {
              int a=((int)s.charAt(i))-48;
              if(a>max)
                  max=a;
          }
        if(l%10==0)
        {
            System.out.println(2);
           // System.out.println();
        }
        
        else 
        {
            System.out.println(1+"\n"+max);
            
        }
    }
}
