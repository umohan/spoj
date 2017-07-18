import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ABSYSTEM {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long test=Long.parseLong(br.readLine());
        while(test-->0)
        {
          String s=br.readLine();
          String ss[]=br.readLine().split(" ");
          int temp=0;
          int check=0;
          int a=0,b=0,c=0;
          try
          {
              a=Integer.parseInt(ss[0]);
          }
          catch(Exception x)
          {
              check=0;
          }
            try
          {
              b=Integer.parseInt(ss[2]);
          }
          catch(Exception x)
          {
              check=2;
          }
              try
          {
              c=Integer.parseInt(ss[4]);
          }
          catch(Exception x)
          {
              check=4;
          }
              //System.out.println(check);
              if(check==0)
                  ss[0]=Integer.toString(c-b);
              else if(check==2)
                  ss[2]=Integer.toString(c-a);
              else
                  ss[4]=Integer.toString(a+b);
              for(int i=0;i<=4;i++)
                  System.out.print(ss[i]+" ");
        }
    }
}