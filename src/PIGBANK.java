import java.io.*;
import java.util.StringTokenizer;
public class PIGBANK {
    public static void main(String[]args)throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
      int t=Integer.parseInt(br.readLine());
      while(t-->0)
      {
          StringTokenizer st=new StringTokenizer(br.readLine());
          int w=(-1)*Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
          dp=new int[w+1];
          n=Integer.parseInt(br.readLine());
          arr=new int[n][2];
          for(int i=0;i<n;i++)
          {
             st=new StringTokenizer(br.readLine());
             arr[i][0]=Integer.parseInt(st.nextToken());
             arr[i][1]=Integer.parseInt(st.nextToken());
          }
          int res=calc(w);
          if(res>=1000000000)
              System.out.println("This is impossible.");
          else
          System.out.println("The minimum amount of money in the piggy-bank is "+res+".");
         /* for(int i=0;i<=w;i++)
              System.out.println(i+" "+dp[i]);*/
      }
    }
    private static int n;
    private static int arr[][];
    private static int dp[];
    static int calc(int w)
    {
        if(w==0)
            return 0;
       else if(w<0)
            return 1000000000;
       
       else if(dp[w]==0)
       {
        int min=Integer.MAX_VALUE;
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {  
            ar[i]=calc(w-arr[i][1])+arr[i][0];
            if((ar[i]<min)&&(ar[i]>-1))
                min=ar[i];
        }
        dp[w]=min;
       }
        return dp[w];
    }
}
