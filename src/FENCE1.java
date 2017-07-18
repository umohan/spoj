import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.*;
//import java.text.DecimalFormat;
public class FENCE1 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long test=Long.parseLong(br.readLine());
        while(test!=0)
        {
            
            double d =test;
            double a=3.1415926f;
            //float b=22/7f;
            double ll=d*d;
            ll=ll/2f;
            ll=ll/a;
            ll=(double)Math.round(ll*100)/100;
           // System.out.println(a);
           // DecimalFormat df = new DecimalFormat();
           // df.setMaximumFractionDigits(2);
            //System.out.println((ll));
            System.out.printf("%.2f", ll);
            //System.out.("%.2",ll);
            System.out.println();
            test=Integer.parseInt(br.readLine());
            
            
        }
    }
}