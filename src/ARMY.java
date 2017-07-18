import java.io.InputStreamReader;
import java.io.BufferedReader;
public class ARMY {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
            String s=br.readLine();
            String ss[]=br.readLine().split(" ");
            int n1=Integer.parseInt(ss[0]);
            int n2=Integer.parseInt(ss[1]);
            long max1=0;
            long max2=0;
            String s1[]=br.readLine().split(" ");
            String s2[]=br.readLine().split(" ");
            for(int i=0;i<n1;i++)
            {
                int temp=Integer.parseInt(s1[i]);
                if(temp>max1)
                    max1=temp;
            }
            for(int i=0;i<n2;i++)
            {
                int temp=Integer.parseInt(s2[i]);
                if(temp>max2)
                    max2=temp;
            }
            if(max1>=max2)
                System.out.println("Godzilla");
            
            else if(max1<max2)
                 System.out.println("MechaGodzilla");
        }
    }
}
