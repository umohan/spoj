import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.StringBuffer;
public class TOANDFRO {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            String s=br.readLine();
            int temp=s.length()/t;
            char cc[][]=new char[temp][t];
            String ss[]=new String[temp];
            
            int count=0;
            for(int i=0;i<temp;i++)
            {
               String s2=s.substring(count,count+t);
                    StringBuffer sss=new StringBuffer(s2);
                            count=count+t;
                    if(i%2==1)
                        sss=sss.reverse();
                    ss[i]=sss.toString();
                    cc[i]=ss[i].toCharArray();
                    
            }
            for(int i=0;i<t;i++)
            {
                for(int j=0;j<temp;j++)
                    System.out.print(cc[j][i]);
            }System.out.println();
            t=Integer.parseInt(br.readLine());
                   
            
        }
    }
}
