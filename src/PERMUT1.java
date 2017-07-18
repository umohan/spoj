import java.io.InputStreamReader;
import java.io.BufferedReader;
class PERMUT1 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[99][13];
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            int i,j,m,l;
            for(i=0;i<=k;i++)
                a[i][0]=0;
            for(i=0;i<=n;i++)
                a[0][i]=1;
            for(i=1;i<=k;i++){
                for(j=1;j<=n;j++){
                    m = i;
                    a[i][j]=0;
                    l=0;
                    while(m>=0&&l<j){
                        a[i][j]+=a[m][j-1];
                        l++;
                        m--;
                    }
                }
            }
        System.out.println(a[k][n]);
        }
    }
}
