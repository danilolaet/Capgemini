public class ComandoForEach {
    public static void main(String[] args) {
        int [] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Varrendo o vetor sem for each");
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Nr : " + vetorNumeros[i]);
        }

        System.out.println("Varrendo o vetor com for each");
        for (int listaNumeros : vetorNumeros) {
            System.out.println("Nr : " + listaNumeros);
        }
    }
}
