
package taller1.lineal.search;

import java.util.Scanner;
/**
 *
 * @author Sebastian Baldion
 */
public class Taller1LinealSearch {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea buscar:");
        
        int x = obj.nextInt();
        int i;
        int [] A = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};
        int n = 12;
        
        for (i = 0; i < n; i++) {
            if (A[i] == x) {
                System.out.println("El valor que acabas de dijitar existe en tu lista");
                break;
            }
        }
        if (i == n) {
            System.out.println("El valor que acabas de dijitar NO existe en tu lista");
        }
    }
    
}
