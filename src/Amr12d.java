import java.io.*;
import java.util.*;
class Amr12d {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s=br.readLine();
           char cc[]=s.toCharArray();
           String c="";
           for(int i=0;i<s.length();i++)
               c=cc[i]+c;
          // System.out.println(c);
           if(s.hashCode()==c.hashCode())
               System.out.println("YES");
           else
               System.out.println("NO");
        }
    }
}
