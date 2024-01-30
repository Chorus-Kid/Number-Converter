public class NumberConverter {
    int[] digits;
    int base;

    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number);
        digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            String single = numberAsString.substring(i,i+1);
            int d = Integer.parseInt(single);
            digits[i] = d;
        }
        this.base = base;
    }

    public String displayOriginalNumber() {
        String o = "";
        for (int i = 0; i < digits.length; i++) {
            o = o + digits[i];
        }
        o = o + "\n";
        return o;
    }

    public String displayConvertedNumber(int[] convertedNumber) {
        String printed = "";
        for(int i = 0; i < convertedNumber.length; i++) {
            printed = printed + convertedNumber[i];
        }
        return printed;
    }

    public int[] getDigits() {
        return digits;
    }

    public int[] convertToDecimal() {
        if (base != 2) {
        String nonNonConverted = "";
        for(int i = 0; i < digits.length - 1; i++) {
            nonNonConverted = nonNonConverted + digits[i];
        }
        int nonConverted = Integer.parseInt(nonNonConverted);
            nonConverted = nonConverted * base;
            String stringverted = Integer.toString(nonConverted);
            int[] convertedArray = new int[stringverted.length()];
            for (int i = 0; i < convertedArray.length; i++) {
                String digit = stringverted.substring(i, i + 1);
                int d = Integer.parseInt(digit);
                convertedArray[i] = d;
            }
            convertedArray[convertedArray.length - 1] = convertedArray[convertedArray.length - 1] + digits[digits.length - 1];
            return convertedArray;
        }
        else {
            int[] reversed = new int[digits.length];
            int reversedIndex = 0;
            for (int i = digits.length - 1; i < reversed.length; i--) {
                digits[i] = reversed[reversedIndex];
            }
            int converted = 0;
            for (int i = 1; i < reversed.length; i++) {
                if (reversed[i] == 1) {
                    converted = converted + 2 * i;
                }
            }
            if (reversed[0] == 1) {
                converted = converted + 1;
            }
            String conververted = Integer.toString(converted);
            int[] convertedArray = new int[conververted.length()];
            for (int i = 0; i < convertedArray.length; i++) {
                String digit = conververted.substring(i, i + 1);
                int d = Integer.parseInt(digit);
                convertedArray[i] = d;
            }
            return convertedArray;
        }
    }

    public int[] convertToBinary() {
        String nonNonConverted = "";
        for(int i = 0; i < digits.length - 1; i++) {
            nonNonConverted = nonNonConverted + digits[i];
        }
        int nonConverted = Integer.parseInt(nonNonConverted);
        nonConverted = nonConverted * base;
        String shhhhDecimalverted = Integer.toString(nonConverted);
        int[] shhhhDecimalvertedArray = new int[shhhhDecimalverted.length()];
        for (int i = 0; i < shhhhDecimalvertedArray.length; i++) {
            String digit = shhhhDecimalverted.substring(i, i + 1);
            int d = Integer.parseInt(digit);
            shhhhDecimalvertedArray[i] = d;
        }
        shhhhDecimalvertedArray[shhhhDecimalvertedArray.length - 1] = shhhhDecimalvertedArray[shhhhDecimalvertedArray.length - 1] + digits[digits.length - 1];
        nonConverted = nonConverted + digits[digits.length - 1];
        String nonConvertedFR = "";
        int temp = nonConverted;
        while (temp > 1) {
            int remainder = temp % 2;
            temp = temp / 2;
            String stringmainder = Integer.toString(remainder);
            nonConvertedFR = nonConvertedFR + stringmainder;
        }
        int[] FINALLYCONVERTED = new int[nonConvertedFR.length()];
        for (int i = 0; i < FINALLYCONVERTED.length; i++) {
            String digit = nonConvertedFR.substring(i, i + 1);
            int d = Integer.parseInt(digit);
            FINALLYCONVERTED[i] = d;
        }
        return FINALLYCONVERTED;
    }

    public int[] convertToOctal() {
        String nonNonConverted = "";
        for(int i = 0; i < digits.length; i++) {
            nonNonConverted = nonNonConverted + digits[i];
        }
        int nonConverted = Integer.parseInt(nonNonConverted);
        int converted = 0;
        while (nonConverted > 8) {
            nonConverted = nonConverted - 8;
            converted = converted + 10;
        }
        converted = converted + nonConverted;
        String stringverted = Integer.toString(converted);
        int[] convertedArray = new int[stringverted.length()];
        for(int i = 0; i < convertedArray.length; i++) {
            String digit = stringverted.substring(i, i + 1);
            int d = Integer.parseInt(digit);
            convertedArray[i] = d;
        }
        return convertedArray;
    }
}