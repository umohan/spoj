import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class histogra {
    static long tree[][];
    static int val[][];
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=st.countTokens();
        int arr[]=new int[n];
        int f=Integer.parseInt(st.nextToken());
        if((n==1)&&(f==0))
            System.exit(0);
        int h=(int)Math.pow(2, Math.ceil((Math.log(n))/(Math.log(2))));
        h=(h*2)-1;
        tree=new long[h][3];
        val=new int[h][3];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());
    }
    public void update(long tree[][],int s,int l,int p,int arr[])
    {
        if(s==l)
        {
            tree[p][0]=arr[s];
            tree[p][1]=arr[s];
            tree[p][2]=arr[s];
            val[p][0]=1;
            val[p][1]=1;
            val[p][2]=1;
        }
        else
        {
         int mid=(l+s)/2;
         update(tree,s,mid,2*p,arr);
         update(tree,mid+1,s,2*p+1,arr);
         tree[p][1]=Math.max(tree[2*p][1], tree[2*p+1][1]);
         
        }
    }
}
