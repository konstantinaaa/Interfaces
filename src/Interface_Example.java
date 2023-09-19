interface Test1
{
    void method1();
    void method2();
}
class A implements Test1
{
    @Override
    public void method1()
    {
        System.out.println("method1 of A class.");
    }
    public void method2()
    {
        System.out.println("method2 of A class.");
    }
    public void method3()
    {
        System.out.println("method3 of A class.");
    }
}
public class Interface_Example {
    public static void main(String[] args) {

        Test1 t = new A();
        t.method1();
        t.method2();
        System.out.println();

        A a = new A();
        a.method1();
        a.method2();
        a.method3();


    }
}
