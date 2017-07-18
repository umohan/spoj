    import java.io.InputStreamReader;
    import java.io.BufferedReader;
    import java.util.StringTokenizer;
    class ABSP1 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            long arr[]=new long[n];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            long res=0;
            long cc=n;
            for(int i=0;i<n-1;i++)
                res+=((n-i-1)*(i+1)*(arr[i+1]-arr[i]));
            System.out.println(res);
        }
    }
    }
