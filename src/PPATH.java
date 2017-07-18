import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
class PPATH {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         boolean pp[]=new boolean[10002];
        for(int i=2;i<=10001;i++)
            if(!pp[i])
            {
                for(int j=i*2;j<=10001;j+=i)
                    pp[j]=true;
            }
        int t=Integer.parseInt(br.readLine());
        k: while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            String aa=st.nextToken();
            String bb=st.nextToken();
            int a=Integer.parseInt(aa);
            int b=Integer.parseInt(bb);
            if(a==b){
                System.out.println(0);
                continue k;}
            int arr[]=new int[10002];arr[a]=0;
            boolean bo[]=new boolean[10001];
            StringBuilder sb=new StringBuilder();
            ArrayDeque<String> ab=new ArrayDeque<String>(); 
            ab.add(aa);
            bo[a]=true;
            int c=0;
            int p=a;
            String pr="";
            int co=0;
            h:  while(!ab.isEmpty())
            {   co++;
                String curr=ab.getFirst();
                ab.removeFirst();
                int n=arr[Integer.parseInt(curr)];
                for(int i=0;i<4;i++)
                {
                   for(int j=0;j<=9;j++)
                   {
                      if (i==0&&j==0)continue;
                       pr = curr.substring(0, i) + j + curr.substring(i + 1);
                       c=Integer.parseInt(pr);
                      // System.out.println(c);
                       if((!bo[c])&&(!pp[c]))
                       {
                           ab.add(pr);
                           arr[c]=n+1;
                           bo[c]=true;
                           if(c==b)
                           {
                               System.out.println(1+n);
                                continue k;
                           }
                           //System.out.println(arr[c]+" "+n);
                       }//System.out.println(co);
                   }
                }
                
            }
            System.out.println("Impossible");
        }
    }
}
