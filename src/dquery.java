import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
class dquery {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int size=(int)Math.sqrt(n);
        int arr[]=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(br.readLine());
        int qu[][]=new int[d][5];
        for(int i=0;i<d;i++)
        {
            st=new StringTokenizer(br.readLine());
            qu[i][0]=Integer.parseInt(st.nextToken())-1;
            qu[i][1]=Integer.parseInt(st.nextToken())-1;
            qu[i][2]=qu[i][0]/size;
            qu[i][3]=i;
        }
         Arrays.sort(qu,new Comparator<int []>()
            {
            @Override
            public int compare(int[] o1,int[] o2){
                int a=Integer.compare(o1[2],o2[2]);
                if(a==0)
                    a=Integer.compare(o1[1],o2[1]);
                if(a==0)
                    a=Integer.compare(o1[0],o2[0]);
                return a;
            }
            });
         int bb[]=new int[1000001];
         int l=0;
         int r=0;
         int res=1;
         bb[arr[0]]++;
         for(int i=0;i<d;i++)
         {
             while(!(r==qu[i][1]))
             {
                 if(r<qu[i][1])
                 {
                     
                    // System.out.println(bb[arr[r]]);
                     r++;
                     if(bb[arr[r]]==0)
                       res++;
                     bb[arr[r]]++;
                     
                 }
                 if(r>qu[i][1]+1)
                 {
                     bb[arr[r]]--;
                     if(bb[arr[r]]==0)
                         res--;
                     r--;
                 }
                 //System.out.println(r+" r "+qu[i][1]+" "+res);
             }
              while(!(l==qu[i][0]))
             {
                 if(l<qu[i][0])
                 {
                      bb[arr[l]]--;
                     if(bb[arr[l]]==0)
                       res--;
                     l++;
                    
                 }
                 if(l>qu[i][0])
                 {
                     l--;
                     bb[arr[l]]++;
                     if(bb[arr[l]]==1)
                         res++;
                     
                 }
                 //System.out.println(l+" l "+qu[i][0]+" "+res);
             }
              qu[i][4]=res;
         }
         Arrays.sort(qu,new Comparator<int []>()
            {
            @Override
            public int compare(int[] o1,int[] o2){
                int a=Integer.compare(o1[3],o2[3]);
                return a;
            }
            });
         for(int i=0;i<d;i++)
             System.out.println(qu[i][4]);
    }
     private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
}
