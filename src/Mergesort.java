import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.TreeSet;
public class Mergesort {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        String fake=br.readLine();
        while(test-->0)
        {
            
            int n=Integer.parseInt(br.readLine());
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
               arr[i]=Integer.parseInt(br.readLine());
            fake=br.readLine();
          //  long inv=0;
           // int temp=0;
          long ress=mergesort(arr,0,n-1,0);
            System.out.println(ress);
        }
    }
    static long mergesort(int arr[],int p,int r,long ress)
        {
           if(r>p)
            {
                int q=(p+r)/2;
                ress=ress+mergesort(arr,p,q,0);
                ress=ress+mergesort(arr,q+1,r,0);
                ress=ress+merge(arr,p,q,r,0);
            }
           return ress;
        }
    static long merge(int arr[],int p,int q,int r,long ress)
    {
        int l1=q-p+1;
        int r1=r-q;
        int ar[]=new int[l1+1];
        int ar2[]=new int[r1+1];
        for(int i=0;i<l1;i++)
            ar[i]=arr[p+i];
        for(int i=0;i<r1;i++)
            ar2[i]=arr[q+i+1];
        ar[l1]=100000000;
        ar2[r1]=100000000;
        int i=0;int j=0;
        for(int k=p;k<=r;k++)
        {   if(ar[i]<=ar2[j])
            {
                
                arr[k]=ar[i];i++;
            }
        else
        {   
            ress=ress+l1-i;
        arr[k]=ar2[j]; j++;}
        }
       return ress;
    }
    
}
