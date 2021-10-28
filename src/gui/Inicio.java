package gui;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame implements ActionListener {


    JLabel lbliniciar, lblregister;
    JTextField txtniniciar,txtnregister;
    JButton btniniciar,btnregister;

    public Inicio() {

        setLocationRelativeTo(this);
        ((JPanel)getContentPane()).setOpaque(false);
    
        setLayout(null);
        setTitle("Ecofriendly 1.0");
        setSize(570, 300);
        setLocationRelativeTo(this);
         setVisible(true);
      

         //cuadro de texto
         txtniniciar= new JTextField("");
         txtnregister= new JTextField("");
         
         //textos

         lbliniciar= new JLabel("Iniciar");
         lblregister= new JLabel("Register");

         //botones

         btniniciar= n
    }





   public void actionPerformed(ActionEvent e) {
        
        
}
}
