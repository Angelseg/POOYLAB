import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class _p141_CalcularAreaGUI extends JFrame implements ActionListener{
    JLabel lblBase, lblAltura, lblResultado;
    JTextField txtBase, txtAltura;
    JButton btnCalcular, btnSalir;

    public _p141_CalcularAreaGUI(){
        super("Calcular el Area de un triangulo");
        setLayout(null);
        lblBase = new JLabel("Base :"); lblBase.setBounds(10,20,200,30);add(lblBase);
        lblAltura = new JLabel("Altura :"); lblAltura.setBounds(10,50,200,30);add(lblAltura);
        txtBase = new JTextField(); txtBase.setBounds(80, 20, 200, 30);add(txtBase);
        txtAltura = new JTextField(); txtAltura.setBounds(80, 50 , 200 , 30);add(txtAltura);
        lblResultado = new JLabel("[Resultado Aqui]"); lblResultado.setBounds(90, 80, 200 , 30);add(lblResultado);
        btnCalcular = new JButton("Calcular"); btnCalcular.setBounds(30,110,100,40);add(btnCalcular);
        btnSalir = new JButton("Salir"); btnSalir.setBounds(150,110,100,40);add(btnSalir); 
        btnSalir.addActionListener(this);
        btnCalcular.addActionListener(this);
    }

    public float getArea (float base, float altura ){
        return (base * altura) / 2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==btnSalir){
            //JOptionPane.showMessageDialog(this, "Gracias, Ya me voy.",JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }else if(e.getSource()==btnCalcular){
            float base = Float.parseFloat(txtBase.getText());
            float altura = Float.parseFloat(txtAltura.getText());
            float area = getArea(base, altura);
            lblResultado.setText(String.format("%,.2f", area));
        }
        
    }
    public static void main(String[] args) {
        _p141_CalcularAreaGUI app = new _p141_CalcularAreaGUI();
        app.setBounds(10, 10, 300 ,200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}