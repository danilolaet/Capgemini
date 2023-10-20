import javax.swing.*;
import java.util.ArrayList;

public class ArrayListCarros {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();

        carros.add("FLUENCE");
        carros.add("KOMBI");
        carros.add("JAGUAR");
        carros.add("BMW");
        carros.add("MERCEDES");
        carros.add("FUSCA");
        carros.add("VECTRA");

        System.out.println(carros);

        //Testando set
        carros.set(4,"MITSUBISHI");
        System.out.println(carros);

        //Testando remove
        carros.remove("VECTRA");
        System.out.println(carros);

        //Adicionando carros com o JOPtionPane
        carros.add(JOptionPane.showInputDialog("Informe o carro"));
        System.out.println(carros);

        //Testando esvaziar o vetor
        /*
        carros.clear();
        System.out.println(carros);

        if(carros.isEmpty()){
            System.out.println("O vetor está vazio");
        }
        */

        if (carros.contains("BMW")){
            for (int i = 0; i < carros.size(); i++) {
                if ("BMW".equals(carros.get(i))){
                    carros.set(i, "BUGATTI");
                    break;
                }
            }
        } else {
            System.out.println("Não achei o que foi pesquisado");
        }
        System.out.println(carros);
    }
}
