# calculadora
Me falta hacer que los botones de los números funciones
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class calculadora extends JFrame {
    private JTextField pantalla;

    public calculadora() {
        // Configuración de la ventana
        setSize(400, 400);
        setTitle("Calculadora Java");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Añadir componentes
        JButton suma = new JButton("+");
        suma.setFont(new Font("Arial", Font.PLAIN, 30));
        add(suma);
        JButton resta = new JButton("-");
        resta.setFont(new Font("Arial", Font.PLAIN, 30));
        add(resta);
        JButton multiplicacion = new JButton("*");
        multiplicacion.setFont(new Font("Arial", Font.PLAIN, 30));
        add(multiplicacion);
        JButton division = new JButton("/");
        division.setFont(new Font("Arial", Font.PLAIN, 30));
        add(division);
        JButton clear = new JButton("C");
        clear.setFont(new Font("Arial", Font.PLAIN, 30));
        add(clear);
        JButton cero = new JButton("0");
        cero.setFont(new Font("Arial", Font.PLAIN, 30));
        add(cero);
        JButton uno = new JButton("1");
        uno.setFont(new Font("Arial", Font.PLAIN, 30));
        add(uno);
        JButton dos = new JButton("2");
        dos.setFont(new Font("Arial", Font.PLAIN, 30));
        add(dos);
        JButton tres = new JButton("3");
        tres.setFont(new Font("Arial", Font.PLAIN, 30));
        add(tres);
        JButton cuatro = new JButton("4");
        cuatro.setFont(new Font("Arial", Font.PLAIN, 30));
        add(cuatro);
        JButton cinco = new JButton("5");
        cinco.setFont(new Font("Arial", Font.PLAIN, 30));
        add(cinco);
        JButton seis = new JButton("6");
        seis.setFont(new Font("Arial", Font.PLAIN, 30));
        add(seis);
        JButton siete = new JButton("7");
        siete.setFont(new Font("Arial", Font.PLAIN, 30));
        add(siete);
        JButton ocho = new JButton("8");
        ocho.setFont(new Font("Arial", Font.PLAIN, 30));
        add(ocho);
        JButton nueve = new JButton("9");
        nueve.setFont(new Font("Arial", Font.PLAIN, 30));
        add(nueve);
        JButton igual = new JButton("=");
        igual.setFont(new Font("Arial", Font.PLAIN, 30));
        add(igual);
        
        // Declarar y configurar el JTextField
        pantalla = new JTextField(20);
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(JTextField.RIGHT); // Alinear a la derecha
        pantalla.setFont(new Font("Arial", Font.PLAIN, 20)); // Cambiar el tipo y tamaño de fuente
        pantalla.setText(""); // Mostrar el valor inicial en la pantalla


        // Añadir los componentes a la ventana
        JPanel panelBotones = new JPanel(new GridLayout(4, 4));
        panelBotones.add(siete);
        panelBotones.add(ocho);
        panelBotones.add(nueve);
        panelBotones.add(division);
        panelBotones.add(cuatro);
        panelBotones.add(cinco);
        panelBotones.add(seis);
        panelBotones.add(multiplicacion);
        panelBotones.add(uno);
        panelBotones.add(dos);
        panelBotones.add(tres);
        panelBotones.add(resta);
        panelBotones.add(cero);
        panelBotones.add(clear);
        panelBotones.add(suma);
        panelBotones.add(igual);

        //tamaño a los botones
        suma.setPreferredSize(new Dimension(30, 30));
        resta.setPreferredSize(new Dimension(30, 30));
        multiplicacion.setPreferredSize(new Dimension(30, 30));
        division.setPreferredSize(new Dimension(30, 30));
        clear.setPreferredSize(new Dimension(30, 30));
        cero.setPreferredSize(new Dimension(30, 30));
        uno.setPreferredSize(new Dimension(30, 30));
        dos.setPreferredSize(new Dimension(30, 30));
        tres.setPreferredSize(new Dimension(30, 30));
        cuatro.setPreferredSize(new Dimension(30, 30));
        cinco.setPreferredSize(new Dimension(30, 30));
        seis.setPreferredSize(new Dimension(30, 30));
        siete.setPreferredSize(new Dimension(30, 30));
        ocho.setPreferredSize(new Dimension(30, 30));
        nueve.setPreferredSize(new Dimension(30, 30));

        // Agregar ActionListeners a los botones
        suma.addActionListener(e -> pantalla.setText("+"));
        resta.addActionListener(e -> pantalla.setText("-"));
        multiplicacion.addActionListener(e -> pantalla.setText("*"));
        division.addActionListener(e -> pantalla.setText("/"));
        clear.addActionListener(e -> pantalla.setText(""));
        cero.addActionListener(e -> pantalla.setText(pantalla.getText() + "0"));
        uno.addActionListener(e -> pantalla.setText(pantalla.getText() + "1"));
        dos.addActionListener(e -> pantalla.setText(pantalla.getText() + "2"));
        tres.addActionListener(e -> pantalla.setText(pantalla.getText() + "3"));
        cuatro.addActionListener(e -> pantalla.setText(pantalla.getText() + "4"));
        cinco.addActionListener(e -> pantalla.setText(pantalla.getText() + "5"));
        seis.addActionListener(e -> pantalla.setText(pantalla.getText() + "6"));
        siete.addActionListener(e -> pantalla.setText(pantalla.getText() + "7"));
        ocho.addActionListener(e -> pantalla.setText(pantalla.getText() + "8"));
        nueve.addActionListener(e -> pantalla.setText(pantalla.getText() + "9"));

        // Añadir el JTextField y el panel de botones a la ventana
        add(pantalla, BorderLayout.NORTH);
        add(panelBotones);

        // Hacer visible la ventana
        setVisible(true);
    }
}
