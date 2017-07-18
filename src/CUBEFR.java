import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
class CUBEFR {
public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    boolean bb[]=new boolean[1000501];
    int arr[]=new int[1000501];
    ArrayList<Integer> ar=new ArrayList<>();
    for(int i=2;i<=100;i++)
    {
        int t=i*i*i;
        if(bb[t])
            continue;
        int a=1;
        while(3>2)
        {
            if(t*a>1000500)
                break;
            bb[t*a]=true;
            ar.add(t*a);
            a+=1;
        }
    }
   // System.out.println(ar.toString());
    //System.out.println(ar.size());
    int c=0;
    for(int i=1;i<=1000500;i++)
    {
        if(bb[i])
            c++;
        arr[i]=c;
    }
    int t=Integer.parseInt(br.readLine());
    c=0;
//    for(int i=1;i<100;i++)
//        System.out.println(i+" "+arr[i]);
    while(t-->0)
    {
        c++;
        int in=Integer.parseInt(br.readLine());
        if(bb[in])
            System.out.println("Case "+c+": Not Cube Free");
        else
            System.out.println("Case "+c+": "+(in-arr[in]));
    }
}
}
