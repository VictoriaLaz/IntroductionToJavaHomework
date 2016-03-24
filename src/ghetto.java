import java.util.Scanner;

/**
 * Created by User on 20-Mar-16.
 */
public class ghetto {
    public static void main(String[] args) {
        System.out.println("Write the number you want to convert to Ghetto numeral system:");
        Scanner reader = new Scanner(System.in);
        Integer number = reader.nextInt();
        String convertedNumberToGhetto = convertingNumberToGhetto(number);
        System.out.println(convertedNumberToGhetto);
    }

    private static String convertingNumberToGhetto(Integer number) {
        String numberAsString = number.toString();
        StringBuilder ghettoNumber = new StringBuilder();
        for (int i = 0; i < numberAsString.length() ; i++) {
            ghettoNumber.append(convertDigitInGhetto(numberAsString.charAt(i)));
        }
        return ghettoNumber.toString();
    }

    private static String convertDigitInGhetto(char digit) {
        String ghettoDigit = " ";
        switch (digit) {
            case '0': ghettoDigit = "Gee";
                break;
            case '1':  ghettoDigit ="Bro";
                break;
            case '2': ghettoDigit = "Zuz";
                break;
            case '3': ghettoDigit ="Ma";
                break;
            case '4': ghettoDigit ="Duh";
                break;
            case '5': ghettoDigit = "Yo";
                break;
            case '6': ghettoDigit = "Dis";
                break;
            case '7': ghettoDigit = "Hood";
                break;
            case '8': ghettoDigit ="Jam";
                break;
            case '9': ghettoDigit = "Mack";
                break;
            default: System.out.println("You cannot convert this number even in ghetto numeral.");
                break;
        }
        return ghettoDigit;
    }
}
