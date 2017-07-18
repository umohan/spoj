import java.io.*;
import java.util.*;
class ANARC0B {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(3>2)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            if(n==0)
                System.exit(0);
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=Integer.parseInt(st.nextToken());
            }
            st=new StringTokenizer(br.readLine());
             int m=Integer.parseInt(st.nextToken());
             int arr[]=new int[m];
            for(int i=0;i<m;i++)
            {
                arr[i]=Integer.parseInt(st.nextToken());
            }
           
          int pointer1 = 0, pointer2 = 0;
      Integer sum = 0, sum1 = 0, sum2 = 0;
      while (pointer1<n && pointer2 < m) {
        if (ar[pointer1]==(arr[pointer2])) {
          sum += Math.max(sum1, sum2);
          sum += ar[pointer1];
          pointer1++;
          pointer2++;
          sum1 = 0;
          sum2 = 0;
        } else if (ar[pointer1]>=(arr[pointer2]) ) {
          sum2 += arr[pointer2];
          pointer2++;
        } else {
          sum1 += ar[pointer1];
          pointer1++;
        }
      }

      while (pointer1 < n) {
        sum1 += ar[pointer1];
        pointer1++;
      }
      while (pointer2 < m) {
        sum2 += arr[pointer2];
        pointer2++;
      }

      sum += Math.max(sum1, sum2);
      System.out.println(sum);
    }
   }
}
 

