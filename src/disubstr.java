import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
 class disubstr 
{
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            char cc[]=br.readLine().toCharArray();
            int l=cc.length;
            String ar[]=new String[l];
            ar[l-1]=cc[l-1]+"";
            for(int i=l-2;i>=0;i--)
                ar[i]=cc[i]+ar[i+1];
            Arrays.sort(ar);
            disubstr ll=new disubstr();
            long r=ar[0].length();
            for(int i=0;i<l-1;i++)
                r=r+ar[i+1].length()-ll.lcp(ar[i],ar[i+1]);
            System.out.println(r);
        }
    }
    public int lcp(String a,String b)
    {
        int f=a.length();
        int l=b.length();
        l=Math.min(l, f);
        char c1[]=a.toCharArray();
        char c2[]=b.toCharArray();
        int i=0;
        for( ;i<l;i++)
            if(c1[i]!=c2[i])
                break;
        return i;
    }
}
