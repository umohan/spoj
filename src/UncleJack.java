import java.io.*;import java.math.*;class UncleJack {
public static void main(String[]args)throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s[]=br.readLine().split(" ");
    BigInteger b1=new BigInteger(s[0]);
    BigInteger b2=new BigInteger(s[1]);
while(3>2){
System.out.println(b1.pow(b2.intValue()));
s=br.readLine().split(" ");
if(s[0].compareTo("0")==0)
    break;
b1=new BigInteger(s[0]);
b2=new BigInteger(s[1]);
}}}
