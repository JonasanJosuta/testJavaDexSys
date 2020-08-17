import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(3, 7, 8, 21, 63));
        System.out.println(checkReminder(numbers, 3));
        System.out.println(checkReminder(numbers, 7));
        System.out.println(checkReminder(numbers, 21));
    }

private static Set<Integer> checkReminder(Set<Integer> numbers, int number) {
    return numbers.stream()
            .filter(item -> item % number == 0)
            .collect(Collectors.toSet());
    }
}