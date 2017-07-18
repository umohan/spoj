import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
class Deque___Arraysub {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
           arr[i]=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(br.readLine());
        if(k==1)
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
        else if(k==2)
        {
            for(int i=0;i<n-1;i++)
                System.out.print(arr[i]>arr[i+1]?arr[i]:arr[i+1]+" ");
        }
        
        else
        {
           ArrayDeque<Integer> ab=new ArrayDeque<Integer>(); 
           int i=0;
          for(;i<k;i++)
          {
              while((!ab.isEmpty())&&(arr[i]>arr[ab.getLast()]))
                      ab.removeLast();
              
              ab.addLast(i);
              //System.out.println(ab+" 1");
          }
          for(;i<n;i++)
          {
              System.out.print(arr[ab.getFirst()]+" ");
              while((ab.getFirst()<=(i-k))&&(!ab.isEmpty()))
                  ab.removeFirst();
              while((!ab.isEmpty())&&(arr[i]>arr[ab.getLast()]))
                      ab.removeLast();
              ab.add(i);
          }
          System.out.print(arr[ab.getFirst()]);
        }
    }
}
