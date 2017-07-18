import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
class CSTREET {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int p=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());
            int m=Integer.parseInt(br.readLine());
            StringTokenizer st;
            int arr[][]=new int[m][3];
            for(int i=0;i<m;i++)
            {
               st=new StringTokenizer(br.readLine());
               arr[i][0]=Integer.parseInt(st.nextToken())-1;
               arr[i][1]=Integer.parseInt(st.nextToken())-1;
               arr[i][2]=Integer.parseInt(st.nextToken());
            }
           Arrays.sort(arr,new Comparator<int []>()
            {
            @Override
            public int compare(int[] o1,int[] o2){
                int a=Integer.compare(o1[2],o2[2]);
                if(a==0)
                    a=Integer.compare(o1[1],o2[1]);
                if(a==0)
                    a=Integer.compare(o1[0],o2[0]);
                return a;
            }
            });
              boolean bb[]=new boolean[n];
              bb[arr[0][0]]=true;
              bb[arr[0][1]]=true;
              long res=arr[0][2];
              for(int i=1;i<n-1;i++)
              {
                  for(int j=1;j<m;j++)
                  {
                      if((bb[arr[j][0]])&&(!bb[arr[j][1]]))
                      {
                          res+=arr[j][2];
                          bb[arr[j][1]]=true;
                          break;
                      }
                      else if((!bb[arr[j][0]])&&(bb[arr[j][1]]))
                      {
                          res+=arr[j][2];
                          bb[arr[j][0]]=true;
                          break;
                      }
                  }
              }
              System.out.println(res*p);
        }
        //return ind;
    }
}
