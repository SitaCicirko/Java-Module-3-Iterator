import java.util.*;

class Test {
    public static void main(String[] args) {
        int sumA = 1000;
        int sumB = 0;
        int counter = 1;
        Random randomNr = new Random();

        while (sumA > sumB){
            sumA += randomNr.nextInt(10);
            sumB += randomNr.nextInt(50);
            System.out.println("Attempt nr: " + counter + ": suma A = " + sumA + ", suma B = " + sumB);
            counter++;
        }
    }
}
