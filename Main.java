import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Let's make a joke!");// Here we will just print out Let's make a joke
    Scanner sc= new Scanner(System.in);
    System.out.println("How many nice jokes do you want? (integer)");//Here we added scanner to print out How many nice joke do you want.
    int numJokes = sc.nextInt();

    for(int x=0; x < numJokes; x++){ // This is for loops
      
      if(numJokes > 1 && numJokes < 4){// Here we added the conditions for the if and else statements.
        System.out.println("Give me an adjective");
        String adjective = sc.next();
        adjective = adjective + sc.nextLine();
        System.out.println("Yo Mamma is " + adjective);
      } 
      else{
        System.out.println("Not enough jokes");
      }
    }
    double funnyScore = 0.0;

    while (funnyScore<9.0){ //This is the while loops
      System.out.println("How funny were the jokes? Rate from 0.0 to 10.0? (double)"); 
      funnyScore= sc.nextDouble();
    }
    System.out.println("Thank you for visiting");// I ended the whole code with a small greeting.
  }
}