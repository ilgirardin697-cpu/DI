import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana Principal");
        ventana.setSize(400,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton("Presioname");
        JLabel etiqueta = new JLabel("Hola Mundo");

        boton.addActionListener(e -> etiqueta.setText("Chau Mundo"));

        ventana.setLayout(new FlowLayout());
        ventana.add(boton);
        ventana.add(etiqueta);

        ventana.setVisible(true);
    }
}