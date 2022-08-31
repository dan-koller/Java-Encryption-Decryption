package algorithm;

public class UnicodeAlgorithm extends Algorithm {
    @Override
    @SuppressWarnings("StringConcatenationInLoop")
    public String encode(String message, int key) {
        String encodedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            // Encode the current char by shifting it by key using unicode
            int unicode = currentChar + key;
            encodedMessage += (char) unicode;
        }
        return encodedMessage;
    }

    @Override
    @SuppressWarnings("StringConcatenationInLoop")
    public String decode(String message, int key) {
        String decodedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            // Decode the current char by shifting it by key using unicode
            int unicode = currentChar - key;
            decodedMessage += (char) unicode;
        }
        return decodedMessage;
    }
}
