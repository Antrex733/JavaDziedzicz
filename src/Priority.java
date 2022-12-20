
    public class Priority implements Runnable {
        int count; Thread thread; static boolean stop = false; static String currentName;

        Priority(String name) {
            thread = new Thread(this, name);
            count = 0;
            currentName = name;
        }

        public void run() {
            System.out.println(thread.getName() + " rozpoczyna działanie");
            do {
                count++;
                if (currentName.compareTo(thread.getName()) != 0) {
                    currentName = thread.getName();
                    System.out.println(currentName + " jest wykonywany");
                }
            } while (stop == false && count < 10_000_000);
            stop = true;
            System.out.println("\n" + thread.getName() + " kończy działanie");
        }
    }
    class PriorityDemo{
        public static void main(String[] args) {
            Priority nt1 = new Priority("Wątek o wysokim priorytecie");
            Priority nt2 = new Priority("Wątek o niskim priorytecie");
            Priority nt3 = new Priority("Wątek nr 1 o normalnym priorytecie");
            Priority nt4 = new Priority("Wątek nr 2 o normalnym priorytecie");
            Priority nt5 = new Priority("Wątek nr 3 o normalnym priorytecie");

            nt1.thread.setPriority(Thread.MAX_PRIORITY);
            nt2.thread.setPriority(Thread.MIN_PRIORITY);
            nt1.thread.start();nt2.thread.start();nt3.thread.start();nt4.thread.start();nt5.thread.start();
            try{
                nt1.thread.join();nt2.thread.join();nt3.thread.join();nt4.thread.join();nt5.thread.join();
            }catch (InterruptedException e)
            {
                System.out.println("\nWątek o wysokim priotytecie dołączył do "+ nt1.count);
                System.out.println("Wątek o niskim priotytecie dołączył do "+ nt2.count);
                System.out.println("1. wątek o normalnym priotytecie dołączył do "+ nt3.count);
                System.out.println("2. wątek o normalnym priotytecie dołączył do "+ nt4.count);
                System.out.println("3. wątek o normalnym priotytecie dołączył do "+ nt5.count);
            }
        }
    }

