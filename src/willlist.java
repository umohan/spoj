import java.io.InputStreamReader;
import java.io.BufferedReader;
class willlist {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());
        if(((n)&(n-1))==0)
            System.out.println("TAK");
        else
            System.out.println("NIE");
            
    }
}
