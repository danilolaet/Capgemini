public class RelacionaisLogicos {
    public static void main(String[] args) {
        int num1,num2;

        //testando uma igualdade
        num1 = 10;
        num2 = 10;
        if (num1 == num2) {
            System.out.println("O numero 1 e o numero 2 são iguais");
        }

        //testando uma diferença
        num1 = 10;
        num2 = 12;
        if (num1 == num2) {
            System.out.println("O numero 1 e o numero 2 são diferentes");
        }

        //testando se um é maior que o outro
        num1 = 10;
        num2 = 5;
        if (num1 > num2) {
            System.out.println("O numero 1 é maior que o numero 2");
        }

        //testando se um é menor que o outro
        num1 = 10;
        num2 = 30;
        if (num1 < num2) {
            System.out.println("O numero 1 é menor que o numero 2");
        }
    }
}
