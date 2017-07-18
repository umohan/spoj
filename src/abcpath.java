import java.io.BufferedReader;
//need the testcases for wrong input
import java.io.InputStreamReader;
class abcpath {
    static char ca[][];
    static int val[][];
    static boolean visit[][];
    static int a;
    static int b;
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int cnt=0;
        a=Integer.parseInt(s[0]);
        b=Integer.parseInt(s[1]);
        while((a!=0)&&(b!=0))
        {
            cnt++;
            ca=new char[a][b];
            val=new int[a][b];
            visit=new boolean[a][b];
            for(int i=0;i<a;i++)
                ca[i]=br.readLine().trim().toCharArray();
            int max=0;
          for(int i=0;i<a;i++)
          {
              for(int j=0;j<b;j++)
                  if(ca[i][j]=='A')
                  {
                      int temp=res(i,j)+1;
                      if(temp>max)
                         max=temp; 
                  }
          }
          for(int i=0;i<a;i++)
          {
              for(int j=0;j<b;j++)
                  System.out.print(val[i][j]);
           System.out.println();
          }
          
          System.out.println("Case "+cnt+": "+(max));
        s=br.readLine().split(" ");
        a=Integer.parseInt(s[0]);
        b=Integer.parseInt(s[1]);
        }
    }
    
    
    public static int res(int d,int r)
    {
        char c=(char)(ca[d][r]+1);
        int q=0,w=0,e=0,t=0,y=0,u=0,o=0,p=0;
        visit[d][r]=true;
      // System.out.println(c+" "+d+" "+r);
        if((d<a-1)&&(r<b-1)&&(ca[d+1][r+1]==c))
            if((visit[d+1][r+1]))
                q=1+val[d+1][r+1];
            else
                q=1+res(d+1,r+1);
        
        if((d<a-1)&&(r>0)&&(ca[d+1][r-1]==c))
            if((visit[d+1][r-1]))
                q=1+val[d+1][r-1];
            else 
                w=1+res(d+1,r-1);
        
        if((d<a-1)&&(ca[d+1][r]==c))
            if((visit[d+1][r]))
                 q=1+val[d+1][r];
            else
                e=1+res(d+1,r);
        
        if((d>0)&&(r<b-1)&&(ca[d-1][r+1]==c))
            if(visit[d-1][r+1])
                 q=1+val[d-1][r+1];
            else
                q=1+res(d-1,r+1);
        
        if((d>0)&&(r>0)&&ca[d-1][r-1]==c)
            if(visit[d-1][r-1])
                 q=1+val[d-1][r-1];
            else
                q=1+res(d-1,r-1);
        
        if((d>0)&&ca[d-1][r]==c)
            if(visit[d-1][r])
                 q=1+val[d-1][r];
            else
                q=1+res(d-1,r);
        
        if((r<b-1)&&(ca[d][r+1]==c))
            if(visit[d][r+1])
                 q=1+val[d][r+1];
            else
                q=1+res(d,r+1);
        
        if((r>0)&&(ca[d][r-1]==c))
            if(visit[d][r-1])
                 q=val[d][r-1];
            else
                q=1+res(d,r-1);
        
        u=Math.max(u,p);
        y=Math.max(y,o);
        t=Math.max(t,u);
        e=Math.max(e,y);
        w=Math.max(w,t);
        q=Math.max(q,e);
        val[d][r]=Math.max(q,w);
        return val[d][r];
    }
}
