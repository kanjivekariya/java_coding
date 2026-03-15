import java.util.Scanner;

public class ValidNumber {
    // public static boolean isValidno(String s){
    //     boolean digit = false;
    //     int sign=-1;
    //     if(s.length()==1 && (s.charAt(0)>57 || s.charAt(0)<48)){
    //         return false;
    //     }else if(s.length()==2 && (s.charAt(0)>57 || s.charAt(0)<48) ){

    //     }
    //     for (int i = 0; i < s.length(); i++) {
    //         if(s.charAt(i)<=57 && s.charAt(i)>=48){
    //             digit=true;
    //         }
    //         else if(s.charAt(i)=='+' && s.charAt(i)=='-'){
    //             if(i!=0 && s.charAt(i-1)!='e'){
                    
    //             }
    //         }
    //         else if(s.charAt(i)=='e' || s.charAt(i+1)==1){

    //         }
    //     }
    //     return true;
        
    // }

    public static boolean isNumber(String s) {
        boolean digit = false;
        boolean dot = false;
        boolean exp = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                digit = true;
            }

            else if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                    return false;
            }

            else if (c == '.') {
                if (dot || exp)
                    return false;
                dot = true;
            }

            else if (c == 'e' || c == 'E') {
                if (exp || !digit)
                    return false;
                exp = true;
                digit = false;
            }

            else {
                return false;
            }
        }

        return digit;
        }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long start = System.nanoTime();
        String s = sc.next();
        System.out.println(isNumber(s));
        sc.close();
        long end = System.nanoTime();

        System.out.println("Execution time: " + (end - start) / 1e6 + " ms");
    }
}
