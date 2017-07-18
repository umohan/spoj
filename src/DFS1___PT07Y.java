
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class DFS1___PT07Y {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int flag=0;
        if(m!=n-1)
        {
            System.out.println("NO");
            System.exit(0);
        }
        else
        {
            ArrayList<ArrayList<Integer>> li=new ArrayList<ArrayList<Integer>>();
            for(int i=0;i<=n;i++)
                li.add(new ArrayList<Integer>());
            boolean b[]=new boolean[n+1];
            int k=0;
            for(int i=0;i<m;i++)
            {
                String ss[]=br.readLine().split(" ");
                k=Integer.parseInt(ss[0]);
                int j=Integer.parseInt(ss[1]);
                li.get(k).add(j);
            }
                dfs_rec(li,b,1);
for(int i=1;i<=n;i++)
    if(!b[i])
    {
        System.out.println("NO");
        System.exit(0);
    }
                
                System.out.println("YES");
        }
    }
    private static void dfs_rec(ArrayList<ArrayList<Integer>> adjLists, boolean[] visited, int v)
    {     
        visited[v] = true;
        for(int w : adjLists.get(v)){
            if(!visited[w]){
                
                dfs_rec(adjLists, visited, w);
            }
           else if(visited[w])
            {
                System.out.println("NO");
                System.exit(0);
            }
        }
    }
     

 
}
