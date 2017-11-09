import java.util.Scanner;
/**
 * Description of class Examples goes here.
 *
 * Matthew Tang
 * @version (a version number or a date)
 *
 * REMEMBER TO GIT PULL BEFORE CODING!!! GIT PUSH BEFORE CLOSING TOO!!!
 */
public class Examples
{
    public static void main(String[] args)
    {
        counter2(10);
    }

    public static void counter (int num){
        int i = 1;
        while (i <= num){
            System.out.println(i);
            i++; //when it breaks, i = 6
        }

    }

    public static void counter2 (int num){
        int i = 1;
        for(;;){ // There is literally no reason why you would do this but you could
            System.out.println(i);
            i++;
            if (i > num)
                break;

        }
        System.out.println("Done");
        /*
        for (int i = 1; i <=num, i++){
        System.out.println(i);
        }*/

    }

    public static void enterNum()
    {
        Scanner input = new Scanner(System.in);
        int num;

        do{
            System.out.println("Enter a number from 4 to 16: ");
            num = input.nextInt();
            System.out.println("You picked #" + num);
        }
        
        while(num >= 4 && num <= 16);

        System.out.println("That's not an integer from 4 to 16. GOODBYE! >(");

    }
}
