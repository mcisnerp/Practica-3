public class ThreadTester {
    public static void main(String[] args) {
        //Primero, construye un objeto MiHilo.
        PrintME h1 = new PrintME();
        PrintME h2 = new PrintME();
        PrintME h3 = new PrintME();

        //Luego, construye un hilo de ese objeto.
        Thread nuevoh1 = new Thread(h1);
        Thread nuevoh2 = new Thread(h2);
        Thread nuevoh3 = new Thread(h3);

        //Finalmente, comienza la ejecución del hilo.
        nuevoh1.start();
        nuevoh2.start();
        nuevoh3.start();
    }
}
