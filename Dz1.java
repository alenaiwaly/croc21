package dz1;

public class Dz1 {

    /**
     * Функция, которая выводит Fizz, если число кратно трем, и Buzz, если крастно пяти
     * @param i 
     */
    public static void isT(int i) {
        if (i % 3 == 0) {
            System.out.print("Fizz");
        }
        if (i % 5 == 0) {
            System.out.print("Buzz");
        }
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0 || i%5==0){
                isT(i);
            }
            else System.out.print(i);
            System.out.println("");
        }
    }
    
}
