import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result=0;
        boolean isValidOperator = true ;

        System.out.print("Enter the first number : ");
        num1=input.nextDouble();

        System.out.print("Enter an operator(+,-,*,/,^): ");
        operator = input.next().charAt(0);

        System.out.print("Enter the second number : ");
        num2=input.nextDouble();

        switch(operator){
            case '+'->result = num1 + num2;
            case '-'->result = num1 - num2;
            case '*'->result = num1 * num2;
            case '/'->{
                if(num2 == 0){
                    System.out.println("Cannot divide by zero...!");
                    isValidOperator = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^'->result = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid Operator...!");
                isValidOperator = false;
            }
        }

        if(isValidOperator) {
            System.out.println(result);
        }


        input.close();
    }
}
