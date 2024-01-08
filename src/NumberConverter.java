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

    public int[] getDigits() {
        return digits;
    }

    public int[] convertToDecimal() {
        String nonConverted = "";
        for(int i = 0; i < digits.length; i++) {
            nonConverted = nonConverted + digits[i];
        }
        int notConvertedYet = Integer.parseInt(nonConverted);
        int converted = notConvertedYet / 10 + notConvertedYet % 10;
        String stringverted = Integer.toString(converted);
        int[] conconverted = new int[stringverted.length()];
        for(int i = 0; i < conconverted.length; i++) {
            String digit = stringverted.substring(i, i + 1);
            int d = Integer.parseInt(digit);
            conconverted[i] = d;
        }
        return conconverted;
    }

    public int[] convertToBinary() {
        String nonConverted = "";
        for(int i = 0; i < digits.length; i++) {
            nonConverted = nonConverted + digits[i];
        }
        int notConvertedYet = Integer.parseInt(nonConverted);
        int converted = notConvertedYet / 2 + notConvertedYet % 2;
        String stringverted = Integer.toString(converted);
        int[] conconverted = new int[stringverted.length()];
        for(int i = 0; i < conconverted.length; i++) {
            String digit = stringverted.substring(i, i + 1);
            int d = Integer.parseInt(digit);
            conconverted[i] = d;
        }
        return conconverted;
    }

    public int[] convertToOctal() {
        String nonConverted = "";
        for(int i = 0; i < digits.length; i++) {
            nonConverted = nonConverted + digits[i];
        }
        int notConvertedYet = Integer.parseInt(nonConverted);
        int converted = notConvertedYet / 8 + notConvertedYet % 8;
        String stringverted = Integer.toString(converted);
        int[] conconverted = new int[stringverted.length()];
        for(int i = 0; i < conconverted.length; i++) {
            String digit = stringverted.substring(i, i + 1);
            int d = Integer.parseInt(digit);
            conconverted[i] = d;
        }
        return conconverted;
    }
}

