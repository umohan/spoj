import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
class Guessing {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
        String ar[]={"000000","111111","222222","333333","444444","555555","666666","777777","888888","999999"};
        int arr[]=new int[6];
        String s;
        int n=0;
        int no=-1;
        int p=0;
        for(int i=0;i<9;i++)
        {
            System.out.println(ar[i]);
            s=br.readLine();
            n=s.charAt(0)-48;
            for(int j=0;j<n;j++)
            {
                arr[p]=i;
                p++;
            }
            if(n==0)
                no=i;
            
        }
        int rr[]=new int[6];
        for(int i=0;i<6;i++)
        {
            ArrayList at=call(arr[i],no);
            
         for(int k=0;k<at.size();k++)
         {
            int fs=(int)at.get(k);
            rr[fs]=arr[i];
         }
        }
        System.out.println(rr[0]+""+rr[1]+""+rr[2]+""+rr[3]+""+rr[4]+""+rr[5]);
        
    }
    static ArrayList call(int a,int b)throws Exception
    {BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
        ArrayList ar=new ArrayList();
        String hh=""+b;
        int index=0;
        String ca[]=new String[6];
        for(int i=0;i<6;i++)
        {
            ca[i]=""+a;
            for(int j=0;j<6;j++)
            {
                if(j==i)
                    continue;
                else
                    ca[j]=hh;
            }
            System.out.println(ca[0]+""+ca[1]+""+ca[2]+""+ca[3]+""+ca[4]+""+ca[5]);
            String s=br.readLine();
            int n=s.charAt(0)-48;
            if(n==1)
            {
                ar.add(i);
            }
        }
        return ar;
    }
}
