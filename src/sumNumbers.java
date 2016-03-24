import java.util.Scanner;

/**
 * Created by User on 20-Mar-16.
 */
public class sumNumbers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = console.nextInt();
        int sum = 0;
        for(int i=1 ; i<=count; i++){

            sum+=i;
        }
        System.out.println(sum);
    }
}

