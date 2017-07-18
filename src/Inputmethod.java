import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
//import java.io.InputStream;
//import java.util.StringTokenizer;
//import java.util.Arrays;
class Inputmethod {
    public static void main(String[]args)throws IOException
    {
       /*InputStreamReader in;
        PrintWriter w;
        w = new PrintWriter(new FileWriter("input04.txt"));
        Random r=new Random();
        long t=1000000;
        w.println(t);
            while(t-->0)
            {
                int n=r.nextInt(65)%60;
                System.out.println(n);
                w.println(n);
            }
            w.close();*/
    
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(new File("input04.txt"))));
        PrintWriter w=new PrintWriter(new FileWriter("output04.txt"));
        int t=Integer.parseInt(br.readLine());
        System.out.println(t);
        while(t-->0)
        { 
            long n=Integer.parseInt(br.readLine())+1;
            if(n>50)
                System.out.println(n);
            long res=1;
            for(int i=0;i<n;i++)
                res*=2;
            w.println(res-1);
            //System.out.println("Case "+a+": "+(res-1));
        }
        w.close();
    }
}
/*class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream 
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
     static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }

    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }
/* static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
    
	
   
}*/
