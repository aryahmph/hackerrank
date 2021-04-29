package aryahmph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TheTImeInWordTest {
    public static String timeInWords(int h, int m) {

        if (m == 0) {
            return get1To10(h) + " o' clock";
        } else if (m <= 30) {
            if (m == 1) {
                return "one minute past " + get1To10(h);
            } else if (m == 15) {
                return "quarter past " + get1To10(h);
            } else if (m == 30) {
                return "half past " + get1To10(h);
            } else {
                return get1To10(m) + " minutes past " + get1To10(h);
            }
        } else {
            h++;
            m = 60 -m;

            if (m == 1) {
                return "one minute to " + get1To10(h);
            } else if (m == 15) {
                return "quarter to " + get1To10(h);
            } else if (m == 30) {
                return "half to " + get1To10(h);
            } else {
                return get1To10(m) + " minutes to " + get1To10(h);
            }
        }

    }

    private static String get1To10(int number) {
        if (number >= 20) return get20to29(number);
        else if (number > 10) return get11to19(number);
        else switch (number) {
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
                case 10:
                    return "ten";
            }

        return null;
    }

    private static String get11to19(int number) {
        if (number > 13) {
            number -= 10;
            return get1To10(number) + "teen";
        } else switch (number) {
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
    }

    private static String get20to29(int number) {
        if (number > 20) {
            number -= 20;
            return "twenty " + get1To10(number);
        } else switch (number) {
            case 20:
                return "twenty";
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
    }


}
