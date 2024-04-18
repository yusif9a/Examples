public class example2 {
    interface A
    {
        int methodA();
    }

    interface B
    {
        int methodB();
    }

    interface C
    {
        int methodC();
    }

    class D implements A, B, C
    {
        int i = 999+111;

        public int methodA()
        {
            i =+ i / i;

            return i;
        }

        public int methodB()
        {
            i =- i * i;

            return i;
        }

        public int methodC()
        {
            i = ++i - --i;

            return i;
        }
    }

    public class MainClass
    {
        public void main(String[] args)
        {
            D d = new D();

            System.out.println(d.i);

            System.out.println(d.methodA());

            System.out.println(d.methodB());

            System.out.println(d.methodC());
        }
    }
}
