import java.io.InputStreamReader;
import java.io.BufferedReader;
class danger {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        while(s.hashCode()!="00e0".hashCode())
        {
            int z=s.charAt(3)-48;
            int a=Integer.parseInt(""+s.charAt(0)+s.charAt(1));
            for(int i=0;i<z;i++)
                a*=10;
            int n=(int)(Math.log(a)/Math.log(2));
             int t=fast_exp(n);
            System.out.println((a-t)*2+1);
           
            s=br.readLine();
        }
    }
     public static int fast_exp(int exp) {
         int base=2;
    int res=1;
    while(exp>0) {
       if(exp%2==1) res=(res*base);
       base=(base*base);
       exp/=2;
    }
    return res;
}
}
