public class solution2 {
    public static int fibonacci(int number) {
        if (number < 2){
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static int evenFib() {
        int num = 0;
        int sum = 0;
        while (fibonacci(num) <= 4000000){
            if (fibonacci(num) % 2 == 0){
                sum += fibonacci(num);
            }
            num++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(evenFib());
    }
}