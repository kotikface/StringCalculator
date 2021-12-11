import java.util.ArrayList;
import java.util.List;

public interface ReadString {
    static char readOperator(String str) throws Exception {
        char[] arr=str.toCharArray();
        int kol=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/')
                kol++;
        }
            if(kol==1){
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]=='+' || arr[i] == '-' || arr[i]== '*' || arr[i]== '/')
                        return arr[i];

                }
            }
            else throw new Exception("Ошибка ввода");

        return 'f';
    }
    static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 100)) {
            throw new IllegalArgumentException(number + "не находится в диапазоне (0,100]");
        }
        List<RomanNumeral> romanNumerals = new ArrayList<>();
        romanNumerals.add(RomanNumeral.C);
        romanNumerals.add(RomanNumeral.XC);
        romanNumerals.add(RomanNumeral.L);
        romanNumerals.add(RomanNumeral.XL);
        romanNumerals.add(RomanNumeral.X);
        romanNumerals.add(RomanNumeral.IX);
        romanNumerals.add(RomanNumeral.V);
        romanNumerals.add(RomanNumeral.IV);
        romanNumerals.add(RomanNumeral.I);


        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }
    static int romanToNumber(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        } else {
            return -1;
        }
    }
}
