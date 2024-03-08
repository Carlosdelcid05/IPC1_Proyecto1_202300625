package proyectolabipc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class ventanaPaciente extends JFrame implements ActionListener {
    
    JButton btnGenerarCita, btn_MostrarDoctor, btn_MostrarHorario, btnEditarPerfil;
    JTextField motivoField;
    JPanel pest1;
    JComboBox<String> especialidadComboBox;
    JComboBox<String> doctorComboBox;
    JComboBox<String> fechaComboBox;
    JComboBox<String> horaComboBox;
    String[] doctor = new String[ProyectoLabIPC.listaDoctores.size()];
    String[] horario = new String[ProyectoLabIPC.listaHorarioCitas.size()];
    ArrayList<String> doctores = new ArrayList<>();
    ArrayList<String> horarios = new ArrayList<>();
    ArrayList<String> especialidadesUnicas = new ArrayList<>();
    ArrayList<String> fechas = new ArrayList<>();
    ArrayList<String> horas = new ArrayList<>();
    int[] codigoDoctor = new int[ProyectoLabIPC.listaDoctores.size()];
    
    
    JTable table_Doctor;
    
    
    private void evaluar(){
        doctores.clear();
        pest1.remove(doctorComboBox);
        for (int i = 0; i < ProyectoLabIPC.listaDoctores.size(); i++) {
        String doctorEnLista = ProyectoLabIPC.listaDoctores.get(i).getNombre();
        
        
        
        
        if (ProyectoLabIPC.listaDoctores.get(i).getEspecialidad().equals((String) especialidadComboBox.getSelectedItem())) {
            if (!doctores.contains(doctorEnLista)) {
                doctores.add(doctorEnLista);
                doctor = doctores.toArray(new String[0]);
                codigoDoctor[i] = ProyectoLabIPC.listaDoctores.get(i).getCodigo();
                
            }
        }
    }       
        doctorComboBox = new JComboBox<>(doctor);
        doctorComboBox.setBounds(130, 190, 175, 25);
        pest1.add(doctorComboBox);
    }
    
    private void evaluar2(){
        horarios.clear();
        pest1.remove(horaComboBox);
        for (int i = 0; i < ProyectoLabIPC.listaHorarioCitas.size(); i++) {
        String horarioEnLista = ProyectoLabIPC.listaHorarioCitas.get(i).getHora();

        if (ProyectoLabIPC.listaDoctores.get(i).getNombre().equals((String) horaComboBox.getSelectedItem()) && (codigoDoctor[i] == ProyectoLabIPC.listaDoctores.get(i).getCodigo())) {
            if (!horarios.contains(horarioEnLista)) {
                horarios.add(horarioEnLista);
                horario = horarios.toArray(new String[0]);
            }
        }
    }       
        horaComboBox = new JComboBox<>(horario);
        horaComboBox.setBounds(130, 190, 175, 25);
        pest1.add(horaComboBox);
    }
    
    
    
    public ventanaPaciente() {
    
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        
        pest1 = new JPanel(null); 
        JPanel pest2 = new JPanel(null);
        JPanel pest3 = new JPanel(null);
       
        tabbedPane.addTab("Solicitar cita", pest1);
        tabbedPane.addTab("Ver Estado Cita", pest2);
        tabbedPane.addTab("Farmacia", pest3);
        
        btnEditarPerfil = new JButton("Editar perfil");
        btnEditarPerfil.setBounds(550,20,180,50);
        btnEditarPerfil.setVisible(true);
        btnEditarPerfil.setEnabled(true);
        btnEditarPerfil.addActionListener(this);
        this.add(btnEditarPerfil);
        
        JLabel especialidadLabel = new JLabel("Especialidad");
        especialidadLabel.setBounds(70, 150, 80, 25);
        pest1.add(especialidadLabel);
        
        int n = ProyectoLabIPC.listaDoctores.size();
        

        for(int i = 0; i < n; i++) {
        String especialidadActual = ProyectoLabIPC.listaDoctores.get(i).getEspecialidad();

        if(!especialidadesUnicas.contains(especialidadActual)) {
        especialidadesUnicas.add(especialidadActual);
        }
        }
        String[] especialidad = especialidadesUnicas.toArray(new String[0]);
        especialidadComboBox = new JComboBox<>(especialidad);
        especialidadComboBox.setBounds(150, 150, 175, 25);
        pest1.add(especialidadComboBox);

        
        JLabel doctorLabel = new JLabel("Doctor");
        doctorLabel.setBounds(70, 190, 80, 25);
        pest1.add(doctorLabel);
        
        
        doctor = doctores.toArray(new String[0]);
        doctorComboBox = new JComboBox<>(doctor);
        doctorComboBox.setBounds(160, 190, 175, 25);
        pest1.add(doctorComboBox);
        evaluar();
        
        
        btnGenerarCita = new JButton("Generar cita");
        btnGenerarCita.setBounds(500,300,180,50);
        btnGenerarCita.setVisible(true);
        btnGenerarCita.setEnabled(true);
        btnGenerarCita.addActionListener(this);
        pest1.add(btnGenerarCita);
        
        btn_MostrarDoctor = new JButton("Mostrar doctor");
        btn_MostrarDoctor.setBounds(335,150,180,25);
        btn_MostrarDoctor.setVisible(true);
        btn_MostrarDoctor.addActionListener(this);
        pest1.add(btn_MostrarDoctor);
        
        btn_MostrarHorario = new JButton("Mostrar horario");
        btn_MostrarHorario.setBounds(335,190,180,25);
        btn_MostrarHorario.setVisible(true);
        btn_MostrarHorario.addActionListener(this);
        pest1.add(btn_MostrarHorario);
        
         JLabel motivoLabel = new JLabel("Motivo");
        motivoLabel.setBounds(70, 50, 50, 25);
        pest1.add(motivoLabel);
       
        motivoField = new JTextField();
        motivoField.setBounds(130, 50, 500, 90);
        pest1.add(motivoField);
        
         JLabel horarioLabel = new JLabel("Horarios");
        horarioLabel.setBounds(140, 230, 80, 20);
        pest1.add(horarioLabel);

        for(int i = 0; i < ProyectoLabIPC.listaCitas.size(); i++) {
        String horario = ProyectoLabIPC.listaCitas.get(i).getFecha();

        if(!fechas.contains(horario)) {
        fechas.add(horario);
        }
        }
        String[] horario = fechas.toArray(new String[0]);
        fechaComboBox = new JComboBox<>(horario);
        fechaComboBox.setBounds(150, 260, 175, 25);
        pest1.add(fechaComboBox);
        


        for(int i = 0; i < ProyectoLabIPC.listaCitas.size(); i++) {
        String horario2 = ProyectoLabIPC.listaCitas.get(i).getHora();

        if(!horas.contains(horario2)) {
        horas.add(horario2);
        }
        }
        String[] horario2 = {"00:00"};
        horaComboBox = new JComboBox<>(horario2);
        horaComboBox.setBounds(390, 260, 175, 25);
        pest1.add(horaComboBox);

        
        
        //Pestaña 2
      
        String[] columnNames2 = {"No", "Estado", "Fecha", "Hora"}; 
        
        
        
        JLabel lbl5 = new JLabel("Citas asignadas");
        lbl5.setBounds(25, 25, 750, 50);
        lbl5.setOpaque(true);
        lbl5.setVerticalAlignment(SwingConstants.CENTER);
        lbl5.setFont(new Font(lbl5.getFont().getFontName(), Font.BOLD, 24));
        lbl5.setVisible(true);
        pest2.add(lbl5);
        
        table_Doctor = new JTable(ProyectoLabIPC.convertirDatosCitas_tabla(),columnNames2);
        
        JScrollPane scrollPanes2 = new JScrollPane(table_Doctor);
        scrollPanes2.setBounds(25, 80, 500, 250);
        pest2.add(scrollPanes2);
        
        //Penstaña 3

       
 JPanel panelPrincipal = new JPanel(new GridLayout(0, 2));
        panelPrincipal.setBounds(25, 80, 650, 300);

        for (int i = 0; i < ProyectoLabIPC.listaProductos.size(); i++) {
            JPanel panelProducto = new JPanel(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.WEST;
            gbc.insets = new Insets(5, 5, 5, 5);

            JLabel labelNombre = new JLabel("Nombre: " + ProyectoLabIPC.listaProductos.get(i).getNombre());
            JLabel labelDescripcion = new JLabel("Descripción: " + ProyectoLabIPC.listaProductos.get(i).getDescripcion());
            JLabel labelPrecio = new JLabel("Precio: " + ProyectoLabIPC.listaProductos.get(i).getPrecio());

            Font font = new Font("MV Boli", Font.PLAIN, 12);
            Color colorTexto = Color.decode("#2e90e8");
            labelNombre.setFont(font);
            labelDescripcion.setFont(font);
            labelPrecio.setFont(font);
            labelNombre.setForeground(colorTexto);
            labelDescripcion.setForeground(colorTexto);
            labelPrecio.setForeground(colorTexto);

            panelProducto.add(labelNombre, gbc);
            gbc.gridy = 1;
            panelProducto.add(labelDescripcion, gbc);
            gbc.gridy = 2;
            panelProducto.add(labelPrecio, gbc);

            panelPrincipal.add(panelProducto);
        }

        JScrollPane ScrollPane = new JScrollPane(panelPrincipal);
        ScrollPane.setBounds(25, 80, 600, 300);
        pest3.add(ScrollPane);


       

        getContentPane().add(tabbedPane);
        this.setBounds(650,400,750,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        if (e.getSource() == btnGenerarCita) {
            String motivo = motivoField.getText();
            String fecha = (String) fechaComboBox.getSelectedItem();
            String hora = (String) horaComboBox.getSelectedItem();
            String paciente = "";
            
            for(int i = 0; i < ProyectoLabIPC.listaPacientes.size(); i++){
                if(ProyectoLabIPC.listaPacientes.get(i).getCodigo() == ProyectoLabIPC.codigoSesion){
                  paciente = ProyectoLabIPC.listaPacientes.get(i).getNombre();
                }
                
            }
            
            ProyectoLabIPC.Agregar_cita(motivo, 0, fecha, hora, paciente, motivo, ProyectoLabIPC.codigoSesion);
            
            
  
        }
        
        if(e.getSource()== btn_MostrarDoctor){

             
            evaluar();
            
        }
        
        if(e.getSource() == btn_MostrarHorario){
            evaluar2();
        }
        
        if (e.getSource() == btnEditarPerfil){
        
            ActualizarPerfil vtnEditar = new ActualizarPerfil();
        }
    
    }
}
