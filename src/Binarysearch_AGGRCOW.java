import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;
class Binarysearch_AGGRCOW {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int arr[]=new int[a];
            for(int i=0;i<a;i++)
                arr[i]=Integer.parseInt(br.readLine());
            Arrays.sort(arr);
            System.out.println(binary(0,(arr[a-1]-arr[0]),arr,b));
        }
       
    }
    public static int binary(int lo,int hi,int[] arr,int k)
    {
        int mid=(lo+hi)>>1;
       // System.out.println(lo+" "+mid+" "+hi+" "+k);
        if(mid==lo)
        {
           if(isvalid(hi,arr,k))
               lo=hi;
           return lo;
        }
        else
        {
            if(isvalid(mid,arr,k))
                lo=mid;
            else
                hi=mid-1;
            return binary(lo,hi,arr,k);
        }
        
    }
    public static boolean isvalid(int n,int[] arr,int k)
    {
        int temp=0;
        int ll=0;
        for(int i=0;i<arr.length-1;i++)
        {
            temp=temp-arr[i]+arr[i+1];
            if(temp>=n)
            {
                ll++;
                temp=0;
              
            }
            //System.out.println(temp+"+"+ll);
            
        }
        if(ll>=k-1)
            return true;
        else
            return false;
    }
            
}
