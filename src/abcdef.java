import java.io.*;
import java.util.*;
class abcdef {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
       for(int i=0;i<n;i++)
           arr[i]=Integer.parseInt(br.readLine());
      HashMap<Integer,Integer> hm1=new HashMap();
        HashMap<Integer,Integer> hm2=new HashMap();
        //Set ss=new HashSet();
        int temp=0;int tt=1;
            List<Integer> ar=new ArrayList();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                for(int k=0;k<n;k++)
                {
                    if(arr[i]!=0)
                    {
                        temp=arr[i]*(arr[j]+arr[k]);
                        //ss.add(temp);
                        if(hm1.containsKey(temp))
                        {
                            tt=hm1.get(temp);
                            tt++;
                            hm1.put(temp,tt);
                        }
                        else
                        {
                            hm1.put(temp,1);
                            ar.add(temp);
                        }
                    }
                    temp=arr[i]*arr[j]+arr[k];
                    if(hm2.containsKey(temp))
                        {
                            tt=hm2.get(temp);
                            tt++;
                            hm2.put(temp,tt);
                        }
                        else
                            hm2.put(temp,1);
                }
        }
    
        long res=0;
        for(int a:ar)
        {
            //System.out.println(temp+" "+hm1.get(temp));
            if(hm2.containsKey(a))
            {
                res=res+hm2.get(a)*hm1.get(a);
            }
        }
        System.out.println(res);
        
    }
}
