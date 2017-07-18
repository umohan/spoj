import java.util.*;
import java.io.*;
class sample
{
	public static void main(String args [])	throws IOException
	{
          StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
          st.nextToken();
          System.out.println(st.nextToken());
        }
         public static long fast_exp(long base, long exp) {
    long res=1;
    int MOD=786433;
    while(exp>0) {
       if(exp%2==1) res=(res*base)%MOD;
       base=(base*base)%MOD;
       exp/=2;
    }
    return res%MOD;
}
}
