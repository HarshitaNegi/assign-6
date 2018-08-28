class H
{
public void and()
{
System.out.println("enter in H");
}
}
class I extends H
{
public void and()
{
super.and();
System.out.println("enter in I");
}
}
class Instance
{
public static void main(String args[])
{
I i=new I();
i.and();
System.out.println("called H without using object");
}
}
