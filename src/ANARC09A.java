import java.io.BufferedReader;
import java.io.InputStreamReader;
class ANARC09A {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int rr=0;
       while(3>2)
       {rr++;
           String s=br.readLine();
           if(s.charAt(0)=='-')
               System.exit(0);
           else
           {
               int r=0;
               int p=0;
               int n=s.length();
               for(int i=0;i<n;i++)
               {
                   char c=s.charAt(i);
                   if((p==0)&&(c=='}'))
                   {
                       r++;
                       p+=2;
                   }
                   if(c=='}')
                       p--;
                   else if(c=='{')
                       p++;
               }
               p/=2;
               if(p<0)
                   r=r-p;
               else
                   r=r+p;
               System.out.println(rr+". "+r);
           }
       }
    }
}
