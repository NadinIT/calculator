
public class Number {
    //Rules for Roman Numerals: https://www.periodni.com/roman_numerals_converter.html

    public static String add(int arabic) {
        if (arabic > 0) {
            if (arabic < 10) {
                int repeat = arabic - 5;
                String num = "V";
                for (int i = 0; i < repeat; i++) {
                    num += "I";
                }
                return num;
            } else if (arabic < 40) {
                String num = "";
                int repeat = arabic / 10;
                for (int i = 0; i < repeat; i++) {
                    num += "X";
                }
                int arabic2 = arabic - 10 * repeat;
                String num2 = arabicToRoman(arabic2);
                return num + num2;
            } else if (arabic < 50) {
                String num = "XL";
                int remainder = arabic - 40;
                String num2 = arabicToRoman(remainder);
                return num + num2;
            } else if (arabic >= 51 && arabic < 60) {
                String num = "L";
                int remainder = arabic - 50;
                String num2 = arabicToRoman(remainder);
                return num + num2;
            } else if (arabic >= 90 && arabic < 100) {
                String num = "XC";
                int remainder = arabic - 90;
                String num2 = arabicToRoman(remainder);
                return num + num2;
            } else {
                String num = "L";
                int repeat = (arabic - 50) / 10;
                for (int i = 0; i < repeat; i++) {
                    num += "X";
                }
                int remainder = arabic - 50 - 10 * repeat;
                String num2 = arabicToRoman(remainder);
                return num + num2;
            }
        }

        return "";
    }

    public static String arabicToRoman(int arabic) {
        switch (arabic) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 50:
                return "L";
            case 100:
                return "C";
        }


        return add(arabic);

    }

    public static int romanToArabic(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            default:
                return 0;
        }
    }


    public static int romanToArabic(String roman) {
        String capitalized = roman.toUpperCase();
        char[] romanArray = capitalized.toCharArray();
        int[] arabicArray = new int[romanArray.length];

        //convert romanArray into arabicArray
        int index = 0;
        while (index < romanArray.length) {
            char romanChar = romanArray[index];
            arabicArray[index] = romanToArabic(romanChar);
            index++;
        }

        //add up digits in arabicArray
        index = 0;
        int sum = 0;
        int previousDigit = 0;
        while (index < arabicArray.length) {
            int digit = arabicArray[index];
            if (index == 0) {
                previousDigit = digit;
            }

            if (previousDigit < digit) {
                sum -= digit;
            } else {
                sum += digit;
            }
            previousDigit = digit;
            index++;
        }
        if (sum < 0)
            sum = 0 - sum;
        return sum;
    }


    public static void main(String[] args) {

        System.out.println(romanToArabic("IX"));

//        System.out.println(arabicToRoman(60));
//        for (int i = 90; i < 100; i++) {
//            System.out.println(i + "=" + arabicToRoman(i));
//
//        }

    }
}