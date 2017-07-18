import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
class Phonelist {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        hh: while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            String ar[]=new String[n];
            for(int j=0;j<n;j++)
              ar[j]=br.readLine();
            Arrays.sort(ar);
            for(int i=1;i<n;i++)
                if(ar[i].startsWith(ar[i-1]))
                {
                    System.out.println("NO");
                    continue hh;
                }
            System.out.println("YES");
        }
    }
}
