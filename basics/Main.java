import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

  public static void main(String [] args){
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount =2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount =0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(4);
    clock();
  }

  public static String pluralize(String word, int num){
    if (num != 1){
      return word + "s";
    }
    return word;
  }

  public static void flipNHeads(int n){
    
    int count = 0;
    int heads = 0;

    while (n > heads){

      double rando = Math.random();
      
      if (rando >= 0.5){
        System.out.println("heads");
        heads++;
      } else {
        System.out.println("tails");
        heads = 0;
      }
      count++;
    }
    System.out.println("It took " + count + " flips to flip " + n + " heads in a row.");
  }

  public static void clock(){
    LocalDateTime now;
    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");

    double counter = 0.0;

    int currentSecond;
    int previousSecond = LocalDateTime.now().getSecond();

    while (true){
      counter++;
      now = LocalDateTime.now();
      currentSecond = now.getSecond();
      if(currentSecond == previousSecond){
        continue;
      } else{
        System.out.println(now.format(format));
        previousSecond = currentSecond;
      }
    }
  }
}
