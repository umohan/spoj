import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
class SCPC11B {
    public static void main(String[]args)throws Exception
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int t=Integer.parseInt(br.readLine());
     while(t>0)
     {
         int arr[]=new int[t];
         for(int i=0;i<t;i++)
             arr[i]=Integer.parseInt(br.readLine());
         Arrays.sort(arr);
         boolean b=true;
         for(int i=1;i<t;i++)
             if(arr[i]-arr[i-1]>200)
             {
                 b=false;
                 break;
             }
         if(1422-arr[t-1]>100)
             b=false;
         if(b)
             System.out.println("POSSIBLE");
         else
             System.out.println("IMPOSSIBLE");
         t=Integer.parseInt(br.readLine());
     }
    }
}
