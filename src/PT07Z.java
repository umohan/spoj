import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
class PT07Z 

{
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        if(n==0)
        {
            System.out.println(0);
        }else{
        int arr[]=new int[n-1];
        ArrayList<ArrayList<Integer>> li=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++)
            li.add(new ArrayList<Integer>());
        boolean b1[]=new boolean[n+1];
       for(int i=0;i<n-1;i++)
       {
           String s[]=br.readLine().split(" ");
           int a=Integer.parseInt(s[0]);
           int b=Integer.parseInt(s[1]);
           li.get(a).add(b);
           li.get(b).add(a);
       }
      
       System.out.println(dfsc(li,1,0,b1));}
    }
    public static int dfsc(ArrayList<ArrayList<Integer>> li,int r,int l,boolean []b1)
    {
        b1[r]=true;
        int max1=0;
        int max=0;
        int arr[]=new int[li.get(r).size()+1];
        arr[0]=l;l++;
        int c=1;
        for(int i:li.get(r))
        {
            if(!b1[i])
            arr[c]=dfsc(li,i,l,b1);
            c++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max1=max;
                max=arr[i];
            }
            else if(arr[i]>max1)
                max1=arr[i];
        }
        return max+2+max1;
    }
}
