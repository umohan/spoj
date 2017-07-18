import java.io.*;
import java.util.*;
class FACEFRND {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> s=new HashSet<Integer>();
        int in=Integer.parseInt(br.readLine());
         int arr[]=new int[in];
        for(int i=0;i<in;i++)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            arr[i]=a;
            int h=Integer.parseInt(st.nextToken());
            for(int j=0;j<h;j++)
            {
             int te=Integer.parseInt(st.nextToken());
             s.add(te);
            }
        }
        for(int i=0;i<in;i++)
        {
           if(s.contains(arr[i]))
               s.remove(arr[i]);
        }  
    
        System.out.println(s.size());
    }
}
