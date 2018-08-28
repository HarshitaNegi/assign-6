class X
{
public void display()
{
System.out.println("class X");
}
}
class Y extends X
{
public void display()
{
System.out.println("class Y");
}
}
class X1
{
public static void main(String args[])
{
X x=new X();
x.display();
}
}