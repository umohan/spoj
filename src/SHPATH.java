import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class SHPATH {
    static int arr[][];
    static int n;
    static ArrayList<ArrayList<Integer>> ar;
    static int dj[];
    static String name[];
    static int done[][];
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            n=Integer.parseInt(br.readLine());
            name=new String[n];
            arr=new int[n][n];
            ar=new ArrayList<>();
            for(int i=0;i<n;i++)
                ar.add(new ArrayList<Integer>());
             StringTokenizer st;
             HashMap<String,Integer> hm=new HashMap<>();
            for(int j=0;j<n;j++)
            {
                name[j]=br.readLine().trim();
                hm.put(name[j], j);
                int m=Integer.parseInt(br.readLine());
                for(int i=0;i<m;i++)
                {
                    st=new StringTokenizer(br.readLine());
                    int te=Integer.parseInt(st.nextToken())-1;
                    int te2=Integer.parseInt(st.nextToken());
                    ar.get(j).add(te);
                    arr[j][te]=te2;
                }
            }
           done=new int[n][n];
           int k=Integer.parseInt(br.readLine());
           for(int i=0;i<k;i++)
           {
               st=new StringTokenizer(br.readLine());
               String in1=st.nextToken().trim();
               String in2=st.nextToken().trim();
               int ind1=hm.get(in1);
               int ind2=hm.get(in2);
               System.out.println(dijiktra(ind1,ind2));
           }
           br.readLine();
        }
    }
    public static int dijiktra(int s,int f)
    {
        if(done[s][f]!=0)
            return done[s][f];
        else{
       dj=new int[n];
       Arrays.fill(dj,Integer.MAX_VALUE);
       dj[s]=0;
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>(n,
        new Comparator<Integer>()
            {
                public int compare(Integer p, Integer q)
                {
                    return dj[p] - dj[q];
                }
            } );
       pq.offer(s);
       while(!pq.isEmpty())
       {
           int min=pq.poll();
           done[s][min]=dj[min];
          // System.out.println(min+"poll  "+sp[min]);
           if(min==f)
           {
               break;
           }
           for(int i=0;i<ar.get(min).size();i++)
           {
               int tt=ar.get(min).get(i);
               if(dj[tt]>(dj[min]+arr[min][tt]))
               {
                   dj[tt]=dj[min]+arr[min][tt];
                    pq.offer(tt);
               }
            }
       }
       return dj[f];
    }
    }
   
}