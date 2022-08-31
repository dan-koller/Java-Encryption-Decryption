package algorithm;

public class ShiftAlgorithm extends Algorithm {

    /**
     * Encode the current char by shifting each letter by the specified number
     * according to its order in the alphabet in circle
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
            if (Character.isLetter(currentChar)) {
                int unicode = currentChar + key;
                if (Character.isUpperCase(currentChar)) {
                    if (unicode > 'Z') unicode = unicode - 26;
                } else if (Character.isLowerCase(currentChar)) {
                    if (unicode > 'z') unicode = unicode - 26;
                }
                encodedMessage += (char) unicode;
            } else {
                encodedMessage += currentChar;
            }
        }
        return encodedMessage;
    }

    /**
     * Decode the current char by shifting each letter by the specified number
     * according to its order in the alphabet in circle
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
            if (Character.isLetter(currentChar)) {
                int unicode = currentChar - key;
                if (Character.isUpperCase(currentChar)) {
                    if (unicode < 'A') unicode = unicode + 26;
                } else if (Character.isLowerCase(currentChar)) {
                    if (unicode < 'a') unicode = unicode + 26;
                }
                decodedMessage += (char) unicode;
            } else {
                decodedMessage += currentChar;
            }
        }
        return decodedMessage;
    }
}
