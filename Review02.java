
public class Review02 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            // iが3か５で割り切れる場合
            if (i % 3 == 0 && i % 5 == 0) {
                // 結果を出力
                System.out.println("FizzBuzz");

            　// 3で割り切れる場合
            } else if (i % 3 == 0) {
                // 結果を出力
                System.out.println("Fizz");

              // 5で割り切れる場合
            } else if (i % 5 == 0) {
                // 結果を出力
                System.out.println("Buzz");

              // iの値を表示
            } else {
                System.out.println(i);

            }
        }
    }

}
