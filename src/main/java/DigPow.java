public class DigPow {
    public static long digPow(int n, int p) {
        String numString = String.valueOf(n);
        int sum = 0;

        // Calculate the sum of the digits raised to consecutive powers starting from p
        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            sum += Math.pow(digit, p + i);
        }

        // Check if the sum is divisible by n
        if (sum % n == 0) {
            return sum / n;
        } else {
            return -1;
        }
    }
}