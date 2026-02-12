import java.util.HashMap;

public class romanToDecimal {
    public static void main(String[] args) {
        HashMap<Character, Integer> values = new HashMap<Character, Integer>();
        values.put('i', 1);
        values.put('v', 5);
        values.put('x', 10);
        // values.put('i', 1);

        String roman = "xvi";
        int x = 0;
        for (int i = 0; i < roman.length(); i++) {
            x += values.get(roman.charAt(i));
        }
        System.out.print(x);
    }
}
