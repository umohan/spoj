import java.io.InputStreamReader;
import java.io.BufferedReader;
class CHOCOLA {
    static int ary[];
    static int arx[];
    static boolean ch[];
    static int a;
    static int b;
 public static void main(String[]args)throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-->0)
    {
        br.readLine();
        String s[]=br.readLine().split(" ");
        a=Integer.parseInt(s[0]);
        b=Integer.parseInt(s[1]);
        ary=new int[b+1];
        arx=new int[a+1];
        ary[0]=0;
        arx[0]=0;
        ary[b]=0;
        arx[a]=0;
        for(int i=1;i<=(a-1);i++)
            arx[i]=Integer.parseInt(br.readLine().trim());
        for(int i=1;i<=(b-1);i++)
            ary[i]=Integer.parseInt(br.readLine().trim());
        System.out.println(calc(0,a,0,b));
    }
}
public static int calc(int xi,int xf,int yi,int yf)
{
    int res=0;
    if((xf<=(xi+1))&&(yf<=(yi+1)))
        return 0;
    else
    {
        int maxx=0;
        int indx=0;
        if(xf>(xi+1))
        for(int i=xi+1;i<=xf-1;i++)
            if(arx[i]>=maxx)
            {
                maxx=arx[i];
                indx=i;
            }
        int maxy=0;
        int indy=0;
        if(yf>(yi+1))
        for(int i=yi+1;i<=yf-1;i++)
            if(ary[i]>=maxy)
            {
                maxy=ary[i];
                indy=i;
            }
        res+=Math.max(maxx,maxy);
        if(maxx>=maxy)
        {
            res+=(calc(xi,indx,yi,yf)+calc(indx,xf,yi,yf));
        }
        else
        {
            res+=(calc(xi,xf,yi,indy)+calc(xi,xf,indy,yf));
        }
    }
    return res;
} 
}
