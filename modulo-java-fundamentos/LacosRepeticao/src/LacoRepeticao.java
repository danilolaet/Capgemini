public class LacoRepeticao {
    public static void main(String[] args) {
        int QuantVezes = 1;

        while (QuantVezes <= 10) {
            System.out.println("Estou fazendo a " + QuantVezes + "ª vez");
            QuantVezes++;
        }
            System.out.println("Saí do laço e executei " + (QuantVezes -1) + " vezes");

        QuantVezes = 11;
        do {
            System.out.println("Estou fazendo a " + QuantVezes + "ª vez");
            QuantVezes++;
        }
        while (QuantVezes <= 10);
        System.out.println("Saí do laço e executei " + (QuantVezes -1) + " vezes");
        }
    }

