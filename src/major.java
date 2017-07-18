import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class major {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while(n-->0)
        {
            boolean b=false;
            int t=Integer.parseInt(br.readLine());
            if(t==0)
                System.out.println("NO");
            else{
            int arr[]=new int[t];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<t;i++)
               arr[i]=Integer.parseInt(st.nextToken());
             int a=cand(arr,t);
           
           if(a!=-1)
               System.out.println("YES "+a);
           else
               System.out.println("NO");
        }}
    }
 static int cand(int arr[],int size)
    {
        int m=0;int c=1;
        for(int i=1;i<size;i++)
        {
            if(arr[i]==arr[m])
                c++;
              else
                c--;
            if(c==0)
            {
                m=i;
                c++;
            }
        }
   
        int cc=0;
        int a=arr[m];
        for(int i=0;i<size;i++)
            if(arr[i]==a)
                cc++;
       if(cc>size/2)
          return arr[m];
       else
         return -1;
    }
}
