import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class LABYR1 {
    static char cc[][];
    static boolean bb[][];
    static int cnt[][];
    static int n;
    static int m;
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
        StringTokenizer st=new StringTokenizer(br.readLine());
        m=Integer.parseInt(st.nextToken());
        n=Integer.parseInt(st.nextToken());
        cc=new char[n][m];
        cnt=new int[n][m];
        bb=new boolean[n][m];
        for(int i=0;i<n;i++)
            cc[i]=br.readLine().toCharArray();
        int res=0;
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((cc[i][j]=='.')&&(!bb[i][j]))
                {
                    temp=maxlength(i,j);
                    if(temp>res)
                        res=temp;
                }
               // System.out.print(cnt[i][j]+" ");
            }
            //System.out.println();
        }
        System.out.println("Maximum rope length is "+res+".");
        }
    }
    public static int maxlength(int a,int b)
    {
       bb[a][b]=true;
       int r1=0;
       int r2=0;
       int r3=0;
       int r4=0;
      if(a<n-1)
      {
          if((cc[a+1][b]=='.')&&(!bb[a+1][b]))
          {
              r1=1+maxlength(a+1,b);
          }
      }
      if(b<m-1)
      {
          if((cc[a][b+1]=='.')&&(!bb[a][b+1]))
              r2=1+maxlength(a,b+1);
      }
      if(a>0)
      {
          if((cc[a-1][b]=='.')&&(!bb[a-1][b]))
          {
              r3=1+maxlength(a-1,b);
          }
      }
      if(b>0)
      {
          if((cc[a][b-1]=='.')&&(!bb[a][b-1]))
          {
              r4=1+maxlength(a,b-1);
          }
      }
      r3=Math.max(r3,r4);
      r1=Math.max(r1,r2);
      r1=Math.max(r1,r3);
      return r1;
    }
}
