 import java.io.*;
class Horriblequeries
{
    static long tree[];
    static long lazy[];
	public static void main(String[] args) throws Exception
	{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t=Integer.parseInt(br.readLine());
         while(t-->0)
         {
             String s[]=br.readLine().split(" ");
             int n=Integer.parseInt(s[0]);
             long m=Long.parseLong(s[1]);
             int height=(int)Math.pow(2, Math.ceil((Math.log(n))/(Math.log(2))));
             height=(2*height)-1;
             tree=new long[height];
             lazy=new long[height];
             for(long i=0;i<m;i++)
             {
                 s=br.readLine().split(" ");
                 int ch=Integer.parseInt(s[0]);
                 if(ch==0)
                 {
                     int p =Integer.parseInt(s[1])-1;
                     int q=Integer.parseInt(s[2])-1;
                     long v=Long.parseLong(s[3]);
                    update(p,q,0,n-1,0,v);   
                 }
                 else if(ch==1)
                 {
                     int p=Integer.parseInt(s[1])-1;
                     int q=Integer.parseInt(s[2])-1;
                     System.out.println(query(p,q,0,n-1,0));
                 }
             }
           
         }
                
	}
 
 public static long query(int qs,int qe,int s,int e,int p)
 {
     if((qs>e)||(qe<s)||(e<s))
         return 0;
     if(lazy[p]!=0)
     {
        tree[p]+=(e-s+1)*lazy[p];
        if(s!=e)
        {
            lazy[2*p+1]+=lazy[p];
            lazy[2*p+2]+=lazy[p];
            
        }
        lazy[p]=0;
     }
     
     if((qe>=e)&&(qs<=s))
         return tree[p];
     else
     {
         
         int mid=(e+s)/2;
         return (query(qs,qe,s,mid,(2*p)+1)+query(qs,qe,mid+1,e,(2*p)+2));
     }
 }
 public static void update(int aa,int b,int s,int e,int p,long v)
 {
 
     if(lazy[p]!=0)
     {
     tree[p]+=(e-s+1)*lazy[p];
     if(s!=e)
     {
     lazy[2*p+1]+=lazy[p];
     lazy[2*p+2]+=lazy[p];
     }
     lazy[p]=0;
     }
     if((aa>e)||(b<s))
         return ;
     if((aa<=s)&&(b>=e))
     {
         tree[p]+=(e-s+1)*v;
         if(s!=e)
         {
             lazy[p*2+1]+=v;
             lazy[p*2+2]+=v;
         }
         return;
     }
     else
     {
         int mid=(s+e)/2;
         update(aa,b,s,mid,2*p+1,v);
         update(aa,b,mid+1,e,2*p+2,v);
         tree[p]=tree[2*p+1]+tree[2*p+2];
     }
 }
}