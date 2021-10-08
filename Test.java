package Live;

import Music.Saxophone;
import Music.Veena;

public class Test {
    public static void main(String[] args) {
        Veena obj=new Veena(){
            public void play()
            {
                System.out.println("Welcome");
            }
        };
        Saxophone obj1=new Saxophone(){
           public void play()
           {
               System.out.println("Programmer of Java");
           }
        };
    }
}
