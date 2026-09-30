import java.util.Scanner;
import java.util.Random;
public class Main {

  public static int validEntry(int num){
    
    if(num == 1){
      return 1;
    }
    if(num == 2){
      return 1;
    }
    if(num == 3){
      return 1;
    }
    else{
      return 0;
    }
  }
  public static int drawStone(){
    Random random = new Random();
    int cv = random.nextInt(3)+1;
    return cv;
  }

  public static int


    public static void main(String[] args) {
      Random random = new Random();
      //RANDOM STONE GENERATION
      int nim = random.nextInt(15, 31);
      Scanner key = new Scanner(System.in);
      drawStone();
      //DECLARE VALUE SO LOOP WORKS
      int value;
      //WHILE LOOP CONFIRM IF USER INPUT CORRECT
      while(true){
        System.out.println("Draw your number");
        value = key.nextInt();
        validEntry(value);
        if(validEntry(value) == 0){
          System.out.println("Try again, invalid input");
          continue;
        }
        if(nim == 0){
          System.out.println("Game done!")
        }
        nim = nim - value;
        System.out.println(nim);
        nim = nim - drawStone();
        System.out.println(nim);
        if (nim)

      }

      
      

     
    }
}
