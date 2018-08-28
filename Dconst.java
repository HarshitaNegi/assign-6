class Dconst
{
Dconst()
{
this(5);
System.out.println("Default constructor");
}
Dconst(int x)
{
this(5,10);
System.out.println(x);
}
Dconst(int x,int y)
{
System.out.println(x+y);
}
public static void main(String args[])
{
new Dconst(); 
}
}
