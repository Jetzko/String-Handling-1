public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "How are you?";

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        String char1 = String.copyValueOf(array1, 0, 2);
        String char2 = String.copyValueOf(array2, 10, 2);

        char[] charArray = char1.concat(char2).toCharArray();
        System.out.println(charArray);
    }
}
