import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class Busyman {
    public static void main(String[]args)throws Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       while(t-->0)
       {
           int n=Integer.parseInt(br.readLine());
           StringTokenizer st;
           int arr[][]=new int[n][2];
           for(int i=0;i<n;i++)
           {
               st=new StringTokenizer(br.readLine());
               arr[i][0]=Integer.parseInt(st.nextToken());
               arr[i][1]=Integer.parseInt(st.nextToken());
           }
           
           Arrays.sort(arr,new Comparator<int []>(){
       @Override
       public int compare(int[] a1,int[] a2)
       {
           int a=Integer.compare(a1[1],a2[1]);
            return a;
       }
       });
           //boolean bb[]=new boolean[n];
           int count=0;
           int res=0;
           int temp=0;
           for(int i=0;i<n;i++)
           {
               if(arr[i][0]>=temp)
               {
                   res++;
                   temp=arr[i][1];
               }
           }
           System.out.println(res);
       }
    }
}
