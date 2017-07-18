import java.io.InputStreamReader;
import java.io.BufferedReader;
public class CANTON {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
            int n=Integer.parseInt(br.readLine());
            int ord=(int)(-1+(Math.sqrt(1+4*2*n)))/2;
           // System.out.println(ord+" i,j");
            int dif=n-(ord*(ord+1))/2;
            //System.out.println(dif);
            int i=1;
            int j=1;
            if(ord%2==0)
            {
                i=ord;
                j=1;
                if(dif!=0)
                    i++;
                for(int ll=2;ll<=dif;ll++)
                {
                    i--;
                    j++;
                }
                System.out.println("TERM "+n+" IS "+i+"/"+j);
            }
            else if(ord%2==1)
            {
                j=ord;
                i=1;
                if(dif!=0)
                    j++;
                for(int ll=2;ll<=dif;ll++)
                {
                    j--;
                    i++;
                    
                }
                System.out.println("TERM "+n+" IS "+i+"/"+j);
            }
                            
        }
    }
}
