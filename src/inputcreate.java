import java.io.*;
import java.util.Random;
class inputcreate {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=0;
        Random rd=new Random();
        t=96;
        PrintWriter w = new PrintWriter(new FileWriter("input01.txt"));
        w.println(t+2);
        while(t-->0)
        {
            if(t==3)
            {
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<4000;i++)
                    sb.append("10");
                for(int j=0;j<4000;j++)
                    sb.append("0");
                w.println(sb);
            }
           int s=rd.nextInt(120000);
           StringBuilder sb=new StringBuilder();
           while(s-->0)
           {
               sb.append(rd.nextInt(120)%2);
           }
            w.println(sb);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<400;i++)
            sb.append('1');
        for(int j=0;j<400;j++)
            sb.append("00");
        w.println(sb);
        w.close();
    }
}
    
