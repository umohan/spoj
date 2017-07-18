import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class Farida {
    public static void main(String[]args)throws Exception
    {try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        int c=0;
        while(test-->0)
        {c++;
            int n=Integer.parseInt(br.readLine());
            if(n==0){
                br.readLine();
                System.out.println("Case "+c+": "+0);}
            else{
            StringTokenizer st=new StringTokenizer(br.readLine());
           long arr[]=new long[n];
           for(int i=0;i<n;i++)
               arr[i]=Long.parseLong(st.nextToken());
        long ar[]=new long[n+1];
        for(int i=0;i<n+1;i++)
        {
            if(i==0)
                ar[i]=0;
            else if(i==1)
                ar[i]=arr[i-1];
            else
            ar[i]=Math.max(ar[i-2]+arr[i-1],ar[i-1]);
        }
           System.out.println("Case "+c+": "+ar[n]);
        }
    }}
    catch(Exception e){
    return;}
    
}}
