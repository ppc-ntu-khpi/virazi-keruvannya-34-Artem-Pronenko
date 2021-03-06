package domain;
import java.util.Arrays;

/**
 * Main class
 * @author Artem Pronenko
 */

public class Exercise {
 /**
  * Main method for determining the second largest number in an array
  * @param arr[]
  * @return 
  */   
public static int Calculate(int[] arr) {
    int res=0; //переманная для хранения значения второго по величине числа
    for (int i = 0; i < arr.length - 1; i++) //сортируем масив по спаданию
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        //ищем второе по величине число
        for(int i=1; i<arr.length;i++){
            if(arr[i]!= arr[i-1] )
            { res = arr[i];
              break;}
            }
    return res;
}
//end of method Calculate()

}
