import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
class Buglife {
    static ArrayList<ArrayList<Integer>> ar;
    static boolean visit[];
    static int cc[];
    public static void main(String[]args)throws Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int test=Integer.parseInt(br.readLine());
       int hh=0;
       while(test-->0)
       {hh++;
           ar =new ArrayList<ArrayList<Integer>>();
           StringTokenizer st=new StringTokenizer(br.readLine());
           int no=Integer.parseInt(st.nextToken());
           int n=Integer.parseInt(st.nextToken());
           visit=new boolean[no+1];
           cc=new int[no+1];
           for(int i=0;i<=no;i++)
               ar.add(new ArrayList<Integer>());
           for(int i=0;i<n;i++)
           {
               st=new StringTokenizer(br.readLine());
               int a=Integer.parseInt(st.nextToken());
               int b=Integer.parseInt(st.nextToken());
               ar.get(a).add(b);
               ar.get(b).add(a);
           }
           for(int i=0;i<cc.length;i++)
               cc[i]=4;
           int r=0;
         for(int i=1;i<=no;i++)
           {
               if(!visit[i])
               {
                   cc[i]=0;
                   r=dfs(i,0);
               }
               if(r==10)
               {
                   System.out.println("Scenario #"+hh+":\nSuspicious bugs found!");
                   break;
               }
           }if(r==5)
           System.out.println("Scenario #"+hh+":\nNo suspicious bugs found!");
            for(int i=0;i<cc.length;i++)
               System.out.println(i+" - "+cc[i]);
        }
    }
    public static int dfs(int v,int k)
    {
         int r=5;     
        visit[v] = true;
        cc[v]=k;
        for(int w : ar.get(v)){
            if(!visit[w]){
                r=dfs(w,(k+1)%2);
            }
           else if((visit[w])&&(cc[w]==k))
            {
                r=10;
                System.out.println(v+" "+w);
                break ;
            }
        }
    return r;
    }
}
