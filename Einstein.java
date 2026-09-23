import java.util.Scanner;

/**
 * Calculates energy from mass.
 *
 * @author Your Name
 * @version 1.0
 */
public final class Einstein {

    /**
     * Prevents class instantiation.
     */
    private Einstein() {
    }

    /**
     * Main method.
     *
     * @param args Command line args
     */
    public static void main(final String[] args) {
        // Speed of light in m/s
        final double speedOfLight = 2.998e8;

        // Scanner for user input
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mass in kg: ");

        // Read input and calculate energy
        if (scanner.hasNextDouble()) {
            final double mass = scanner.nextDouble();

            if (mass < 0) {
                System.out.println("Error: Mass cannot be negative.");
            } else {
                // Calculate E = mc^2
                final double energy = mass * Math.pow(speedOfLight, 2);
                System.out.printf("Energy released: %.3e Joules%n", energy);
            }
        } else {
            System.out.println(
                "Error: Invalid input. Please enter a valid number."
            );
        }

        scanner.close();
    }
}
