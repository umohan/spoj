import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class OFFSIDE {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(3>2)
        {
           // StringTokenizer st=new StringTokenizer;
           StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if((a==0)&&(b==0))
                System.exit(0);
            else
            {
                st=new StringTokenizer(br.readLine());
                int temp=100000;
              while(a-->0)
              {
                  int x=Integer.parseInt(st.nextToken());
                  if(x<temp)
                      temp=x;
                  //System.out.println(temp);
              }
              
             st=new StringTokenizer(br.readLine());
             int arr[]=new int[b];
             for(int i=0;i<b;i++)
                 arr[i]=Integer.parseInt(st.nextToken());
             Arrays.sort(arr);
             if(temp<arr[1])
                    System.out.println("Y");
             else
                    System.out.println("N");
             //System.out.println(temp+" "+arr[0]+" "+arr[1]);
            }
        }
    }
}
