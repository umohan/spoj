import java.io.InputStreamReader;
import java.io.BufferedReader;
class NHAY {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            int a=Integer.parseInt(s);
            String ss=br.readLine();
            char ca[]=ss.toCharArray();
            String sss=br.readLine();
            char cc[]=sss.toCharArray();
            int b=cc.length;
            String temp="";
            if(a>b)
            {
                System.out.println();
                continue;
            }
            else if(a==1)
            {
                StringBuilder r=new StringBuilder("");
                char ccc=ca[0];
                int res=0;
                for(int i=0;i<b;i++)
                {
                    if(ccc==cc[i])
                    {
                        r=r.append("\n"+i);
                        res++;
                    }
                }
                if(res==0)
                    System.out.println();
                else
                    System.out.println(r);
            }
            else
            {
            int i=0;
            int j=0;
            int r=0;
            StringBuilder res=new StringBuilder("");
            for(i=0;i<b-a+1;i++)
            {
                int ar=i;
                if(cc[i]==ca[0])
                {ar++;
                    for(j=1;j<a;j++)
                    {
                        if(cc[ar]!=ca[j])
                            break;
                        ar++;
                    }
                    if(j==a)
                    {
                        r++;
                        res=res.append(i+"\n");
                    }  
                }
            }
            if(r==0)
                System.out.println();
            else
                System.out.print(res);
            }
        }
    }
}
