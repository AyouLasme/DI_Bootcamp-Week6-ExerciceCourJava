package boucles;

public class For {
    public static void main(String[] args) {
       /* for (int i = 0; i <= 5; i--) {
            System.out.println("i= " + i);
        }*/
        int total = 0;
        for (int number = 2; number <= 20; number +=2){
            System.out.println("number= "+number);
            System.out.println("total= "+total);
            System.out.println("\n=========\n");
            total += number;
        }
        System.out.printf("Sum is %d%n", total);
    }
}
