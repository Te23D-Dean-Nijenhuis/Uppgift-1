import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        /*                                      BARA LEK
    int[] antal = {0,0,0,0,0,0};
    
    for (int i = 0; i < 1000; i++) {
            
            Random tärning = new Random();
    
            int tal=tärning.nextInt(6)+1;
            antal[tal-1]++;
            
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(i+1 + "=" + antal[i]);
        }
        */

        //gissa tal

        Random Tal = new Random();

        int Talgissa = Tal.nextInt(67)+1;

        Scanner tb = new Scanner(System.in);

        System.out.println("gissa tal mellan 1 och 68");

        int gissa = -100;

        while (Talgissa != gissa) {
            gissa = tb.nextInt();
            if(gissa < Talgissa)
            {
                System.out.println("större");
            } else if(gissa > Talgissa)
            {
                System.out.println("mindre");
            } else
            {
                System.out.println("grattis!");
            }
        }




    }
}