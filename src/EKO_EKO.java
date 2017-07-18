import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
class EKO_EKO {
    static long m;
    static long arr[];
    public static void main(String[]args)throws Exception{
        Reader in = new Reader ();
        PrintWriter out = new PrintWriter (System.out, true);
        int n=in.nextInt();
        m=in.nextLong();
        long max=0;
        arr=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            max=max>arr[i]?max:arr[i];
        }
        out.println(binarysearch(0, max));
        out.close();
        System.exit(0);
    }
    static long binarysearch(long min,long max)
    {
        
        long mid=(max+min)/2;
       if(max==min)
           return max;
       else if(max==min+1)
       {
           if(isvalid(max))
               return max;
           else
               return min;
       }
       if(!isvalid(mid))
           return binarysearch(min, mid-1);
       else
           return binarysearch(mid, max);
       
    }
    static boolean isvalid(long mid)
    {
        long ss=0;
        for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>mid)
               ss+=(arr[i]-mid);
        }
        
        if(ss>=m)
            return true;
        else
             return false;
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
