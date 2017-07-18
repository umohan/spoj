import java.io.*;
import java.util.*;
class Sbanks {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
            int n=Integer.parseInt(br.readLine());
            Map<String,Integer> m=new HashMap<String,Integer>();
            List<String> l=new ArrayList<String>();
            for(int i=0;i<n;i++)
            {
                String s=br.readLine();
                if(m.containsKey(s))
                {
                    int a=(int)m.get(s);
                    a++;
                    m.put(s, a);
                }
                else
                {
                    m.put(s,1);
                    l.add(s);
                }
            }
            String res="";
            Collections.sort(l);
            for(int j=0;j<l.size();j++)
            {
                String ss=l.get(j);
                int p=(int)m.get(ss);
                System.out.println(ss+" "+p);
            }
            br.readLine();
            System.out.println();
        }
    }
}
