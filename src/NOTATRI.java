import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;
class NOTATRI {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    while(3>2)
    {
        if(n==0)
            break;
        int arr[]=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int res=0;
        for(int i=2;i<n;i++)
        {
            int l=0;
            int r=i-1;
            while(l<r)
            {
                if(arr[l]+arr[r]<arr[i])
                { res+=(r-l);
                  l++;
                }
                else
                    r--;
            }
        }
        System.out.println(res);
        n=Integer.parseInt(br.readLine());
    }
}
}
