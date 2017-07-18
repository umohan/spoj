import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class CPRMT {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a;
        String b;
        while((a=br.readLine())!=null)
        {
            b=br.readLine();
            char aa[]=a.toCharArray();
            char bb[]=b.toCharArray();
            Arrays.sort(aa);
            Arrays.sort(bb);
            String r="";
            int i=0;int j=0;
           for(;i<aa.length&&j<bb.length;)
           {
               if(aa[i]==bb[j])
               {
                   r=r+aa[i];
                   i++;j++;
               }
               else if(aa[i]>bb[j])
                   j++;
               else
                   i++;
           }
           System.out.println(r);
        }
    }
}
