import java.util.Scanner;
public class RemoveLeadingZero {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input string:");
        String input = sc.nextLine();

        //String input = "00000123789";

        String output = removeLeadingZeros(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String removeLeadingZeros(String input) {
        return Integer.toString(Integer.parseInt(input));
    }
}
