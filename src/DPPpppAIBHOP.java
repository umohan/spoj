import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class DPPpppAIBHOP {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer s=new StringTokenizer(br.readLine());
            char c[]=s.nextToken().toCharArray();
            int cc=c.length;
           int arr[][]=new int[cc+1][cc+1];
            Integer res= callme(0,cc-1,c,arr);
            System.out.println(cc-res);
       
        }
       
    }
   private static int callme(int i,int j,char c[],int arr[][])
    {
        if(arr[i][j]!=0)
            return arr[i][j];
        if(i>j)
            return 0;
        else
        {
        if(c[i]==c[j])
        {
            if(i==j)
               return arr[i][j]=1;
            else if(i+1==j)
                return arr[i][j]=2;
            else
                return arr[i][j]=2+callme(i+1,j-1,c,arr);
        }
 
            return arr[i][j]=Math.max(callme(i+1,j,c,arr),callme(i,j-1,c,arr));
        }
    
    }
}
