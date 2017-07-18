import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class DPpppppppTRT {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        final int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            arr[i]=Integer.parseInt(st.nextToken());
        }
      int ar[][]=new int[n][n];
      int k=mm(0,n-1,ar,n,arr);
      System.out.println(k);
     /* for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
              System.out.print(ar[i][j]+" ");
          System.out.println();
      } /*/    
       
    }
    static int mm(int f,int l,int ar[][],int n,int arr[])
    {
        if(f>l)
            return 0;
        if(ar[f][l]!=0)
            return ar[f][l];
        int year=n-(l-f+1)+1;
        return (ar[f][l]=Math.max((mm(f+1,l,ar,n,arr)+year*arr[f]),mm(f,l-1,ar,n,arr)+year*arr[l]));
    }
}
