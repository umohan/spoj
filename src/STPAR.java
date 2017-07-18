import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Stack;
class STPAR {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(3>2)
        {
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            if(n==0)
                break;
            int arr[]=new int[n];
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            Stack<Integer> sq2=new Stack();
            int a=0;
            int i=0;
            boolean bb=false;
           while(i<n)
           {
               bb=false;
               if(arr[i]==a+1)
               {
                   bb=true;
                   a=a+1;
                   i++;
               }
               if(sq2.size()>0&&sq2.peek()==a+1)
               {
                   while(sq2.size()>0&&sq2.peek()==a+1)
                   {
                       sq2.pop();
                       a+=1;
                   }
               }
               if(!bb)
               {
                   sq2.push(arr[i]);
                   i++;
               }
//               System.out.println(a);
//               System.out.println(sq2.toString());
           }
           if(sq2.size()==0)
               System.out.println("yes");
           else
               System.out.println("no");
           
        }
        
    }
}
