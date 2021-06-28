public class B extends A{
    public B(int n)
    {
        super(n);
    }

    public boolean f(B b)
    {
        return num == b.num;
    }
}
