import  java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class Hotels {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        long m=Long.parseLong(st.nextToken());
        long sum=0;
        long res=0;
        int p=0;
        int arr[]=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
        {
           arr[i]=Integer.parseInt(st.nextToken());
           sum=sum+arr[i];
           if(sum>m)
           {
              while(sum>m)
              {
                  sum=sum-arr[p];
                  p++;
              }
           }
           if(sum>res)
           {
               res=sum;
              
           }
        }
        System.out.println(res);
    }
}
