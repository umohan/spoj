import java.io.InputStreamReader;
import java.io.BufferedReader;
public class AE00 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        long sum=i;
        for(int j=2;j*j<=i;j++)
        {int n=j;
           for(int k=j;k<=i;k++)
           {
              if(k*n>i)
                  break;
                 sum++;
              System.out.println(j+" "+(n*j)+" "+sum);
               
           }
        }
        System.out.println(sum);
    }
}
    