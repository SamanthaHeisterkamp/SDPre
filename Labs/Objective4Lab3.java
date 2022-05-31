import java.util.Scanner;
public class Objective4Lab3 {
  public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  int birthYear, age, currentYear;

  birthYear = 0;

  System.out.println("How old are you?");
  age = keyboard.nextInt();
  currentYear = 2022;


  birthYear = currentYear - age - 1;

  System.out.println("You were born in " + birthYear);

  keyboard.close();
  


 }
}
