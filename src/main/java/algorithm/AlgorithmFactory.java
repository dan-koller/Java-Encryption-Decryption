package algorithm;

public class AlgorithmFactory {

    /**
     * Returns the algorithm specified by the user.
     *
     * @param algorithm The algorithm specified by the user in the arguments.
     * @return The algorithm specified by the user.
     */
    public static Algorithm getAlgorithm(String algorithm) {
        return switch (algorithm) {
            case "shift" -> new ShiftAlgorithm();
            case "unicode" -> new UnicodeAlgorithm();
            default -> null;
        };
    }
}
