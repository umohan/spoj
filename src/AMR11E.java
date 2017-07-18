import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
class AMR11E {
    public static void main(String[]args)throws Exception
    {
        int arr[]=new int[1000];
        boolean bb[]=new boolean[450];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=2;i<450;i++)
        {  if(!bb[i])
        {
            bb[i]=true;
            al.add(i);
            for(int j=2*i;j<450;j+=i)
                bb[j]=true;
         }
         }
        int p=0;
        int i=10;
       while(p<1000)
       {
           int count=0;
           for(int j=0;j<al.size();j++)
           {
               if(i%al.get(j)==0)
               {
                   count++;
               }
               if(count==3)
               {
                   arr[p]=i;
                   p++;
                   break;
               }
           }
           i++;
       }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            System.out.println(arr[n-1]);
        }
        
    }
}
