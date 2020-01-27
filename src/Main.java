import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {



    public static void main(String[] args) throws Exception {
        try{
            while (true){
            Calc calculator = new Calc();
            Scanner scanner = new Scanner(System.in);
            calculator.setSt1(scanner.nextLine());
            calculator.setNumbers(calculator.getSt1().split("[+-/*]"));
            String answer =  calculator.selectAndCalcVersion(calculator.version1(),calculator.version2());
            System.out.println(answer);
            }
        }
        catch (Exception e){
            System.out.println("Ошибка ввода");
        }

    }
}












