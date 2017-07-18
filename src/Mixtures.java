import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class Mixtures {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null)
        {
            int n=Integer.parseInt(s);
            int arr[]=new int[n];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            int a1[][]=new int[n][n];
            int r1[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
                int a=0;
               for(int j=i;j<n;j++)
               {
                   if(i==0)
                   {
                       a1[j][j]=0;
                       r1[j][j]=arr[j];
                   }
                   else
                   {
                       a1[a][j]=Integer.MAX_VALUE;
                       for(int k=a;k<j;k++)
                       {
                           int q=a1[a][k]+a1[k+1][j]+r1[a][k]*r1[k+1][j];
                           if(q<a1[a][j])
                           {
                              a1[a][j]=q;
                               r1[a][j]=(r1[a][k]+r1[k+1][j])%100;
                           }
                       }
                       a++;
                   }
                   
               }
            }
//            for(int i=0;i<n;i++)
//            {
//                for(int j=0;j<n;j++)
//                {
//                    System.out.print(a1[i][j]+" ");
//                }
//                System.out.println();
//            }
            System.out.println(a1[0][n-1]);
        }
    }
}
 