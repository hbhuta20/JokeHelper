import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Let's make a joke!");
    Scanner sc= new Scanner(System.in);
    System.out.println("How many nice jokes do you want? (number)");

    int numJokes = sc.nextInt();
    sc.nextLine();

    for(int x=0; x < numJokes; x++){
      System.out.println("Give me an adjective");
      String adjective = sc.nextLine();
      if(adjective != "" || (numJokes > 2 && numJokes < 4)){
         System.out.println("Yo Mamma is " + adjective);
      } 
      else{
        System.out.println("Yo Mamma is not " + adjective);
      }
     
    }


  }
}