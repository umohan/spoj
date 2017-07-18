import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class OwnDatatype {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        final int arr[]=new int[n];
        ArrayList<ArrayList<Node>> ar=new ArrayList<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int max=0;
        int index=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(st.nextToken());
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }
        for(int i=0;i<n;i++)
            ar.add(new ArrayList<Node>());
        for(int i=0;i<n-1;i++)
        {
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            ar.get(a).add(new Node(b));
            ar.get(b).add(new Node(a));
        }  
        PriorityQueue<Integer> pq;
        pq = new PriorityQueue<Integer>(n,
                new Comparator<Integer>()
                {
                    public int compare(Integer p, Integer q)
                    {
                        return arr[p]-arr[q];
                    }
                } );
        int ms=max;
        boolean bb[]=new boolean[n];
        pq.add(index);
        while(!pq.isEmpty())
        {
            int a=pq.poll();
            for(Node at:ar.get(a))
            {
                System.out.println(at.node);
            }
        }
    }
}
class Node
{
    public int node;
    public int cost;
    public Node(int n)
    {
        node = n;
        cost=1;
    }
}
