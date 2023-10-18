package TrabalhandoArray;

import javax.swing.*;

public class TrabalhandoArray {
    public static void main(String[] args) {
        String [] paises = new String[4];

        for (int i = 0; i < 4; i++) {
            paises[i] = JOptionPane.showInputDialog("Informe o país");
        }

        for (String listaPaises : paises) {
            System.out.println(listaPaises);
        }
    }
}
