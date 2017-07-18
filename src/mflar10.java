import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class mflar10 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        while(true)
        {
            StringTokenizer st=new StringTokenizer(s);
            int cc=st.countTokens();
            char c=st.nextToken().charAt(0);
            char c2;
            if(c<=90)
            {
                c2=(char)(c+32);
            }
            else
                c2=(char)(c-32);
            cc--;
            Boolean b=true;
            for(int i=0;i<cc;i++)
            {
                char n=st.nextToken().charAt(0);
                if((n!=c)&&(n!=c2))
                {
                    b=false;
                    break;
                }
            }
            if(b)
                System.out.println("Y");
            else
                System.out.println("N");
            s=br.readLine();
            if(s.equals("*"))
                break;
        }
    }
}
