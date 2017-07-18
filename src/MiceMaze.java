import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.PriorityQueue;
class MiceMaze {
    static int dijik[];
    static ArrayList<ArrayList<Integer>> arr;
    static int cost[][];
    static int ex;
    static int n;
    static int t;
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine().trim());
        ex=Integer.parseInt(br.readLine().trim());
        t=Integer.parseInt(br.readLine().trim());
        cost=new int[n][n];
        int m=Integer.parseInt(br.readLine().trim());
        arr=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
            arr.add(new ArrayList<Integer>());
        for(int i=0;i<m;i++)
        {
            String ss[]=br.readLine().split(" ");
            int b=Integer.parseInt(ss[0]);
            int a=Integer.parseInt(ss[1]);
            int c=Integer.parseInt(ss[2]);
            cost[a-1][b-1]=c;
            arr.get(a-1).add(b-1);
        }
        dijiktra();
//        for(int i=0;i<n;i++)
//            System.out.println(dijik[i]);
        int res=0;
        for(int i=0;i<n;i++)
            if(dijik[i]<=t)
                res+=1;
        System.out.println(res);
    }
    public static void dijiktra()
    {
        dijik=new int[n];
        for(int i=0;i<n;i++)
            dijik[i]=Integer.MAX_VALUE;
        dijik[ex-1]=0;
       PriorityQueue<Point> pq = new PriorityQueue<Point>();
       
       Point current=null;
        pq.offer(new Point(ex-1,0));
        while(!pq.isEmpty())
        {
            current=pq.remove();
            int a=current.id;
            for(int i=0;i<arr.get(a).size();i++)
            {
                int ind=arr.get(a).get(i);
                int distance=cost[a][ind]+current.dist;
            
               if(distance<dijik[ind])
               {
                   dijik[ind]=distance;
                    pq.offer(new Point(ind,dijik[ind]));
               }
                 
            }
        }
    }
    static class Point implements Comparable<Point>{
		int id, dist;

		public Point(int id, int dist){
			this.id = id;
			this.dist = dist;
		}

		public int compareTo(Point p){
			return (this.dist > p.dist) ? 1 : -1;
		}
	}
    
}
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//class MiceMaze {
//    static int dijik[];
//    static int arr[][];
//    static int ex;
//    static int n;
//    static int t;
//    public static void main(String[]args)throws Exception
//    {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        n=Integer.parseInt(br.readLine().trim());
//        ex=Integer.parseInt(br.readLine().trim());
//        t=Integer.parseInt(br.readLine().trim());
//        int m=Integer.parseInt(br.readLine().trim());
//        arr=new int[n][n];
//        for(int i=0;i<n;i++)
//            for(int j=0;j<n;j++)
//                arr[i][j]=-1;
//        for(int i=0;i<m;i++)
//        {
//            String ss[]=br.readLine().split(" ");
//            int b=Integer.parseInt(ss[0]);
//            int a=Integer.parseInt(ss[1]);
//            int c=Integer.parseInt(ss[2]);
//            arr[a-1][b-1]=c;
//        }
//        dijiktra();
////        for(int i=0;i<n;i++)
////            System.out.println(dijik[i]);
//        int res=0;
//        for(int i=0;i<n;i++)
//            if(dijik[i]<=t)
//                res+=1;
//        System.out.println(res);
//    }
//    public static void dijiktra()
//    {
//        dijik=new int[n];
//        for(int i=0;i<n;i++)
//            dijik[i]=Integer.MAX_VALUE;
//        dijik[ex-1]=0;
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(n,
//        new Comparator<Integer>()
//            {
//                public int compare(Integer p, Integer q)
//                {
//                    return dijik[p] - dijik[q];
//                }
//            } );
//        for(int i=0;i<n;i++)
//        {
//            pq.offer(i);
//        }
//        while(!pq.isEmpty())
//        {
//            int a=pq.poll();
//            if(dijik[a]>t)
//                break;
//            for(int i=0;i<n;i++)
//            {
//                 if(arr[a][i]>-1)
//                 {
//                      int sum=arr[a][i]+dijik[a];
//                   dijik[i]=Math.min(sum,dijik[i]);
//                   if(dijik[i]==sum)
//                   {
//                        pq.remove(i);
//                        pq.offer(i);
//                   }
//                 }
//            }
//        }
//    }
//}
// 