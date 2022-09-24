public class MyThread extends Thread{
    int damage;
    int damaged = 0;
    String name;
    MyThread(int x, String name){
        damage = x;
        this.name = name;
    }
    public void run(){
     while(Main.money>damage) {
         Main.money = Main.money - damage;
         System.out.println(name + " removed " + damage + " money. Remained " + Main.money + " money.");
         damaged += damage;
        }
    }
}