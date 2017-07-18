import java.io.InputStreamReader;
import java.io.BufferedReader;
class brckts {
    static int op[];
    static int cl[];
    static int arr[];
 public static void main(String[]args)throws Exception
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
    for(int t=1;t<=10;t++)
    {
        int n=Integer.parseInt(br.readLine());
        int height=(int)Math.pow(2, Math.ceil((Math.log(n))/(Math.log(2))));
        height=(2*height)-1;
        op=new int[height];
        cl=new int[height];
        String s=br.readLine();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
                arr[i]=1;
            else if(s.charAt(i)==')')
                arr[i]=-1;
        }
        treef(0,n-1,0);
//        for(int i=0;i<op.length;i++)
//            System.out.print(op[i]+" ");
//        System.out.println();
//         for(int i=0;i<op.length;i++)
//            System.out.print(cl[i]+" ");
        int m=Integer.parseInt(br.readLine());
        System.out.println("Test "+t+":");
        for(int i=0;i<m;i++)
        {
            int in=Integer.parseInt(br.readLine());
            if(in==0)
            {
                if((op[0]==0)&&(cl[0]==0))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
            {
                update(0,n-1,in-1,0);
//                 for(int ii=0;ii<op.length;ii++)
//            System.out.print(op[ii]+" ");
//        System.out.println();
//         for(int ii=0;ii<op.length;ii++)
//            System.out.print(cl[ii]+" ");
            }
        }
    }
 }
   public static void treef(int s,int e,int p)
 {
     if(s==e)
     {
         if(arr[s]==1)
             op[p]=1;
         else
             cl[p]=1;
     }
     else {
         int mid=(s+e)/2;
         treef(s,mid,(2*p)+1);
         treef(mid+1,e,(2*p)+2);
         op[p]=op[(2*p)+2]+Math.max((op[2*p+1]-cl[(2*p)+2]),0);
         cl[p]=cl[2*p+1]+Math.max((cl[(2*p)+2]-op[(2*p)+1]),0);
     }
 }
   public static void update(int s,int e,int v,int p)
   {
       //System.out.println(v+" "+s+" "+e+" update");
       if((s==e)&&(s==v))
       {
           if(arr[v]==1)
           {
               arr[v]=-1;
               cl[p]=1;
               op[p]=0;
           }
           else if(arr[v]==-1)
           {
               arr[v]=1;
               cl[p]=0;
               op[p]=1;
           }
       }
       else
       {
           int mid=(s+e)/2;
           if(v>mid)
               update(mid+1,e,v,2*p+2);
           else if(v<=mid)
               update(s,mid,v,2*p+1);
           op[p]=op[(2*p)+2]+Math.max((op[2*p+1]-cl[(2*p)+2]),0);
           cl[p]=cl[2*p+1]+Math.max((cl[(2*p)+2]-op[(2*p)+1]),0);
       }
   }
}
