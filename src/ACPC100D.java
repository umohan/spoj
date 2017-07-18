import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class ACPC100D {
    public static void main(String[] args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l=0;
        while(3>2){
        int n=Integer.parseInt(br.readLine());
        if(n==0)
            System.exit(0);
        l++;
        long arr[][]=new long[n][3];
        for(int i=0;i<n;i++)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }
        arr[0][2]+=arr[0][1];
        arr[1][0]=arr[1][0]+arr[0][1];
        arr[1][1]=arr[1][1]+Math.min(Math.min(arr[0][1],arr[0][2]),arr[1][0]);
        arr[1][2]=arr[1][2]+Math.min(Math.min(arr[0][1],arr[0][2]),arr[1][1]);
        for(int i=2;i<n;i++)
        {

            arr[i][0]=Math.min(arr[i-1][0],arr[i-1][1])+arr[i][0];
            arr[i][1]=Math.min((Math.min(arr[i-1][0],arr[i-1][1])),Math.min(arr[i-1][2],arr[i][0]))+arr[i][1];
            arr[i][2]=Math.min(Math.min(arr[i-1][1],arr[i-1][2]),arr[i][1])+arr[i][2];
        }
        System.out.println(l+". "+arr[n-1][1]);
    }
    }
}
