/**
 * Threads
 * Multiple Threads
 */
// class At extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=100;i++)
//         {
//             System.out.println("Salut");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) { e.printStackTrace(); }
//         }
//     }
// }
// class Bt extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=100;i++)
//         {
//             System.out.println("Bonjour");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) { e.printStackTrace(); }
//         }
//     }
// }
// public class Threads {
//     public static void main(String[] args) {
//         At obj1 = new At();
//         Bt obj2 = new Bt();

//         // System.out.println(obj1.getPriority());
//         // obj2.setPriority(Thread.MAX_PRIORITY);

//         obj1.start();
//         try {
//             Thread.sleep(5);
//         } catch (InterruptedException e) { e.printStackTrace(); }

//         obj2.start();
//     }

    
// }

/*
 * Implementing Using Runnable
 */
// public class Threads {
//     public static void main(String[] args) {
//         Runnable obj1 = () -> {
//                 for(int i=1;i<=5;i++)
//                 {
//                     System.out.println("Salut");
//                     try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
//                 }
//         };
//         Runnable obj2 = () -> {
//             for(int i=1;i<=5;i++)
//             {
//                 System.out.println("Bonjour");
//                 try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
//             }
//     };

//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);

//         t1.start();
//         t2.start();
//     }

// }
/*
 * Race Condition
 */
class Counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}

public class Threads {
        public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable obj1 = () -> 
        {
                for(int i=1;i<=10000;i++)
                {
                   c.increment(); 
                }
        };
        Runnable obj2 = () -> 
        {
            for(int i=1;i<=10000;i++)
            {
               c.increment(); 
            }
    };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }

}