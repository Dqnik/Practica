public class Main {

   static MyThread ob1 = new MyThread(25, "Thread 1");
   static MyThread ob2 = new MyThread(30, "Thread 2");
   static MyThread ob3 = new MyThread(5, "Thread 3");
   static MyThread ob4 = new MyThread(3, "Thread 4");
    public static int money = 105;
    public static void main(String[] args) {
        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();



        boolean flag = true;

        while (flag) {
            if (!ob1.isAlive() && !ob2.isAlive() && !ob3.isAlive() && !ob4.isAlive()){
                System.out.println();
                System.out.println(Main.ob1.name + " damaged " + Main.ob1.damaged + " money");
                System.out.println(Main.ob2.name + " damaged " + Main.ob2.damaged + " money");
                System.out.println(Main.ob3.name + " damaged " + Main.ob3.damaged + " money");
                System.out.println(Main.ob4.name + " damaged " + Main.ob4.damaged + " money");
                System.out.println("Remained " + money + " money");
                flag = false;
            }
        }
    }
}
