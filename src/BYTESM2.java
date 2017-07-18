import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class BYTESM2 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
         StringTokenizer st=new StringTokenizer("");
        while(test-->0)
            
        {
            long temp=0;
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            long arr[][]=new long[n][m];
            for(int i=0;i<n;i++)
            {
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<m;j++)
                {
                    arr[i][j]=Integer.parseInt(st.nextToken());
                    if(arr[i][j]>temp)
                        temp=arr[i][j];
                }
            }
            for(int i=1;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(j==0)
                        arr[i][j]=arr[i][j]+(arr[i-1][j+1]>=arr[i-1][j]?arr[i-1][j+1]:arr[i-1][j]);
                    else if(j==(m-1))
                        arr[i][j]=arr[i][j]+(arr[i-1][j-1]>=arr[i-1][j]?arr[i-1][j-1]:arr[i-1][j]);
                    else
                        arr[i][j]=arr[i][j]+((arr[i-1][j-1]>=arr[i-1][j+1]?arr[i-1][j-1]:arr[i-1][j+1])<=arr[i-1][j]?arr[i-1][j]:(arr[i-1][j-1]>=arr[i-1][j+1]?arr[i-1][j-1]:arr[i-1][j+1]));
                     if(arr[i][j]>temp)
                        temp=arr[i][j];
                    // System.out.print(arr[i][j]+" ");
                }
                //System.out.println();
            }
            System.out.println(temp);
        }
    }
}
