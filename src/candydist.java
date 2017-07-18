import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;
class candydist {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    while(n>0)
    {
        StringTokenizer st=new StringTokenizer(br.readLine());
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=Long.parseLong(st.nextToken());
        st=new StringTokenizer(br.readLine());
        long ar1[]=new long[n];
        for(int i=0;i<n;i++)
            ar1[i]=Long.parseLong(st.nextToken());
        Arrays.sort(arr);
        Arrays.sort(ar1);
        long res=0;
        int in=n-1;
        for(int i=0;i<n;i++,in--)
        {
            res+=(arr[i]*ar1[in]);
            
        }
        System.out.println(res);
        n=Integer.parseInt(br.readLine());
    }
}
}
