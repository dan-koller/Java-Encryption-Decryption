package algorithm;

public abstract class Algorithm {
    public abstract String encode(String message, int key);
    public abstract String decode(String message, int key);
}
