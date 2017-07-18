import java.io.InputStreamReader;
import java.io.BufferedReader;
class DppppImpAIBHOP2 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0)
        {
            StringBuilder sb=new StringBuilder(br.readLine());
            String s=sb.toString();
            int c=lcs(s,sb.reverse().toString());
            System.out.println((s.length()-c));
        }
    }
    static int lcs(String s1,String s2)
    {
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        int l=s1.length();
        int arr[][]=new int[l+1][l+1];
        for(int i=0;i<=l;i++)
        {
            for(int j=0;j<=l;j++)
            {
             if((i==0)||(j==0))
                 arr[i][j]=0;
             else
             {
                 if(c1[i-1]==c2[j-1])
                     arr[i][j]=arr[i-1][j-1]+1;
                 else
                     arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
             }
             //System.out.print(arr[i][j]);
            //}System.out.println();
        }}
        return arr[l][l];
    }
    
}
