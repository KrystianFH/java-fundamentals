/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.Arrays;
import java.util.Random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

//    public static void main(String [] args)
//    {
//        roll(5);
//        roll(3);
//        roll(0);
//    }

    public int[] roll(int n){
        int[] numbers = new int[5];
        int min = 1;
        int max = 6;

        for(int i = 0; i < numbers.length; i++){
            int rollValue = (int)(Math.random() * 6 + 1);
            numbers[i] = rollValue;
        }
        return numbers;
    }

//    public boolean containsDuplicates(){
//        int[] array =
//    }
}
