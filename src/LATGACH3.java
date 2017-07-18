import java.io.InputStreamReader;
import java.io.BufferedReader;
class LATGACH3 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[][]=new int[31][3];
        arr[0][0]=0;
        arr[0][1]=1;
        arr[0][2]=0;
        arr[1][0]=1;
        arr[1][1]=0;
        arr[1][2]=3;
        for(int i=2;i<=30;i++)
        {
            if(i%2==0)
            {
                arr[i][1]=arr[i-1][0]+arr[i-1][2];
            }
            else
            {
                arr[i][0]=arr[i-1][1];
                arr[i][2]=arr[i][0]*2+arr[i-2][2];
            }
        }
        int n=Integer.parseInt(br.readLine());
        while(n>=0)
        {
            if(n==0)
                System.out.println(1);
            else
                System.out.println(arr[n-1][2]);
            n=Integer.parseInt(br.readLine());
        }
    }
}
