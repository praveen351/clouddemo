import java.util.*;
public class HelloWorld{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x , y , z;
    System.out.println("Enter first number");
    x = sc.nextInt();
    System.out.println("Enter Second number");
    y = sc.nextInt();
    z = x + y;
    System.out.println("The sum is :" + z);
  }
}
