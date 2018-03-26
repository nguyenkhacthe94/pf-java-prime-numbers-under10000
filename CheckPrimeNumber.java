public class CheckPrimeNumber {
    public static boolean isPrime(int number) {
        boolean check = true;
        if (number < 2) check = false;
        else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        System.out.print("Prime numbers from 2 to 10000 are:");
        for (int number = 2; number < 10000; number ++) {
            boolean check = isPrime(number);
            if (check) System.out.print(number + "\t");
        }
    }
}
