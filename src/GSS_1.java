import java.io.*;
class GSS_1 {
    static int tree[];
    static int arr[];
     private static Reader2 in;
    private static PrintWriter out;
    public static void main(String[]args)throws Exception
    {
        in = new Reader2 ();
        out = new PrintWriter (System.out, true);
        int n=in.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int height=(int)Math.pow(2,Math.ceil(Math.log(n)/Math.log(2)));
        height*=2;
        height-=1;
        tree=new int[height];
        treef(0,n-1,0);
        int m=in.nextInt();
        
        for(int i=0;i<m;i++)
        {
            int a=in.nextInt()-1;
            int b=in.nextInt()-1;
            System.out.println(query(a,b,0,n-1,0));
        }
        
    }
    public static void treef(int s,int e,int p)
    {
        if(s==e)
            tree[p]=arr[s];
        else 
        {
            int mid=(s+e)/2;
            treef(s,mid,(2*p)+1);
            treef(mid+1,e,(2*p)+2);
            int hh=0;
            if((tree[2*p+1]>0)&&(tree[2*p+2]>0))
                hh=tree[2*p+1]+tree[2*p+2];
            hh=Math.max(tree[2*p+1],tree[2*p+2]);
            tree[p]=hh;
        }
    }
    public static int query(int qs,int qe,int s,int e,int p)
    {
        if((qe>=e)&&(qs<=s))
         return  tree[p];
     if((qs>e)||(qe<s))
         return Integer.MIN_VALUE;
     else
     {
         
         int mid=(e+s)/2;
         int res=query(qs,qe,s,mid,(2*p)+1);
         int rex=query(qs,qe,mid+1,e,(2*p)+2);
         return Math.max(res,rex);
     }
    }
}
class Reader2 {
    final private int BUFFER_SIZE = 1 << 16;private DataInputStream din;private byte[] buffer;private int bufferPointer, bytesRead;
    public Reader2(){din=new DataInputStream(System.in);buffer=new byte[BUFFER_SIZE];bufferPointer=bytesRead=0;
    }public Reader2(String file_name) throws IOException{din=new DataInputStream(new FileInputStream(file_name));buffer=new byte[BUFFER_SIZE];bufferPointer=bytesRead=0;
    }public String readLine() throws IOException{byte[] buf=new byte[64];int cnt=0,c;while((c=read())!=-1){if(c=='\n')break;buf[cnt++]=(byte)c;}return new String(buf,0,cnt);
    }public int nextInt() throws IOException{int ret=0;byte c=read();while(c<=' ')c=read();boolean neg=(c=='-');if(neg)c=read();do{ret=ret*10+c-'0';}while((c=read())>='0'&&c<='9');if(neg)return -ret;return ret;
    }public long nextLong() throws IOException{long ret=0;byte c=read();while(c<=' ')c=read();boolean neg=(c=='-');if(neg)c=read();do{ret=ret*10+c-'0';}while((c=read())>='0'&&c<='9');if(neg)return -ret;return ret;
    }public double nextDouble() throws IOException{double ret=0,div=1;byte c=read();while(c<=' ')c=read();boolean neg=(c=='-');if(neg)c = read();do {ret=ret*10+c-'0';}while((c=read())>='0'&&c<='9');if(c=='.')while((c=read())>='0'&&c<='9')ret+=(c-'0')/(div*=10);if(neg)return -ret;return ret;
    }private void fillBuffer() throws IOException{bytesRead=din.read(buffer,bufferPointer=0,BUFFER_SIZE);if(bytesRead==-1)buffer[0]=-1;
    }private byte read() throws IOException{if(bufferPointer==bytesRead)fillBuffer();return buffer[bufferPointer++];
    }public void close() throws IOException{if(din==null) return;din.close();}
}