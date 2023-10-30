public class StringReversal {
    public static void main(String[] args) {
        String input = "Hello, World!";
        char[] charArray = input.toCharArray();

        // Reverse the array using a for loop
        int length = charArray.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }

        String reversedString = new String(charArray);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString);
    }
}
