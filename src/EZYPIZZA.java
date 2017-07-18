import java.io.InputStreamReader;
import java.io.BufferedReader;
class EZYPIZZA {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
       int h=0;
       int j=0;
       int k=0;
       while(n-->0)
       {
           String s=br.readLine();
           if(s.compareTo("1/4")==0)
               h++;
           else if(s.compareTo("1/2")==0)
               j++;
           else
               k++;
       }
       //System.out.println(h+" "+j+" "+k);
       int res=k;
       h=h-k;
       res=res+j/2;
       if(j%2==1)
       {
           res=res+1;
           h=h-2;
       }
       if(h>0)
       { res=res+h/4;
       if(h%4>0)
           res++;}
       System.out.println(res+1);
    }
}
