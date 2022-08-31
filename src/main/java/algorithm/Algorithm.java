package algorithm;

/**
 * The abstract class that contains the methods to encode and decode a message.
 */
public abstract class Algorithm {
    public abstract String encode(String message, int key);

    public abstract String decode(String message, int key);
}
