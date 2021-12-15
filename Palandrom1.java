//write a prog to display check the given no is palendrom or not
class Palandrom1
{
public static void main(String[] args)
{
int num=122,rev=0;
int temp=num;
while(num>0)
{
int dig=num%10;
rev=(rev*10)+dig;
num=num/10;
}
if(temp==rev) 
{
System.out.println("no is Palandrom"+temp+"=="+rev);

}
else
{

System.out.println("no is Not Palandrom"+temp+"!="+rev);

}
}

}