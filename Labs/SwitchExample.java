public class SwitchExample {
  public static void main(String[] args) {
    char grade;
    grade = 'D';

    switch (grade) {
      case 'A':
      System.out.println("Fantastic job!");
      break;
      case 'B':
      System.out.println("Good job!");
      break;
      case 'C':
      System.out.println(" You're doing okay.");
      break;
      case 'D':
      System.out.println("Please schedule a conference.");
      break;
      case 'F':
      System.out.println("Start finishing homework and show up to class.");
      break;
      default:
      System.out.println("Invaild grade.");

    }
  }
}
