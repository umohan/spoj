import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class RPLC {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int a=1;a<=t;a++)
    {
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        long min=0;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum<min)
                min=sum;
        }
        min*=(-1);
        min+=1;
        System.out.println("Scenario #"+a+": "+min);
    }
}
}
