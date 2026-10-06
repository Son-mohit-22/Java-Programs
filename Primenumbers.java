class Primenumbers {
    public static void main(String[] args) {

        int n = 20;

        int count = 0;
        int num = 2;

        while (count < n) {
            int factors = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}