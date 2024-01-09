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

    public String displayConvertedNumber() {

    }

    public int[] getDigits() {
        return digits;
    }

    public int[] convertToDecimal() {
        String nonNonConverted = "";
        for(int i = 0; i < digits.length; i++) {
            nonNonConverted = nonNonConverted + digits[i];
        }
        int nonConverted = Integer.parseInt(nonNonConverted);
        int converted = 0;
        while (nonConverted > 10) {
            nonConverted = nonConverted - 10;
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

    public int[] convertToBinary() {
        String nonNonConverted = "";
        for(int i = 0; i < digits.length; i++) {
            nonNonConverted = nonNonConverted + digits[i];
        }
        int nonConverted = Integer.parseInt(nonNonConverted);
        int converted = 0;
        while (nonConverted > 2) {
            nonConverted = nonConverted - 2;
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