import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiVentana extends JFrame {
    private JPanel panelMain;
    private JTextField txtNombre;
    private JButton btnClick;
    private JLabel Numero1;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton sumaButton;
    private JButton restaButton;
    private JButton multiplicacionButton;
    private JButton divisionButton;

    public MiVentana() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick, txtNombre.getText()+"Hola!");
            }
        });
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }
        });
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());
                double suma;
                suma = a + b;
                //String resultado = txtNum1.getText() + txtNum2.getText();
                JOptionPane.showMessageDialog(panelMain, suma);
            }
        });
        restaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());
                double resta;
                resta = a - b;

                JOptionPane.showMessageDialog(panelMain, resta);

            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());
                double division;
                division = a / b;

                JOptionPane.showMessageDialog(panelMain, division);

            }
        });
        multiplicacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double a = Double.parseDouble(txtNum1.getText());
                    double b = Double.parseDouble(txtNum2.getText());
                    double multiplicacion;
                    multiplicacion = a * b;

                    JOptionPane.showMessageDialog(panelMain, multiplicacion);

            }
        });
    }

    public static void main(String[] args) {
        MiVentana v = new MiVentana();
        v.setContentPane(v.panelMain);
        v.setTitle("Hola!");
        v.setSize(500,500);
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
