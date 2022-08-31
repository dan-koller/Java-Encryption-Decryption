package algorithm;

public class AlgorithmFactory {
    public static Algorithm getAlgorithm(String algorithm) {
        return switch (algorithm) {
            case "shift" -> new ShiftAlgorithm();
            case "unicode" -> new UnicodeAlgorithm();
            default -> null;
        };
    }
}
