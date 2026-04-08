import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            uniqueNumbers.add(scanner.nextInt());
        }
        Iterator<Integer> iterator = uniqueNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}
