
package proyectolabipc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class ventanaDoctor extends JFrame implements ActionListener {

    
    
    
    
    public ventanaDoctor() {
    
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        JPanel pest1 = new JPanel(null);
        JPanel pest2 = new JPanel(null);
        
        tabbedPane.addTab("Solicitar cita", pest1);
        tabbedPane.addTab("Ver Estado Cita", pest2);
        
       
        
        
        getContentPane().add(tabbedPane);
        this.setBounds(650,400,750,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        
        JPanel panelPrincipal = new JPanel(new GridLayout(0, 1));
        panelPrincipal.setBounds(25, 80, 650, 300);
        panelPrincipal.setBackground(Color.BLUE);
        
        for (int i = 0; i < ProyectoLabIPC.listaCitas.size(); i++) {
         JPanel panelCita = new JPanel();
         panelCita.setSize(640,50);
         panelCita.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
         panelCita.setBackground(Color.red);
          
            JLabel labelNombre = new JLabel(ProyectoLabIPC.listaCitas.get(i).getPacienteNombre());
            JLabel labelHora = new JLabel(ProyectoLabIPC.listaCitas.get(i).getHora());
            JLabel labelFecha = new JLabel(ProyectoLabIPC.listaCitas.get(i).getFecha());
            
            panelCita.add(labelNombre, BorderLayout.WEST);
            panelCita.add(labelHora, BorderLayout.CENTER);
            panelCita.add(labelFecha, BorderLayout.EAST);

            panelPrincipal.add(panelCita);

            
            
        }

        JScrollPane ScrollPane = new JScrollPane(panelPrincipal);
        ScrollPane.setBounds(25, 80, 600, 300);
        pest1.add(ScrollPane);
        
        

        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
}
