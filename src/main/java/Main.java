import algorithm.Algorithm;
import algorithm.AlgorithmFactory;

public class Main {

    /**
     * Main method of the program. The passed arguments are processed and the algorithm is executed accordingly.
     * The result of either the encoding or the decoding is printed to the console or if the user passed the
     * corresponding flag the result is written to the specified file.
     *
     * @param args The arguments passed to the program by the user.
     */
    public static void main(String[] args) {
        // Default values for the arguments
        String mode = "enc";
        String data = null;
        int key = 0;
        String inputFile = null;
        String outputFile = null;
        String alg = "shift";

        // Parse the arguments
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode" -> mode = args[i + 1];
                case "-key" -> key = Integer.parseInt(args[i + 1]);
                case "-data" -> data = args[i + 1];
                case "-in" -> inputFile = args[i + 1];
                case "-out" -> outputFile = args[i + 1];
                case "-alg" -> alg = args[i + 1];
            }
        }
        // Null check for the input
        if (data == null && inputFile == null) data = "";
        else if (data == null) data = FileUtils.readFile(inputFile);

        // Switch between the modes
        Algorithm algorithm = AlgorithmFactory.getAlgorithm(alg);

        String result = "";
        if (mode.equalsIgnoreCase("enc")) result = algorithm.encode(data, key);
        else if (mode.equalsIgnoreCase("dec")) result = algorithm.decode(data, key);
        else System.out.println("Invalid mode!");

        // Write the result to a file
        if (outputFile != null) FileUtils.writeFile(outputFile, result);
        else System.out.println(result);
    }
}
