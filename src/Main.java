import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Ingrese un valor");

        try {
            int division = 10 / 0;
            System.out.println(division);
        }
        catch (Exception e) {
            System.out.println("Capturamos la excepción en tiempo de ejecución" + e.getMessage());
        }
        System.out.println("Continúa el flujo normal de la aplicación");
    }
}