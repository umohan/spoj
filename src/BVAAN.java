import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
class BVAAN {
	static char cc[];
	static char cc2[];
	static int dp[][][];
    public static void main(String[]args)throws Exception
    {
        Reader in=new Reader();
        PrintWriter out=new PrintWriter(System.out);
        int t=in.nextInt();
        while(t-->0)
        {
            cc=in.readLine().toCharArray();
            cc2=in.readLine().toCharArray();
            int k=in.nextInt();
            dp=new int[cc.length+1][cc2.length+1][k+1];	
            for(int i=0;i<cc.length+1;i++)
                for(int j=0;j<cc2.length+1;j++)
                    for(int l=0;l<=k;l++)
                        dp[i][j][l]=-2;
            int res=callme(0,0,k);
            if(res==-1)
                res=0;
            out.println(res);
        }
        out.flush();
        System.exit(0);
    }
    static int callme(int a,int b,int k)
    {
        if(a>cc.length||b>cc2.length)
            return -1;
        if((k>(cc.length-a))||(k>(cc2.length-b)))
                return -1;
        if(k==0)
                return 0;
        if(dp[a][b][k]==-2)
        {
            int res=-1;
            for(int i=a;i<cc.length;i++)
            {
                ll:for(int j=b;j<cc2.length;j++)
                {
                    int temp=0;
                    if((k>(cc.length-a))||(k>(cc2.length-b)))
                         break;
                    if(cc[i]==cc2[j])
                        {
                            temp=callme(i+1,j+1,k-1);
                            if(temp==-1)
                                    continue ll;
                            temp+=cc[i];
                            res=Math.max(res,temp);
                        }
                    
                }
            }
            dp[a][b][k]=res;
        }
        return dp[a][b][k];
    }
    
    
    
    
    static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte [] buffer;
		private int bufferPointer, bytesRead;
		
		public Reader () {
			din = new DataInputStream (System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		
		public Reader (String file_name) throws IOException {
			din = new DataInputStream (new FileInputStream (file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		
		public String readLine () throws IOException {
			byte [] buf = new byte[1024];
			int cnt = 0, c;
			while ((c = read ()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String (buf, 0, cnt);
		}
		
		public int nextInt () throws IOException {
			int ret = 0;
			byte c = read ();
			while (c <= ' ')
				c = read ();
			boolean neg = (c == '-');
			if (neg)
				c = read ();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read ()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
		
		public long nextLong () throws IOException {
			long ret = 0;
			byte c = read ();
			while (c <= ' ')
				c = read ();
			boolean neg = (c == '-');
			if (neg)
				c = read ();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read ()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
		
		public double nextDouble () throws IOException {
			double ret = 0, div = 1;
			byte c = read ();
			while (c <= ' ')
				c = read ();
			boolean neg = (c == '-');
			if (neg)
				c = read ();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read ()) >= '0' && c <= '9');
			if (c == '.')
				while ((c = read ()) >= '0' && c <= '9')
					ret += (c - '0') / (div *= 10);
			if (neg)
				return -ret;
			return ret;
		}
		
		private void fillBuffer () throws IOException {
			bytesRead = din.read (buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}
		
		private byte read () throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer ();
			return buffer[bufferPointer++];
		}
		
		public void close () throws IOException {
			if (din == null)
				return;
			din.close ();
		}
	}  
}
