import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
public class diehard {
    static int arr[][];
    static int res;
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
             arr=new int[a+1][b+a]; 
            System.out.println(callme(a,b));
        }
    }
    static int callme(int a,int b)
    {
        
     if((a<=0)||(b<=0))
            return -1;
        if(arr[a][b]!=0)
            return arr[a][b];
        else{
            arr[a][b]=Math.max(callme(a-17,b+7)+2,callme(a-2,b-8)+2);
        return arr[a][b];}
    }
}
