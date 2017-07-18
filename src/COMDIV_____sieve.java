
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class COMDIV_____sieve {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean pp[]=new boolean[1002];
        int p[]=new int[1002];
        int in=0;
        p[in++]=2;
        p[in++]=3;
        int step=4;
        for(int i=5;i<=1001;step=6-step,i+=step)
            if(!pp[i])
            {
                p[in++]=i;
                for(int j=i*2;j<=1001;j+=i)
                    pp[j]=true;
            }
     /*  for(int i=0;i<=1001;i++)
            System.out.println(i+" "+pp[i]+" "+p[i]);*/
         int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
         StringTokenizer st=new StringTokenizer(br.readLine());
         int a=Integer.parseInt(st.nextToken());
         int b=Integer.parseInt(st.nextToken());
         int g=gcd(a,b);
         if(g==1)
         {
             System.out.println(1);
             continue;
         }
         int res=1;
         int i=0;
         int c=0;
         while((g>=p[i])&&(i<in)&&(g>1))
         {
             while(g%p[i]==0)
             {
               c++; 
               g=g/p[i];
             }
             res=res*(c+1);
             c=0;
             i++;
         }
        if(g>1)
            res*=2;
         System.out.println(res);
        }
        
    }
     public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
