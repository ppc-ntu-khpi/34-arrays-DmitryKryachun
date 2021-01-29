# Практична робота "Масиви, вирази, керування виконанням програми"
## Я вибрав завдання:
### 13. Перевірте чи є задане число числом Армстронга

Дане завдання було виконанно за такою структурою:
![Image](https://github.com/ppc-ntu-khpi/34-arrays-DmitryKryachun/blob/master/images/2.jpg)

Що таке числа Армстронга можна дізнатися в [Wikipedia](https://uk.wikipedia.org/wiki/Числа_Армстронга)



## Код

**class Exercise**

```java

package domain;
/**
 * class in which the calculations take place
 * @author dimon
 */
public class Exercise {
    /**
     * Method which checks if this number is an armstrong
     * @param number number to check
     * @return bollean value
     */
    public static boolean Armstrong(int number){
        
        int num = number, digit, sum = 0;
        /**
         * there is a calculation a^3+b^3+c^3
         */
        while (num != 0){
            digit = num % 10;
            sum = (int) (sum + Math.pow(digit,3));
            num /= 10;
        }
       
        return sum == number;

    }
}

```

**class TestResult**
```java
package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number: ");
        int number = scanner.nextInt();
        System.out.println("Is "+ number +" an Armstrong number? " + Exercise.Armstrong(number));
        

    }
}
```
## Приклад виконання роботи:
![Image](https://github.com/ppc-ntu-khpi/34-arrays-DmitryKryachun/blob/master/images/1.jpg)
