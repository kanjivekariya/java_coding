
public class daysbetweentwodates {
    public static int calculateDays(int dd, int mm, int yy) {
        int y1 = yy - 1;
        int days = 365 * y1 + yy / 4 - yy / 100 + yy / 400;
        for (int i = 1; i < mm; i++) {
            switch (i) {
                case 1, 3, 5, 7, 8, 10, 12 -> days += 31;
                case 4, 6, 9, 11 -> days += 30;
                case 2 -> days += 28;
            }
        }
        if (mm > 2 && (yy % 4 == 0 || (yy % 400 == 0 && yy % 100 != 0))) {
            days += 1;
        }
        days += dd;
        return days;
    }

    public static void main(String[] args) {
        System.out.println(calculateDays(1, 12, 2003) - calculateDays(12, 2, 2026));
    }

}
