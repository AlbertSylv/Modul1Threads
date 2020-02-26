package dat.sem2.threads;

public class UseAllCores implements Runnable{

    static Thread myThread;


    public void run() {
        // TODO Auto-generated method stub  
    }

    public static void main(String[] args) {
        System.out.println("Good morning");

        

        int processors = Runtime.getRuntime().availableProcessors();
        for(int i=0; i < processors; i++) {
        myThread = new Thread(new UseAllCores());  
          // You may need to pass in parameters depending on what work you are doing and how you setup your thread.
          myThread.start();
            
        }
 System.out.println(processors);
    }


}
