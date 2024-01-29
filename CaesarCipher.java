public class CaesarCipher {
    public String cipher(String message, int offset) {
        StringBuilder result = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base + offset) % 26 + base));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}