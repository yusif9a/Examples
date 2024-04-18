public interface A {
    public default int getNumberOfGills(int input) { return 2; }
    int i = 100;
    int getValue();

    class F{

        int a = 5;

        void saes(){
            System.out.println("a");
        }

    }

    default void getBark(){
        System.out.println("Bark bark !");
    }
}
