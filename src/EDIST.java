import java.io.InputStreamReader;
import java.io.BufferedReader;
public class EDIST {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
            String s1=br.readLine();
            String s2=br.readLine();
            char aa[]=s1.toCharArray();
            char bb[]=s2.toCharArray();
            int a=aa.length;
            int b=bb.length;
            int arr[][]=new int[a+1][b+1];
            for(int i=0;i<a+1;i++)
                arr[i][0]=i;
            for(int i=1;i<b+1;i++)
                arr[0][i]=i;
            for(int i=1;i<a+1;i++)
            {
                char c=aa[i-1];
                for(int j=1;j<b+1;j++)
                {
                    if(c==bb[j-1])
                        arr[i][j]=arr[i-1][j-1];
                    else
                    {
                        int m1=(arr[i][j-1]>=arr[i-1][j]?arr[i-1][j]:arr[i][j-1]);
                        arr[i][j]=(m1>=arr[i-1][j-1]?arr[i-1][j-1]:m1)+1;
                    }
                   // System.out.print(arr[i][j]);
                }
               // System.out.println();
            }
            System.out.println(arr[a][b]);
        }
        
    }
}
