
public class PE33 {

    public static void main(String[] args) {
        Fraction totalFraction = new Fraction(1, 1);
        for (int numerator = 11; numerator < 100; numerator++) {
            if (numerator % 10 == 0)
                continue;

            for (int denominator = numerator + 1; denominator < 100; denominator++) {
                if (denominator % 10 == 0)
                    continue;

                if (isDigitCancelingFraction(numerator, denominator)) {
                    System.out.println(numerator + " / " + denominator);
                    totalFraction.numerator *= numerator;
                    totalFraction.denominator *= denominator;
                }
            }
        }
        System.out.println(totalFraction);
        totalFraction.reduce();
        System.out.println(totalFraction.denominator);
    }

    public static boolean isDigitCancelingFraction(int numerator, int denominator) {
        return isDigitCancelingFraction(new Fraction(numerator, denominator));
    }

    public static boolean isDigitCancelingFraction(Fraction fraction) {
        Fraction canceledDigits = cancelDigits(fraction);
        if (canceledDigits == fraction) {
            return false;
        }
        return canceledDigits.equals(Fraction.reduce(fraction));
    }

    public static Fraction cancelDigits(Fraction fraction) {
        int n1, n2, d1, d2; // denominator digits 1 and 2 and numerator 1 and 2

        n1 = fraction.numerator / 10;
        n2 = fraction.numerator % 10;
        d1 = fraction.denominator / 10;
        d2 = fraction.denominator % 10;

        if (n1 == d1) {
            return new Fraction(n2, d2);
        } else if (n1 == d2) {
            return new Fraction(n2, d1);
        } else if (n2 == d1) {
            return new Fraction(n1, d2);
        } else if (n2 == d2) {
            return new Fraction(n1, d1);
        }
        return fraction;
    }

}
