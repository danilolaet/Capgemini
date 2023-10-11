public class LacoRepeticao {
    public static void main(String[] args) {

        int QuantVezes = 1;
        System.out.println("Comando WHILE");
        while (QuantVezes <= 10) {
            System.out.println("Estou fazendo a " + QuantVezes + "ª vez");
            QuantVezes++;
        }
            System.out.println("Saí do laço e executei " + (QuantVezes -1) + " vezes");

        System.out.println("Comando DO ... WHILE");
        QuantVezes = 1;
        do {
            System.out.println("Estou fazendo a " + QuantVezes + "ª vez");
            QuantVezes++;
        }
        while (QuantVezes <= 10);
        System.out.println("Saí do laço e executei " + (QuantVezes -1) + " vezes");

        System.out.println("Comando FOR");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Estou fazendo a " + i + "ª vez");
            QuantVezes = i;
        }
        System.out.println("Saí do laço e executei " + (QuantVezes) + " vezes");
        }
    }

