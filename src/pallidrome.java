import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class pallidrome {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
       while(test>0)
       {String fake=br.readLine();
           test--;
           String ss=br.readLine();
          // ss=ss.trim();
           StringTokenizer st=new StringTokenizer(ss);
           char c='a';
           //long a=0;
           long b=0;
           long res=0;
          // res=Integer.parseInt(st.nextToken());
          while(st.hasMoreTokens()){
             
              b=Integer.parseInt(st.nextToken());
               //System.out.println(b);
              if(c=='a')
              res=b;// System.out.println(b+" 1 "+res);}
              else if(c=='*')
              {
                  res=res*b;
                  //System.out.println(b+" * "+res);
              }
              else if(c=='/')
               res=res/b; //System.out.println(b+" / "+res);}
              else if(c=='+')
               res=res+b; //System.out.println(b+" + "+res);}
              else if(c=='-')
              res=res-b;// System.out.println(b+" - "+res);}
                c=st.nextToken().charAt(0);
                //System.out.println(c);
              
           }
           //br.readLine();
           System.out.println(res);
       }
        
    }
}
