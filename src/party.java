import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class party {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int w=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        while((w>0)&&(b>0)){
        int arr[][]=new int[b][2];
        int ar[][]=new int[b+1][w+1];
        for(int i=0;i<b;i++)
        {
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<=b;i++)
        {
            for(int j=0;j<=w;j++)
            {
                if((i==0)||(j==0))
                    ar[i][j]=0;
                else
                {
                    if(j-arr[i-1][0]>=0)
                    {
                        ar[i][j]=Math.max(ar[i-1][j],(ar[i-1][j-arr[i-1][0]]+arr[i-1][1]));
                        //System.out.println(arr[i-1][0]+" hii"+arr[i-1][1]+" "+i);
                    }
                    
                    else
                        ar[i][j]=ar[i-1][j];
                }
                //System.out.print(ar[i][j]+" ");
            }//System.out.println();
        }
        int j;
        for(j=w;j>0;j--)
            if(ar[b][j]>ar[b][j-1])
                break;
        System.out.println(j+" "+ar[b][w]);
        br.readLine();
         st=new StringTokenizer(br.readLine());
        w=Integer.parseInt(st.nextToken());
        b=Integer.parseInt(st.nextToken());
        }
    }
}
 