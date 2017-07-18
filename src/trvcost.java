import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Comparator;
class trvcost {
    static int arr[][];
    static ArrayList<ArrayList<Integer>> ar;
    static int dj[];
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        arr=new int[501][501];
        ar=new ArrayList<>();
        for(int i=0;i<501;i++)
            ar.add(new ArrayList<Integer>());
        StringTokenizer st;
        for(int i=0;i<n;i++)
        {
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());
            arr[a][b]=w;
            arr[b][a]=w;
            ar.get(a).add(b);
            ar.get(b).add(a);
        }
        int in=Integer.parseInt(br.readLine());
            dijiktra(in);
            int m=Integer.parseInt(br.readLine());
            for(int i=0;i<m;i++)
            {
                int r=Integer.parseInt(br.readLine());
                if(dj[r]==Integer.MAX_VALUE)
                    System.out.println("NO PATH");
                else
                    System.out.println(dj[r]);
            }
    }
    
    public static void dijiktra(int a)
    {
        dj=new int[501];
        Arrays.fill(dj,Integer.MAX_VALUE);
        dj[a]=0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(501,
        new Comparator<Integer>()
            {
                @Override
                public int compare(Integer p, Integer q)
                {
                    return dj[p] - dj[q];
                }
            } );
        pq.offer(a);
        while(!pq.isEmpty())
        {
            int x=pq.poll();
            for(int i=0;i<ar.get(x).size();i++)
            {
                int te=ar.get(x).get(i);
                int s=dj[x]+arr[x][te];
                if(s<dj[te])
                {
                    dj[te]=s;
                    pq.offer(te);
                }
            }
        }
    }
    
}
