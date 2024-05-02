import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите выражение без пробелов двух арабских чисел до 10 или двух римских чисел от I до X,");
        Scanner scanner = new Scanner(System.in);
        char[] userCharInput = new char[10];
        String userStringInput = scanner.nextLine();
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII",
                "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII",
                "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII",
                "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String[] blacks = userStringInput.split("[+-/*]");
        char operatorChar = 0;
        boolean numberRoman1 = false;
        String[] numberStringA = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int number1 = 0;
        int number2 = 0;
        boolean numberRoman2 = false;
        userCharInput = userStringInput.toCharArray();
        String number1String = null;
        String number2String = null;
        if (blacks.length == 2) {
            number1String = blacks[0];
            number2String = blacks[1];
        } else throw new IllegalArgumentException("Не верный знак операции");
        for (int i = 0; i < userCharInput.length; i++) {
            switch (userCharInput[i]) {
                case '*':
                    operatorChar = userCharInput[i];
                    break;
                case '+':
                    operatorChar = userCharInput[i];
                    break;
                case '-':
                    operatorChar = userCharInput[i];
                    break;
                case '/':
                    operatorChar = userCharInput[i];
                    break;


            }
        }
        for (int i = 0; i < numberStringA.length; i++) {
            if (numberStringA[i].equals(number1String)) {
                number1 = i;
            }
        }
        for (int i = 0; i < numberStringA.length; i++) {
            if (numberStringA[i].equals(number2String)) {
                number2 = i;
            }
        }
        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals( number1String)) {
                number1 = i;
                numberRoman1 = true;
            }
        }
        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(number2String)) {
                number2 = i;
                numberRoman2 = true;
            }
        }
        if (numberRoman1 && numberRoman2 && (operatorChar == '-') ) {
            if (number1<number2) {
            throw new IllegalArgumentException("Выражение в римских цифрах не может быть отрицательным");
            }
        }
        if (numberRoman1 && numberRoman2) {
            switch (operatorChar) {
                case('+') :
                    System.out.println(roman[number1 +number2]);
                    break;
                case('-'):
                    System.out.println(roman[number1 -number2]);
                    break;
                case('*'):
                    System.out.println(roman[number1 * number2]);
                    break;
                case('/'):
                    System.out.println(roman[number1 / number2]);
            }
        } else if ((!numberRoman1 && numberRoman2) || (numberRoman1 && !numberRoman2)) {
            throw new IllegalArgumentException("Вы ввели не допустимое выражение");
        } else if (!numberRoman1 && !numberRoman2) {
            switch (operatorChar) {
                case('+'):
                    System.out.println(number1 +number2);
                    break;
                case('-'):
                    System.out.println(number1 -number2);
                    break;
                case('*'):
                    System.out.println(number1 * number2);
                    break;
                case('/'):
                    System.out.println(number1 / number2);

            }
        }


        }
    }



