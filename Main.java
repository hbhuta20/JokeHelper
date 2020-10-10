import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Let's make a joke!");
    Scanner sc= new Scanner(System.in);
    System.out.println("How many jokes do you want? (number)");

    int x = sc.nextInt();
    sc.nextLine();
    
    while(x>0){
      System.out.println("Give me an adjective");
      String adjective = sc.nextLine();
      System.out.println("Yo Mamma is "+adjective);
      x--;
    }
  }
}