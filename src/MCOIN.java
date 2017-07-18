import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class MCOIN {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
       
        int k=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
       
        StringBuilder s=new StringBuilder();
        boolean arr[]=new boolean[1000001];
        arr[1]=true;arr[k]=true;arr[l]=true;
        
        for(int i=2;i<1000000;i++)
        {
         arr[i]=false;   
          if( i-1 >=0 && arr[i-1]==false) arr[i]=true;
        else if( i-k >=0 && arr[i-k]==false) arr[i]=true;
        else if( i-l >=0 && arr[i-l]==false) arr[i]=true;
  
        }
        int t=Integer.parseInt(st.nextToken());
       
        st=new StringTokenizer(br.readLine());
        while(t-->0)
        {
            int r=Integer.parseInt(st.nextToken());
            if(arr[r])
                s=s.append("A");
            else
                s=s.append("B");
        }
        System.out.println(s);}
    
}
