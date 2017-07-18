import java.io.InputStreamReader;
import java.io.BufferedReader;
class NEG2 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder("");
        int n=Integer.parseInt(br.readLine());
        if(n==0)
            System.out.println(0);
        else
        { while(n!=0)
        {
            if(n<0)
            {
                n*=-1;
                int tes=n%2;
                n/=2;
                if(tes==1)
                {
                    sb.append("1");
                    n+=1;
                }
                else
                    sb.append("0");
               // System.out.println(s);
            }
            if(n>0)
            {
                int tes=n%2;
                sb.append(tes);
                n/=2;
                n*=-1;
                //System.out.println(s);
            }
        }
            System.out.println(sb.reverse());}
    }
}
