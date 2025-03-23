//Ass 2
//Q.5
import java.util.*;

public class AlphabeticalOrder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
        }
        
        // Sorting without Arrays.sort()
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    // Swap names[i] and names[j]
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        
        System.out.println("\nNames in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}

/*Outout
Enter 10 names:
jay
viraj
om
meena
jaya
poonam
sakshi
diya
vaishnvi
lata

Names in Alphabetical Order:
diya
jay
jaya
lata
meena
om
poonam
sakshi
vaishnvi
viraj*/

