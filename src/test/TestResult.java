package test;
import static domain.Exercise.Calculate;

/**
 * test class
 * @author Artem Pronenko
 */
public class TestResult {
  public static void main(String[] args) {
     int[] array ={10, 8, 2, 10, 5};
         System.out.println("Число "+Calculate(array)+" є другим за величиною  в масиві");   
}
}
