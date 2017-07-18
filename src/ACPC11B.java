import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class ACPC11B {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            st=new StringTokenizer(br.readLine());
            int m=Integer.parseInt(st.nextToken());
            int arrr[]=new int[m];
            for(int i=0;i<m;i++)
                arrr[i]=Integer.parseInt(st.nextToken());
           int min=Integer.MAX_VALUE;
           for(int i=0;i<n;i++)
           {
               for(int j=0;j<m;j++)
               {
                   int dif=arr[i]-arrr[j];
                   if(dif<0) dif*=-1;
                   if(dif<min)
                       min=dif;
                   
               }
               if(min==0)
                   break;
           }
           System.out.println(min);
        }
    }
}
