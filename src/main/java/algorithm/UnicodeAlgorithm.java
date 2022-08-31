package algorithm;

public class UnicodeAlgorithm extends Algorithm {

    /**
     * Encode the current char by shifting it by key using unicode
     *
     * @param message The original message to be encoded.
     * @param key     The key to encode the message.
     * @return The encoded message as a String.
     */
    @Override
    @SuppressWarnings("StringConcatenationInLoop")
    public String encode(String message, int key) {
        String encodedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int unicode = currentChar + key;
            encodedMessage += (char) unicode;
        }
        return encodedMessage;
    }

    /**
     * Decode the current char by shifting it by key using unicode
     *
     * @param message The original message to be decoded.
     * @param key     The key to decode the message.
     * @return The decoded message as a String.
     */
    @Override
    @SuppressWarnings("StringConcatenationInLoop")
    public String decode(String message, int key) {
        String decodedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int unicode = currentChar - key;
            decodedMessage += (char) unicode;
        }
        return decodedMessage;
    }
}
