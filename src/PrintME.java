public class PrintME implements Runnable{
        public void run(){

            try {
                for (int i=1; i<=10; i++){
                    System.out.println("Numero "+i);
                    Thread.sleep(2000);
                }
            }catch (InterruptedException exc){
                System.out.println("Hilo interrumpido.");
            }

        }
    }
