import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class prime1 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=100001;
        boolean arr[]=new boolean[n];
        int cc[]=new int[9592];
        int xy=0;
        for(int i=2;i<n;i++)
            if(!arr[i])
            {
             cc[xy]=i;xy++;   
                for(int j=i*2;j<n;j+=i)
                    arr[j]=true;
            } 
    int t=Integer.parseInt(br.readLine());
    while(t-->0)
    {
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int rr=b+1;
        boolean bb[]=new boolean[rr];
        int i=0;
        while(cc[i]<=b-a+1)
        {
          int temp=a/cc[i];
          temp*=cc[i];
          if(temp!=a)
              temp+=cc[i];
          if(temp==cc[i])
              temp+=cc[i];
          for(int j=temp;j<=b;j+=cc[i])
          {
              //System.out.println(j+" "+bb[j]);
             bb[j]=true; 
          }
          i++;
        }
        StringBuilder sb=new StringBuilder("");
        if(a==1)
            a++;
        for(int l=a;l<=b;l++)
            if(!bb[l])
                sb=sb.append(l+"\n");
        System.out.print(sb);
    }
    
    }
}
