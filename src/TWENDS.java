import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class TWENDS {
    static int arr[];
    static int mema[][];
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(br.readLine());
    int c=0;
    while(3>2)
    {
        c+=1;
        int n=Integer.parseInt(st.nextToken());
        if(n==0)
            break;
        else
        {
           arr=new int[n];
           for(int i=0;i<n;i++)
               arr[i]=Integer.parseInt(st.nextToken());
           mema=new int[n][n];
           System.out.println("In game "+c+", the greedy strategy might lose by as many as "+callme(0,n-1)+" points.");
           st=new StringTokenizer(br.readLine());
        }
    }
}
public static int callme(int s,int r)
{
    if(mema[s][r]!=0)
        return mema[s][r];
    int a=0;
    int b=0;
    
    if(r==(s+1))
    {
        a=Math.max(arr[s],arr[r]);
        b=Math.min(arr[s],arr[r]);
        mema[s][r]=a-b;
    }
    else
    {
        a=arr[s];
        if(arr[s+1]>=arr[r])
        {
            a-=arr[s+1];
            a+=callme(s+2,r);
        }
        else{
            a-=arr[r];
            a+=callme(s+1,r-1);
        }
        b=arr[r];
        if(arr[s]>=arr[r-1])
        {
            b-=arr[s];
            b+=callme(s+1,r-1);
        }
        else{
            b-=arr[r-1];
            b+=callme(s,r-2);
        }
       mema[s][r]=Math.max(a,b);
         //System.out.println(a+"  "+b);
    }
    return mema[s][r];
}
}
