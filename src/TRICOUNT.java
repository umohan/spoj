import java.io.*;
public class TRICOUNT {
public static void main(String[]ar)throws Exception{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long t,n,r;
t=Long.parseLong(b.readLine());
while(t-->0){
n=Long.parseLong(b.readLine());
r=(n*(n+1)*(n+2))/6;
if(r%2==0)
r=r+(n*(n+2)*(2*n-1))/24;
else
r=r+((n*n-1)*(2*n+3))/24;
System.out.println(r);
}}}
