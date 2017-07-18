import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Stack;
class EMPTY2 {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(br.readLine());
    int t=Integer.parseInt(st.nextToken());
    int cs=0;
    while(t-->0)
    {
        cs+=1;
        st=new StringTokenizer(br.readLine());
        char cc[]=st.nextToken().toCharArray();
        Stack<Character> ss=new Stack();
        int i=0;
        if(cc.length<=2)
        {
            System.out.println("no");
        }
        else
        {
           while(i<cc.length)
           {
               ss.push(cc[i]);
               i++;
               while(ss.size()<3&&i<cc.length)
               {
                   ss.push(cc[i]);
                   i++;
               }
               int a=ss.size();
               if((a>2)&&(ss.elementAt(a-1)=='0')&&(ss.elementAt(a-2)=='0')&&(ss.elementAt(a-3)=='1'))
               {
                   ss.pop();
                   ss.pop();
                   ss.pop();
                   a-=3;
               }
               
           }
           if(ss.size()==0)
           {
               System.out.println("yes");
           }
           else
           {
               System.out.println("no");
           }
        }
    }
}
}
