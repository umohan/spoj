import java.io.InputStreamReader;
import java.io.BufferedReader;
public class HPYNOS {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        if(s.compareTo("1")==0)
        {
            System.out.println(0);
            System.exit(0);
        }
        int rr=0;
        int count=1;
        for(int i=0;i<s.length();i++)
        {
            int h=s.charAt(i)-48;
            rr=rr+(h*h);
        }
        if(rr==1)
        {
            System.out.println(1);
            System.exit(0);
        }
        int temp=rr;
        for(int i=0;i<10;i++)
        {
          int a=temp%10;
          int b=(temp/10)%10;
          int c=(temp/100)%10;
          int d=(temp/1000)%10;
          temp=(a*a)+(b*b)+(c*c)+(d*d);
          count++;
          if(temp==1)
          {
              System.out.println(count);
              System.exit(0);
          }
        }
       
    
    System.out.println(-1);}
}
