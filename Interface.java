interface printable
{
void print();
}
class a6 implements printable
{
public void print()
{
System.out.print("Hello");
}
public static void main(String arg[])
{
a6 obj=new a6();
obj.print();
}
}
