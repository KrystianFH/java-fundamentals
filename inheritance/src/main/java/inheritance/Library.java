/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args){
        Restaurant restaurant = new Restaurant("Pizza Planet", "$", 4.8);
        System.out.println(restaurant);
    }
}



