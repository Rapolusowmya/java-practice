public class PrivateConstructor
{
    private PrivateConstructor()
    {

    }
    public static PrivateConstructor createINstance()
    {
        System.out.println("print method");
        return new PrivateConstructor();
    }

    public staic void main(String[] args)
    {
    PrivateConstructor obj = PrivateConstructor.createINstance();
    }

}