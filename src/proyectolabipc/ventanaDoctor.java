
package proyectolabipc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableCellRenderer;


public class ventanaDoctor extends JFrame implements ActionListener {

    
    
    JTextField CitaHorario;
    JButton btnEditarPerfil;
    
    public ventanaDoctor() {
    
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        JPanel pest1 = new JPanel(null);
        JPanel pest2 = new JPanel(null);
        
        
        
        
        JButton btn_Asignar;
        
        
        tabbedPane.addTab("Cita", pest1);
        tabbedPane.addTab("Asignar horario", pest2);
        
       JTable table_horariocitas;
        
        
        
        
        
        JPanel panelPrincipal = new JPanel(new GridLayout(0, 1));
        panelPrincipal.setBounds(25, 80, 650, 300);

        
        for (int i = 0; i < ProyectoLabIPC.listaCitas.size(); i++) {
         JPanel panelCita = new JPanel();
         panelCita.setSize(640,50);
         panelCita.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));

         int indice = i; 

         
         if(ProyectoLabIPC.codigoSesion == ProyectoLabIPC.listaCitas.get(i).getDoctor() && ProyectoLabIPC.listaCitas.get(i).getEstado().equals("Pendiente")){
         
          
                JButton btnAceptar = new JButton("Aceptar ");
                JButton btnRechazar = new JButton("Rechazar ");
                JButton btnDetalles = new JButton("Ver más ");

                btnAceptar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ProyectoLabIPC.listaCitas.get(indice).setEstado("Aceptado");
                        getContentPane().repaint();
                    }
                });

                btnRechazar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                ProyectoLabIPC.listaCitas.get(indice).setEstado("Rechazado");
                getContentPane().repaint();
                    }
                });

                btnDetalles.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                   JOptionPane.showMessageDialog(getContentPane(), ProyectoLabIPC.listaCitas.get(indice).getMotivo(), "Más informacion",   JOptionPane.INFORMATION_MESSAGE);
                    }
                });
            
            btnAceptar.setBorder(null);
            btnAceptar.setBackground(new Color(0x0094ff));
            btnAceptar.setForeground(Color.WHITE);
            btnAceptar.setSize(100, 25);

            btnRechazar.setBorder(null);
            btnRechazar.setBackground(new Color(0x0094ff));
            btnRechazar.setForeground(Color.WHITE);
            btnRechazar.setSize(100, 25);

            btnDetalles.setBorder(null);
            btnDetalles.setBackground(new Color(0x0094ff));
            btnDetalles.setForeground(Color.WHITE);
            btnDetalles.setSize(100, 25);

            
            JLabel labelNombre = new JLabel(ProyectoLabIPC.listaCitas.get(i).getPacienteNombre());
            JLabel labelHora = new JLabel(ProyectoLabIPC.listaCitas.get(i).getHora());
            JLabel labelFecha = new JLabel(ProyectoLabIPC.listaCitas.get(i).getFecha());
            
            panelCita.add(labelNombre, BorderLayout.WEST);
            panelCita.add(labelHora, BorderLayout.CENTER);
            panelCita.add(labelFecha, BorderLayout.EAST);
            panelCita.add(btnDetalles, BorderLayout.EAST);
            panelCita.add(btnAceptar, BorderLayout.EAST);
            panelCita.add(btnRechazar, BorderLayout.EAST);
            
         }
            
            panelPrincipal.add(panelCita);

            
            
        }
        
       
        
        JScrollPane ScrollPane = new JScrollPane(panelPrincipal);
        ScrollPane.setBounds(25, 80, 600, 300);
        ScrollPane.setBackground(Color.WHITE);
        pest1.add(ScrollPane);
        
        JLabel horarioLabel = new JLabel("Horario de citas:");
        horarioLabel.setBounds(150, 400, 100, 250);
        horarioLabel.setFont(new Font("Kristen ITC",  Font.BOLD, 20));
        pest2.add(horarioLabel);
        
        
        
        
        CitaHorario = new JTextField();
        CitaHorario.setBounds(150, 400, 230, 25);
        pest2.add(CitaHorario);
        
        btn_Asignar = new JButton("Asignar");
        btn_Asignar.setBounds(25, 400, 100, 25);
        btn_Asignar.setBorder(null);
        btn_Asignar.setBackground(new Color(0x0094ff));
        btn_Asignar.setForeground(Color.WHITE);
        btn_Asignar.setVisible(true);
        btn_Asignar.setEnabled(true);
        btn_Asignar.addActionListener(this);
        pest2.add(btn_Asignar);
        
        
        JLabel lbl4 = new JLabel("Horario");
        lbl4.setBounds(25, 25, 600, 50);
        lbl4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        lbl4.setBackground(Color.LIGHT_GRAY);
        lbl4.setOpaque(true);
        lbl4.setVerticalAlignment(SwingConstants.CENTER);
        lbl4.setHorizontalAlignment(SwingConstants.CENTER);
        lbl4.setFont(new Font(lbl4.getFont().getFontName(), Font.BOLD, 25));
        lbl4.setVisible(true);
        pest2.add(lbl4);
        String[] columnNames = {"No.", "Horario de cita"};
        
        table_horariocitas = new JTable(ProyectoLabIPC.convertirHorarioDoc_tabla(), columnNames);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < table_horariocitas.getColumnCount(); i++) {
            table_horariocitas.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
        table_horariocitas.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
         
        
        JScrollPane scrollPane = new JScrollPane(table_horariocitas);
        scrollPane.setBounds(25, 100, 600, 250);

        pest2.add(scrollPane);
        
        btnEditarPerfil = new JButton("Editar perfil");
        btnEditarPerfil.setBounds(550,20,180,50);
        btnEditarPerfil.setVisible(true);
        btnEditarPerfil.setEnabled(true);
        btnEditarPerfil.addActionListener(this);
        this.add(btnEditarPerfil);
        
        this.add(tabbedPane);
        this.setBounds(650,400,750,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
 
        
        if (e.getActionCommand().equals("Asignar")) {
            String Horario = CitaHorario.getText();
            int doctor = 0;
            for(int i = 0; i < ProyectoLabIPC.listaDoctores.size(); i++){
                if(ProyectoLabIPC.listaDoctores.get(i).getCodigo() == ProyectoLabIPC.codigoSesion){
                    doctor = ProyectoLabIPC.listaDoctores.get(i).getCodigo();
                    }
            }
            ProyectoLabIPC.Agregar_horarios(ProyectoLabIPC.Numero, Horario,doctor);
            ProyectoLabIPC.Numero++;            
            this.repaint();
            
            
         
    }
        
        if (e.getActionCommand().equals("Editar perfil")){
        
            EditarPerfil2 vtnEditar = new EditarPerfil2();
            this.dispose();
            System.out.println("EDITAR PERFIL");
        }
    }
    
    
    
    
    
    }

