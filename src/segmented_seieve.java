import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
class segmented_seieve {
    public static void main(String[]args)throws Exception
    {
        int a=(int)Math.sqrt(1000000000);
        boolean bb[]=new boolean[a+10];
        bb[1]=true;
        ArrayList<Integer> ar=new ArrayList();
        for(int i=2;i<a+1;i++)
        {
            if(!bb[i])
            {
                ar.add(i);
                for(int j=i;j<=a;j+=i)
                    bb[j]=true;
            }
        }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            st=new  StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            int in=m-n+1;
            boolean nm[]=new boolean[in];
            for(int item :ar)
            {
                if(item*item>m)
                    break;
                int str=n/item;
                if(str<=1)
                    str=2;
                while(item*str<=m)
                {
                    if(item*str<n)
                    {
                        str++;
                        continue;
                    }
                    nm[item*str-n]=true; 
                    str+=1;
                }
            }
            for(int i=0;i<in;i++)
                if(!nm[i])
                {
                    if(i+n==1)
                        continue;
//                    System.out.println(i+n);
                    sb.append((i+n)+"\n");
                }
            if(t!=0)
            sb.append("\n");
//            System.out.println();
        }
        System.out.print(sb);
    }
}
