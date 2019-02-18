import java.util.Scanner;

public class Dots {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter something");
        String words = input.nextLine();
        System.out.println("You entered:" + words);

        for (int a =(words.length()-1); a>=0; a--){
            System.out.print(words.charAt(a));
        }
    }
}
