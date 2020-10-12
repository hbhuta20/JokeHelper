import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Let's make a joke!");// Here we will just print out Let's make a joke
    Scanner sc= new Scanner(System.in);
    System.out.println("How many nice jokes do you want? (integer)");//Here we added scanner to print out How many nice joke do you want.

    int numJokes = sc.nextInt();
    sc.nextLine();

    for(int x=0; x < numJokes; x++){ // This is for loops
      System.out.println("Give me an adjective");
      String adjective = sc.nextLine();
      if(adjective == "Fat" || (numJokes > 2 && numJokes < 4)){// Here we added the conditions for the if and else statements.
         System.out.println("Yo Mamma is " + adjective);
      } 
      else{
        System.out.println("Yo Mamma is not " + adjective);
      }
    }
    double funnyScore = 0.0;

    while (funnyScore<9.0){
      System.out.println("How funny were the jokes? Rate from 0.0 to 10.0? (double)");
      funnyScore= sc.nextDouble();
    }
    System.out.println("Thank you for visiting");



  }
}