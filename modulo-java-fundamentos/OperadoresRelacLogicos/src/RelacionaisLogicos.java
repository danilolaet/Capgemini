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

        //&& e ||
        num1 = 10;
        num2 = 20;
        int num3 = 10;
        int num4 = 30;

        if ((num1 == num3) && (num2 > num4)) {
            System.out.println("Primeira opção satisfeita");
        }   else {
                System.out.println("Segunda opção satisfeita");
        }

        if ((num1 == num3) || (num2 > num4)) {
            System.out.println("Primeira opção satisfeita");
        }   else {
            System.out.println("Segunda opção satisfeita");
        }

        //Estrutura condicional
        num1 = 5;
        num2 = 10;
        if (num1 > num2) {
            System.out.println("O numero 1 é maior que o numero 2");
        }   else if  (num1 < num2 ){
            System.out.println("O numero 1 é menor que o numero 2");
        }   else{
            System.out.println("O numero 1 é igual o numero 2");
        }

        num1 = 5;
        num2 = 5;
        if (num1 > num2) {
            System.out.println("O numero 1 é maior que o numero 2");
        }   else if  (num1 < num2 ){
            System.out.println("O numero 1 é menor que o numero 2");
        }   else{
            System.out.println("O numero 1 é igual o numero 2");
        }
    }
}
