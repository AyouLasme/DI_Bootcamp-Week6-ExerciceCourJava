package boucles;

public class While {

    public static void main(String[] args) {
        //int count = 1;
       /* while (count < 10)
        {
            System.out.println("Numbers is " + count);
            int increment = count++;
            System.out.println("increment= "+increment);
            System.out.println("\n=========\n");
        }*/

        for (int count = 1; count <= 10; count++){
            if (count == 5){
                continue;
            }
            System.out.printf(String.format("(%d - %d) ",count,count));
        }
        System.out.printf("Used continue to skip printing 5");
    }
}
