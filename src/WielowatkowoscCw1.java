import com.sun.jdi.request.InvalidRequestStateException;

public class WielowatkowoscCw1 implements Runnable {
    Thread thread;

    WielowatkowoscCw1(String name)
    {
        thread = new Thread(this, name);
    }
    public static WielowatkowoscCw1 createAndStart(String name)
    {
        WielowatkowoscCw1 myWielowatkowoscCw1 = new WielowatkowoscCw1(name);
        myWielowatkowoscCw1.thread.start();
        return myWielowatkowoscCw1;
    }
    public void run()
    {
        System.out.println(thread.getName() + " rozpoczyna działanie");
        try{
            for (int count = 0;count < 10; count++)
            {
                Thread.sleep(400);
                System.out.println(thread.getName() + " jest wykonywany, wartosc licznika: " + count);
            }
        }catch (InterruptedException e)
        {
            System.out.println(thread.getName() + " został przerwany");
        }
        System.out.println(thread.getName() + " kończy działanie.");
    }
}
class Wiecej {
    public static void main(String[] args) {
        System.out.println("Główny wątek rozpoczyna działanie.");
        WielowatkowoscCw1 myW1 = WielowatkowoscCw1.createAndStart("Wątek potomny nr 1");
        WielowatkowoscCw1 myW2 = WielowatkowoscCw1.createAndStart("Wątek potomny nr 2");
        WielowatkowoscCw1 myW3 = WielowatkowoscCw1.createAndStart("Wątek potomny nr 3");

            System.out.print(".");
            try {
                Thread.sleep(100);
                myW1.thread.join();
                myW2.thread.join();
                myW3.thread.join();
            }catch (InterruptedException e)
            {
                System.out.println("Wątek główny został przerwany");
            }

        System.out.println("Wątek główny końćzy działanie");
    }
}
