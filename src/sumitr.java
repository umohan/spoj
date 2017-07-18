import java.io.*;
import java.util.StringTokenizer;
//Not Submitted due to Space Complexity
class sumitr {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-->0)
    {
        int n=Integer.parseInt(br.readLine());
        int arr[][]=new int[n][n];
        StringTokenizer st;
        for(int i=0;i<n;i++)
        {
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<=i;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
                arr[i][j]=Math.max(arr[i+1][j],arr[i+1][j+1])+arr[i][j];
        }
        System.out.println(arr[0][0]);
    }
}
}
