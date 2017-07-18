import java.io.InputStreamReader;
import java.io.BufferedReader;
class GAMES {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-->0)
    {
        String s=br.readLine();
        int ind=s.indexOf('.');
        if(ind<0)
            System.out.println(1);
        else{
            String f=s.substring(ind+1);
        int a=Integer.parseInt(f);
        int l=1;
        for(int i=0;i<f.length();i++)
            l*=10;
        int hcf=gcd(a,l);
        System.out.println((l/hcf));}
    }
   
}
 static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
