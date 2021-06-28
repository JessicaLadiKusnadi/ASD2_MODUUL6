
package Stack;

public class TumpukanApp {
    public static void main(String[] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.peek();
        System.out.println(" ");
        tumpukan.push(100);
        tumpukan.peek();
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.peek();
        System.out.println(" ");
        tumpukan.push(60);
        tumpukan.peek();
        System.out.println(" ");
        tumpukan.push(80);
        tumpukan.peek();
        long nilai2=tumpukan.pop();
        
        System.out.println(" ");
        tumpukan.peek();
        System.out.println(" ");
        long nilai3=tumpukan.peek();
        System.out.println("nilai top  = " +nilai3);
        
      
    }
}
    

