import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
class BYTESE2 {
 public static void main(String[]args)throws Exception
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int t=Integer.parseInt(br.readLine());
     while(t-->0)
     {
         int n=Integer.parseInt(br.readLine());
         long arr[]=new long[n];
         long ar2[]=new long[n];
         
         for(int i=0;i<n;i++)
         {
             String n1[]=br.readLine().split(" ");
             long a=Long.parseLong(n1[0]);
             long b=Long.parseLong(n1[1]);
             arr[i]=a;ar2[i]=b;
         }
         Arrays.sort(arr);
         Arrays.sort(ar2);
         int res=0;
         int max=0;
         int a=0;
         int b=0;
         while(3>2)
         {
             if(a==n)
                 break;
          if(arr[a]<ar2[b])
          {
              a++;
              max++;
              if(max>res)
                  res=max;
          }
          else
          {
              b++;
              max-=1;
          }
         }
         System.out.println(res);
     }
 }
}
