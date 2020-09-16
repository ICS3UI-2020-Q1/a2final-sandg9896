import java.util.Scanner;
/**
 * Making a program that tells customers their total cost based on the size of pizza they order
 * @author Gavin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
   public static void main(String[] args) {
    // calculating subtotal, tax, than total cost of pizza for customers after they enter a size of pizza

    // Create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask user to enter size of pizza
    System.out.print("Please enter the diameter of the pizza you would like in cm:");
    double pizzaSize = input.nextInt();
    
    // calculate subtotal of pizza
    double subtotal = pizzaSize*0.5+0.99+0.75;
    System.out.println("Subtotal:$" + subtotal);

    // calculate for the cost of the tax
    double tax = subtotal*0.13;
    System.out.println("Taxes:$" + tax);

    // tell customer total price
    double total = subtotal + tax;
    System.out.println("Total:$" + total);

    // have something appear if pizza is larger than 40cm
    if(pizzaSize>40){
      // tell them if the pizza is large
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }

  
    
  }
}
