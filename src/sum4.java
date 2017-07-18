import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 class sum4 {
    static int b1[];
    static int b2[];
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        int n=Integer.parseInt(br.readLine());
        int a1[]=new int[n];
         int a2[]=new int[n];
         int a3[]=new int[n];
        int a4[]=new int[n];
        StringTokenizer st;
       for(int i=0;i<n;i++)
       {
           st=new StringTokenizer(br.readLine());
           a1[i]=Integer.parseInt(st.nextToken());
           a2[i]=Integer.parseInt(st.nextToken());
           a3[i]=Integer.parseInt(st.nextToken());
           a4[i]=Integer.parseInt(st.nextToken());
         
       }
       b1=new int[n*n];
       b2=new int[n*n];
       int t=0;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               b1[t]=a1[i]+a2[j];
               b2[t]=a3[i]+a4[j];
               t++;
               //System.out.println(b1[i]+" "+b2[i]+" "+t);
           }
       }
       Arrays.sort(b1);
       Arrays.sort(b2);
       int res=0;
       int in=b1.length;
       int indd;
      for(int i=0;i<in;i++)
       {
           int f=b1[i]*(-1);
           if(f<b2[0])
               break;
           else if(f>b2[in-1])
               continue;
           else
           {
               indd=Arrays.binarySearch(b2,f);
               if(indd>=0)
                   res=res+count(indd);
           }
       }
       System.out.println(res);
    }
    public static int bst(int n,int s,int l)
    {
        //System.out.println(n+" "+s+" "+l);
        if(n==l)
        {
            if(b2[s]==n)
                return s;
            else
                return -1;
        }
        else if(l==s+1)
        {
            if(b2[s]==n)
                return s;
            else if(b2[l]==n)
                return l;
            else
                return -1;
        }
        else
        {
            int mid=(s+l)/2;
            if(b2[mid]==n)
                return mid;
            else if(n>b2[mid])
                return bst(n,mid+1,l);
            else
                return bst(n,s,mid-1);
        }
    }
    public static int count(int ind)
    {
        int n=b2[ind];
        int cc=1;
        for(int i=ind-1;i>=0;i--)
        {
            if(b2[i]==n)
                cc++;
            else
                break;
        }
        for(int i=ind+1;i<b2.length;i++)
        {
            if(b2[i]==n)
                cc++;
            else
                break;
        }
        return cc;
    }
}
