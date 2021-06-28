public class A {
    protected int num;

    public A(int n)
    {
        num = n;
    }
    public int getNum()
    {
        return num;
    }
    public boolean f(A a)
    {
        return num == a.num * 2;
    }
}
