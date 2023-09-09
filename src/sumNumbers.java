import java.util.Scanner;
public class sumNumbers {
    public static void main(String[]args){


        // This section allows the user to specify what operation he wants to carry out on both numbers
        System.out.println("Select Operator. \nEnter (add for Addition, sub for Subtraction, mul for Multiplication, div for Division or mod for Modulus)");
        Scanner scanner_1 = new Scanner(System.in);
        String Operator = scanner_1.nextLine();

        System.out.println("\n");


            // if the user inputs add as the operator, add the two inputs from the user
            // note, to compare strings, use  (variable).equals()
       // while (Operator.isBlank()||!Operator.equals("add")){
        //while (!Operator.equals("sub")&&!Operator.equals("mul")){
        while (((!Operator.equals("add")&&!Operator.equals("sub"))&&(!Operator.equals("div")&&!Operator.equals("mul")))&&(Operator.isBlank()||!Operator.equals("mod"))){
            /* I want to test if the answer the user inputs is not equal to any of the defined operations,
            loop the request for the operation to carry out on the numbers
             */
            System.out.println("Select Operator. \nEnter (add for Addition, sub for Subtraction, mul for Multiplication, div for Division or mod for Modulus)");
            scanner_1 = new Scanner(System.in);
            Operator = scanner_1.nextLine();
            System.out.println("\n");
        }
        // Accept the first input from the user
        System.out.println("Enter your first value");
        Scanner scanner_2 = new Scanner(System.in);
        double figure_1 = scanner_2.nextDouble();

        // Accept the second input from the user
        System.out.println("Enter your second value");
        Scanner scanner_3 = new Scanner(System.in);
        double figure_2 = scanner_3.nextDouble();


        if (Operator.equals("add")){
                double Add = figure_1+figure_2;
                System.out.println("The sum of "+figure_1+" and "+figure_2+" is "+Add);

            } else if (Operator.equals("sub")) {
                double Sub = figure_1-figure_2;
                System.out.println("The difference of "+figure_1+" and "+figure_2+" is "+Sub);

            } else if (Operator.equals("mul")) {
                double Mul = figure_1*figure_2;
                System.out.println("The product of "+figure_1+" and "+figure_2+" is "+Mul);

            } else if (Operator.equals("div")) {
                double Div = figure_1/figure_2;
                System.out.println("The quotient of "+figure_1+" and "+figure_2+" is "+Div);

            } else if (Operator.equals("mod")) {
                double Mod = figure_1%figure_2;
                System.out.println("The modulus of "+figure_1+" and "+figure_2+" is "+Mod);
            }
    }
}
