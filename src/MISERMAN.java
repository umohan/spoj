import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class MISERMAN {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==0)
                    arr[i][j]=Math.min(arr[i-1][j],arr[i-1][j+1])+arr[i][j];
                else if(j==m-1)
                    arr[i][j]=Math.min(arr[i-1][j],arr[i-1][j-1])+arr[i][j]; 
                else
                {
                int t=Math.min(arr[i-1][j-1],arr[i-1][j]);
                arr[i][j]=Math.min(t,arr[i-1][j+1])+arr[i][j];
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
            if(arr[n-1][i]<min)
                min=arr[n-1][i];
        System.out.println(min);
    
    }
}
