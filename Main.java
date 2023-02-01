import java.util.Arrays;

class Main {

    public static boolean isPalidrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Hello mam how are you";
        String[] arr = input.split(" ");

        for (int j = 0; j < arr.length; j++) {
            boolean flag = isPalidrome(arr[j]);
            if (flag) {
                System.out.println(arr[j]);
            }

        }
    }
}