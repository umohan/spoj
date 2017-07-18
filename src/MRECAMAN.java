import java.io.InputStreamReader;
import java.io.BufferedReader;
class MRECAMAN {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean bb[]=new boolean[10000000];
        int arr[]=new int[500001];
        arr[0]=0;
        bb[0]=true;
        for(int i=1;i<500001;i++)
        {
            if((arr[i-1]<=i)||(bb[arr[i-1]-i]))
            { arr[i]=arr[i-1]+i;
                bb[arr[i]]=true;
                        }
            else 
            {arr[i]=arr[i-1]-i;
            bb[arr[i]]=true;
            }
            
            
        }
        int t=Integer.parseInt(br.readLine());
        while(3>2)
        {
            if(t==-1)
                break;
            else System.out.println(arr[t]);
            t=Integer.parseInt(br.readLine());
        }
    }
}
