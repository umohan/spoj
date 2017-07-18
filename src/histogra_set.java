import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Stack;
class histogra_set {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st=new StringTokenizer(br.readLine());
        while(3>2){
        int n=st.countTokens();
        long arr[]=new long[n];
        int f=Integer.parseInt(st.nextToken());
        if((n==1)&&(f==0))
            System.exit(0);
        arr[0]=f;
         for(int i=1;i<n;i++)
            arr[i]=Long.parseLong(st.nextToken());
         System.out.println(getMaxArea(arr,n));
         st=new StringTokenizer(br.readLine());
        }
    }
     public static long getMaxArea(long[] arr,int n){
        Stack<Integer> stack = new Stack<>();
        long area=0;
        long max=0;
        int top=0;
        int i=0;
        
        while(i<n){
            if(stack.isEmpty() || arr[stack.peek()]<=arr[i])
                stack.push(i++);
            else{
                top = stack.peek();
                stack.pop();
                area = arr[top] * (stack.isEmpty()?i:i-stack.peek()-1);
                if(max<area)
                    max = area;
            }
        }
        while(!stack.isEmpty()){
            top = stack.peek();
            stack.pop();
            area = arr[top] * (stack.isEmpty()?i:i-stack.peek()-1);
            if(max<area)
                max = area;
        }
        return max;
    }
}
