import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;
class AMR10G {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            long arr[]=new long[n];
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            if(k<=1)
                System.out.println(0);
            else
            {
                Arrays.sort(arr);
                long max=Long.parseLong("10000000000");
                long temp=0;
                for(int i=0;i<n-k+1;i++)
                {
                    temp=arr[i+k-1]-arr[i];
                    if(temp<max)
                        max=temp;
                }
                System.out.println(max);
            }
        }
    }
}
