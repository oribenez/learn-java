public class C extends A {
    public C(int n)
    {
        super(n);
    }
    @Override
    public boolean f(A a)
    {
        return a instanceof C && num == a.num;
    }
}
