import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
class ADAGAME {
    
    
    //This code is giving tle for unknown reason
    static int dp[][];
    static int no;
    public static void main(String[]args)throws Exception
    {
        Reader in=new Reader();
        PrintWriter out = new PrintWriter (System.out, true);
        int t=in.nextInt();
        while(t-->0)
        {
            no=in.nextInt();
            int ct=in.nextInt();
            dp=new int[100001][201];
            if(calc(no,ct)==2)
                out.println("Ada");
            else
                out.println("Vinit");
        }
        out.flush();
        System.exit(0);
    }
    
    static int calc(int m,int t)
    {
//        System.out.println(m+" "+t);
        if(t==0)
        {
            if(m>no)
                dp[m][t]=2;
            else
                dp[m][t]=5;
        }
        else if(dp[m][t]==0)
        {
            int a=m%10;
            m/=10;
            int b=m%10;
            m/=10;
            int c=m%10;
            int d=m/10;
            int w,x,y,z;
            if(a==9)
                w=b*10+c*100+d*1000;
            else
                w=(a+1)+b*10+c*100+d*1000;
            if(b==9)
                x=a+c*100+d*1000;
            else
                x=a+(b+1)*10+c*100+d*1000;
             if(c==9)
                y=a+b*10+d*1000;
            else
                y=a+b*10+(c+1)*100+d*1000;
              if(d==9)
                z=a+b*10+c*100;
            else
                z=a+b*10+c*100+(d+1)*1000;
              
              
            if(((t%2==0)&&(m%2==0))||((m%2==1)&&(t%2==1)))
            {
                if(calc(w,t-1)==2&&calc(x,t-1)==2&&calc(y,t-1)==2&&(calc(z,t-1)==2))
                    dp[m][t]=2;
                else
                    dp[m][t]=5;
            }
            else
            {
                if(calc(w,t-1)==2||calc(x,t-1)==2||calc(y,t-1)==2||(calc(z,t-1)==2))
                    dp[m][t]=2;
                else
                    dp[m][t]=5;
            }
        }
        return dp[m][t];
        
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
