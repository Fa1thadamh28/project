class FibonacciExample1{
public static void main(String args[])
{  
// for 18 Git Patch operation
 int x1=0,x2=1,x3,i,count=10;  
 System.out.print(x1+" "+x2);//printing 0 and 1  
  
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
 {  
  x3=x1+x2;  
  System.out.print(" "+x3);  
  x1=x2;  
  x2=x3;  
 }  


