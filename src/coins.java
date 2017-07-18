import java.io.InputStreamReader;
import java.io.BufferedReader;
class coins {
    static int arr[];
    static int n;
   public static void main(String[]args)throws Exception
   {
       n=10000001;
       arr=new int[n];
       for(int i=0;i<12;i++)
           arr[i]=i;
       for(int i=12;i<n;i++)
       {
           int temp=arr[i/2]+arr[i/3]+arr[i/4];
           arr[i]=Math.max(i,temp);
           //System.out.println(i+" "+arr[i]);
       }
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String s="";
   while((s=br.readLine())!=null)
   {
       int t=Integer.parseInt(s);
       if(t<=n)
           System.out.println(arr[t]);
       else
           System.out.println(callme(t));
       //s=br.readLine();
   }
   }
   public static long callme(int a)
   {
       int x=a/2;int y=a/3;int z=a/4;
       long r,s,t;
       if(n<x)
         r=callme(x);
       else
           r=arr[x];
       if(n<y)
           s=callme(y);
       else
           s=arr[y];
       if(n<z)
           t=callme(z);
       else
           t= arr[z];
       //System.out.println(a+" "+(r+s+t));
       return Math.max((r+s+t),a);
   }
}
