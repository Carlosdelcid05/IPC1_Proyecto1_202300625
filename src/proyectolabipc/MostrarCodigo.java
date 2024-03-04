/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolabipc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;



/**
 *
 * @author carlo
 */
public class MostrarCodigo extends JFrame implements ActionListener {
    
    private JButton aceptar;
    
    public MostrarCodigo() {
    
    initComponents();
    
}
    
    public void initComponents(){
    
    
        
        JPanel panel = new JPanel();
        panel.setLayout(null); 
        this.add(panel);
        
        JLabel titleLabel = new JLabel("Su codigo es: "+ ProyectoLabIPC.codigo);
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(100, 10, 200, 50);
        panel.add(titleLabel);
        
        JLabel titulo = new JLabel("");
        titulo.setBounds(150, 10, 50, 50);
        titulo.setFont(new Font("MV Boli", Font.PLAIN, 20));
        panel.add(titulo);
        
        aceptar = new JButton("Aceptar");
        aceptar.setBounds(100, 120, 150, 25);
        aceptar.setForeground(Color.WHITE);
        aceptar.setBackground(new Color(5, 193, 31));
        aceptar.addActionListener(this);
        panel.add(aceptar);
        
        this.setTitle("");
        this.setSize(400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        
}

    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource()== aceptar){
        InicioSesion vtn_aceptar = new InicioSesion();
        this.dispose();
        
        }
    
    }
    
}
