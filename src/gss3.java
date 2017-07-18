import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class gss3
{
	public static void main(String[] args) throws Exception
	{
		//Scanner sc= new Scanner(System.in);
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int a[] =new int[t];
                StringTokenizer st=new StringTokenizer(br.readLine());
                for(int i=0;i<t;i++)
                    a[i]=Integer.parseInt(st.nextToken());
                int height=(int)Math.pow(2, Math.ceil((Math.log(t))/(Math.log(2))));
                height=(2*height)-1;
                int tree[]=new int[height];
                treef(a,tree,0,t-1,0);
                for(int i=0;i<height;i++)
                    System.out.print(tree[i]+" ");
                int n=Integer.parseInt(br.readLine());
                for(int i=0;i<n;i++)
                {
                    st=new StringTokenizer(br.readLine());
                    int ch=Integer.parseInt(st.nextToken());
                    int qss=Integer.parseInt(st.nextToken())-1;
                    int qee=Integer.parseInt(st.nextToken())-1;
                    if(ch==0)
                        update(tree,qss,qee+1, 0, t-1, 0);
                    else
                        System.out.println(query(tree,qss,qee,0,t-1,0));
                }
                
	}
 public static void treef(int []a,int tree[],int s,int e,int p)
 {
     if(s==e)
         tree[p]=a[s];
     else {
         int mid=(s+e)/2;
         treef(a,tree,s,mid,(2*p)+1);
         treef(a,tree,mid+1,e,(2*p)+2);
         if((tree[2*p+1]>=0)&&(tree[2*p+2])>=0)
             tree[p]=tree[2*p+1]+tree[2*p+2];
         else
         tree[p]=Math.max(tree[2*p+1],tree[2*p+2]);
     }
 }
 public static int query(int tree[],int qs,int qe,int s,int e,int p)
 {
     //System.out.println(qs+" "+qe+" "+s+" "+e);
     if((qe>=e)&&(qs<=s))
         return tree[p];
     if((qs>e)||(qe<s))
         return Integer.MIN_VALUE;
     else
     {
         
         int mid=(e+s)/2;
         int a=query(tree,qs,qe,s,mid,(2*p)+1);
         int b=query(tree,qs,qe,mid+1,e,(2*p)+2);
         if((a>=0)&&(b>=0))
             return a+b;
         else 
             return Math.max(a, b);
     }
 }
 public static void update(int tree[],int a,int r,int s,int e,int p)
 {
    // System.out.println("update");
     //System.out.println(s+" "+e+" "+p);
     if((a<s)||(e<a))
     {
         return;
     }
     if(s==e)
     {
         tree[p]=r;
        // System.out.println(12541254+" "+p+" "+r+" "+tree[p]);
         return;
     }
     else
     {
         int mid=(s+e)/2;
         update(tree,a,r,s,mid,p*2+1);
         update(tree,a,r,mid+1,e,p*2+2);
          if((tree[2*p+1]>=0)&&(tree[2*p+2])>=0)
             tree[p]=tree[2*p+1]+tree[2*p+2];
         else
         tree[p]=Math.max(tree[2*p+1],tree[2*p+2]);
        // tree[p]=Math.max(tree[2*p+1],tree[2*p+2]);
     }
    // System.out.println("Updated");
 }
}