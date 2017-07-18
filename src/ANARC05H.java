import java.io.InputStreamReader;
import java.io.BufferedReader;
class ANARC05H {
    static String s;
    static int arr[];
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        s=br.readLine();
        int a=0;
        while(s.hashCode()!="bye".hashCode())
        {
            a++;
            arr=new int[s.length()];
            for(int i=0;i<s.length();i++)
            {
                arr[i]=s.charAt(i)-'0';
            }
            System.out.println(a+". "+callme(0,0));
            s=br.readLine();
        }
    }
    public static int callme(int a,int psum)
    {
        int ans=0;
        int sum=0;
        if(a==s.length())
            return 1;
        for(int i=a;i<s.length();i++)
        {
            sum+=arr[i];
            if(sum>=psum)
                ans+=callme(i+1,sum);
        }
        return ans;
    }
}
