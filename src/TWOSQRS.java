import java.io.InputStreamReader;
import java.io.BufferedReader;
class TWOSQRS {
    public static void main(String[]args)throws Exception
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int test=Integer.parseInt(br.readLine());
     while(test-->0)
     {
        long n=Long.parseLong(br.readLine());
         long t=(long)Math.sqrt(n);
             int p=0;
             for(int i=0;i<=t;i++)
             {
              long r=n-i*i;
             double f=Math.sqrt(r);
              long s=(long)f;
              if(s==f)
              {System.out.println("Yes");
              p=1;
              break;
              }
             }
             if(p==0)
                 System.out.println("No");
         
     }
    }
}
