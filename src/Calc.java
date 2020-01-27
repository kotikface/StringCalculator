
public class Calc{
    private String St1;
    private String[] Str = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private String[] numbers;
    public String selectAndCalcVersion(int j, int k) throws Exception {
        if (j == 2 || (j == 1 && numbers[0].equals(numbers[1])) && numbers.length == 2) {
            int number1 = ReadString.romanToNumber(numbers[0]);
            int number2 = ReadString.romanToNumber(numbers[1]);
            char operator = ReadString.readOperator(St1);
            int answer = calc(number1, number2, operator);
            String romanAnswer = ReadString.arabicToRoman(answer);
            return  romanAnswer;
        } else if (k == 2 || (k == 1 && numbers[0].equals(numbers[1])) && numbers.length == 2) {
            int number1 = Integer.parseInt(numbers[0]);
            int number2 = Integer.parseInt(numbers[1]);
            char operator = ReadString.readOperator(St1);
            String answer =String.valueOf(calc(number1, number2, operator)) ;
            return answer;
        }
        else throw new Exception("Ошибка ввода");
    }
    public  int version1() {
        int j = 0;

        for (int i = 0; i < Str.length; i++) {
            if (Str[i].equals(numbers[0]) || Str[i].equals(numbers[1])) {
                j++;
            }
        }
        return j;
    }
    public int version2() {
        int k = 0;
        for (int i = 0; i < arabic.length; i++) {
            if (arabic[i].equals(numbers[0]) || arabic[i].equals(numbers[1])) {
                k++;
            }
        }
        return k;
    }

    public int calc( int num1,int num2, char operator ){
        switch (operator){
            case '+':{
                num1 += num2;
                break;
            }case '-':{
                num1 -= num2;
                break;
            }case '*':{
                num1 *= num2;
                break;
            }case '/':{
                num1 /= num2;
                break;
            }default :{
                System.out.println( "Ошибка вычисления" );
            }
        }
        return num1;
    }

    public void setSt1(String st1) {
        St1 = st1;
    }

    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }

    public String getSt1() {
        return St1;
    }
}
