import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        char type = ' ';

        while (true) {
            System.out.print("Enter temperature (with C or F): ");
            input = scanner.next();
            type = input.charAt(input.length() - 1);
            if (type != 'C' && type != 'F'){
                System.out.println("Wrong or no temperature scale symbol entered!");
                System.out.println("Please try again");
                continue;
            }
            break;
        }

        String valueInStr = "";
        for(int i = 0; i < input.length() - 1; i++)
        {
            valueInStr += input.charAt(i);
        }
        float valueFloat = Float.parseFloat(valueInStr);
        if(type == 'C'){
            float temp = (valueFloat * 1.8f) + 32;
            System.out.println("The value of " + input + " in Fahrenheit is: " + temp);
        }
        else{
            float temp = ((valueFloat - 32) *5) / 9;
            System.out.println("The value of " + input + " in Celsius is: " + temp);
        }
    }
}