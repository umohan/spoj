import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
class BITMAP {
    public static void main(String[]args)throws Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int test=Integer.parseInt(br.readLine());
       while(test-->0)
       {
           
           StringTokenizer st=new StringTokenizer(br.readLine());
           int m=Integer.parseInt(st.nextToken());
           int n=Integer.parseInt(st.nextToken());
           int a1[][]=new int[m][n];
           int a2[][]=new int[m][n];
           int a3[][]=new int[m][n];
           for(int i=0;i<m;i++)
           {
           String s=br.readLine();
              for(int j=0;j<n;j++)
              {
                  
                  a1[i][j]=s.charAt(j)-48;
                  //System.out.println(a1[i][j]+" ");
              }//System.out.println();
           }
           //br.readLine();
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<n;j++)
               {
                   if(a1[i][j]==1)
                       a2[i][j]=0;
                   else if(i==0)
                   {
                       if(j==0)
                           a2[i][j]=182*182;
                       else
                          a2[i][j]=a2[i][j-1]+1; 
                   }
                    else
                   {
                       if(j==0)
                           a2[i][j]=Math.min(a2[i-1][j],a2[i-1][n-1]+n-1)+1;
                       else
                       a2[i][j]=Math.min(a2[i-1][j],a2[i][j-1])+1;
                   }  
                 //System.out.print(a2[i][j]+" ");
              }//System.out.println();
           }
           for(int i=m-1;i>=0;i--)
           {
               for(int j=n-1;j>=0;j--)
               {
                   if(a1[i][j]==1)
                       a3[i][j]=0;
                   else if(i==m-1)
                   {
                       if(j==n-1)
                           a3[i][j]=182*182;
                       else
                          a3[i][j]=a3[i][j+1]+1; 
                   }
                    else
                   {
                       if(j==n-1)
                           a3[i][j]=Math.min(a3[i+1][j],a3[i+1][0]+m-1)+1;
                       else
                       a3[i][j]=Math.min(a3[i+1][j],a3[i][j+1])+1;
                   }
                 //System.out.print(a3[i][j]+" ");
              }//System.out.println();
           }
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<n;j++){
               a1[i][j]=(Math.min(a2[i][j],a3[i][j]));
               }
           }
           int temp;
           if((m==1)||(n==1))
           {
               for(int i=0;i<m;i++)
               {
                   for(int j=0;j<n;j++)
                       System.out.print(a1[i][j]+" ");
                   System.out.println();
               }
           }else{
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0)
                {
                  if(j==0)
                    temp=Math.min(Math.min(a1[i][j],a1[i+1][j]+1),a1[i][j+1]+1);
                 else if(j==n-1)
                     temp=Math.min(Math.min(a1[i][j],a1[i+1][j]+1),a1[i][j-1]+1); 
                  else
                 {
                     temp=Math.min(Math.min(a1[i][j],a1[i+1][j]+1),a1[i][j+1]+1);
                     temp=Math.min(temp,a1[i][j-1]+1);
                 }
                }
                else if(i==m-1)
                {
                    if(j==0)
                    temp=Math.min(Math.min(a1[i][j],a1[i-1][j]+1),a1[i][j+1]+1);
                 else if(j==n-1)
                     temp=Math.min(Math.min(a1[i][j],a1[i-1][j]+1),a1[i][j-1]+1); 
                  else
                 {
                     temp=Math.min(Math.min(a1[i][j],a1[i-1][j]+1),a1[i][j+1]+1);
                     temp=Math.min(temp,a1[i][j-1]+1);
                 }
                }
                else
                {
                    if(j==0)
                    {
                        temp=Math.min(Math.min(a1[i][j],a1[i+1][j]+1),a1[i][j+1]+1);
                        temp=Math.min(temp,a1[i-1][j]+1);
                    }
                 else if(j==n-1)
                 {
                     temp=Math.min(Math.min(a1[i][j],a1[i+1][j]+1),a1[i][j-1]+1);
                     temp=Math.min(temp,a1[i-1][j]+1);
                 } 
                  else
                 {
                     temp=Math.min(Math.min(a1[i][j],a1[i+1][j]+1),a1[i][j+1]+1);
                     temp=Math.min(Math.min(temp,a1[i][j-1]+1),a1[i-1][j]+1);
                 }
                }
                a1[i][j]=temp;
                System.out.print(temp+" ");
            }System.out.println();}
        }if(test>0)br.readLine();
       }
    }
}

