import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class CPCRC1C {
    static long arr[]=new long[10];
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        arr[1]=45;
        int bb=10;
        for(int i=2;i<10;i++)
        {
            arr[i]=arr[i-1]*10+45*bb;
            bb*=10;
        }
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        while(a>-1&&b>-1)
        {
           System.out.println(calc(b)-calc(a-1));
            st=new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
        }
    }
    static long calc(int a)
    {
          if(a<10)
              return ((a*(a+1))/2);
            {
                int d=noOfDigit(a)-1;
                long w=arr[d];
                int msd=msb(a);
                long sum=w*msd+(msd*(msd-1)/2)*(long)Math.pow(10,d);
                long sum2= msd*(a%(msd*(long)Math.pow(10, d))+1)+calc(a%(int)(Math.pow(10, d)));
                return (sum+sum2);
            }
    }
    static int noOfDigit(int a)
    {
        String s=""+a;
        return s.length();
    }
    
    static int msb(int a)
    {
        String s=""+a;
        s=""+s.charAt(0);
        return Integer.parseInt(s);
    }
}
