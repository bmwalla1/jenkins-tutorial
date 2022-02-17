import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a command: (exit to quit)");
        String s = in.nextLine();
        while(!s.equals("exit")) {
            String[] split = s.split("\\s+");
            String command = split[0];
            if(command.equals("add")) {
                System.out.println(calculator.add(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            } else if(command.equals("subtract")) {
                System.out.println(calculator.subtract(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            } else if(command.equals("multiply")) {
                System.out.println(calculator.multiply(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            } else if(command.equals("divide")) {
                System.out.println(calculator.divide(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            } else if(command.equals("fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(split[1])));
            } else if(command.equals("binary")) {
                System.out.println(calculator.intToBinaryNumber(Integer.parseInt(split[1])));
            } else {
                System.out.println(command + ": does not exist");
            }
            s = in.nextLine();
        }
        System.out.println("Exiting");
    }
}
