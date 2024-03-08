package proyectolabipc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class ventanaAdmin extends JFrame implements ActionListener {
    
    JButton btnRegistro, btn_actualizar, btn_eliminar;
    JTable table_paciente;
    
    JButton btnRegistro2, btn_actualizar2, btn_eliminar2;
    JTable table_Doctor;
    
    JButton btnRegistro3, btn_actualizar3, btn_eliminar3;
    JTable table_producto;
    
    
    public ventanaAdmin() {
    
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        
        JPanel pest1 = new JPanel(null); 
        JPanel pest2 = new JPanel(null);
        JPanel pest3 = new JPanel(null);
        
        tabbedPane.addTab("Pacientes", pest1);
        tabbedPane.addTab("Doctores", pest2);
        tabbedPane.addTab("Productos", pest3);
        
        btnRegistro = new JButton("Crear");
        btnRegistro.setBounds(800,25,100,30);
        btnRegistro.setVisible(true);
        btnRegistro.setEnabled(true);
        btnRegistro.addActionListener(this);
        btnRegistro.setForeground(Color.WHITE);
        btnRegistro.setBackground(new Color(0x0094ff));
        btnRegistro.setBorder(null);
        pest1.add(btnRegistro);
        
        btn_actualizar = new JButton("Actualizar");
        btn_actualizar.setBounds(800,70,100,30);
        btn_actualizar.setVisible(true);
        btn_actualizar.addActionListener(this);
        btn_actualizar.setForeground(Color.WHITE);
        btn_actualizar.setBackground(new Color(0x0094ff));
        btn_actualizar.setBorder(null);
        pest1.add(btn_actualizar);
        
        btn_eliminar = new JButton("Eliminar");
        btn_eliminar.setBounds(800,115,100,30);
        btn_eliminar.setVisible(true);
        btn_eliminar.addActionListener(this);
        btn_eliminar.setForeground(Color.WHITE);
        btn_eliminar.setBackground(new Color(0x0094ff));
        btn_eliminar.setBorder(null);
        pest1.add(btn_eliminar);
        
        String[] columnNames = {"Codigo", "Nombre", "Apellido","Password", "Genero"}; 
        
        table_paciente = new JTable(ProyectoLabIPC.convertirDatosPacientes_tabla(),columnNames);
        
        JScrollPane scrollPane = new JScrollPane(table_paciente);
        scrollPane.setBounds(25, 80, 750, 570);
        pest1.add(scrollPane);
                
        JLabel lbl4 = new JLabel("Listado pacientes");
        lbl4.setBounds(25, 25, 750, 50);
        lbl4.setBackground(new Color(0x0094ff));
        lbl4.setOpaque(true);
        lbl4.setForeground(Color.WHITE);
        lbl4.setVisible(true);
        pest1.add(lbl4, BorderLayout.WEST);
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        ArrayList<Doctor> lista_ordenada = ProyectoLabIPC.bubblesortEdadDoctores(); 
        
        for(int i = 0; i < Math.min(8,lista_ordenada.size()) ; i++){
            datos.setValue(lista_ordenada.get(i).getEdad(), "Doctores Hospital", lista_ordenada.get(i).getEspecialidad());
        }
       
        
        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
            "Top 8 Doctores más jovenes",
            "Especialidades",
            "Edad",
            datos,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
            
        );
        
        ChartPanel cPanel = new ChartPanel(grafico_barras);
        cPanel.setMouseWheelEnabled(true);
        // Asignamos la posición y las dimensiones de nuestro ChartPanel
        cPanel.setBounds(800, 160, 300, 300);
        // Agregamos a nuestra pestaña el ChartPanel con nuestro gráfico
        pest2.add(cPanel);
        
        DefaultCategoryDataset datosProd = new DefaultCategoryDataset();
        ArrayList<Producto> lista_ordenadaPRo = ProyectoLabIPC.bubblesortCantidadProducto(); 
        
        for(int i = 0; i < Math.min(8,lista_ordenadaPRo.size()) ; i++){
            datosProd.setValue(lista_ordenadaPRo.get(i).getCantidad(), "Productos hospital", lista_ordenadaPRo.get(i).getNombre());
        }
       
        
        JFreeChart grafico_barrasPro = ChartFactory.createBarChart3D(
            "Top 8 cantidad de producto",
            "Nombre",
            "Cantidad",
            datosProd,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
            
        );
        
        ChartPanel cPanePro = new ChartPanel(grafico_barrasPro);
        cPanePro.setMouseWheelEnabled(true);
        // Asignamos la posición y las dimensiones de nuestro ChartPanel
        cPanePro.setBounds(800, 160, 300, 300);
        // Agregamos a nuestra pestaña el ChartPanel con nuestro gráfico
        pest3.add(cPanePro);
        
        //Pestaña 2
        
        btnRegistro2 = new JButton("Crear");
        btnRegistro2.setBounds(800,25,100,30);
        btnRegistro2.setVisible(true);
        btnRegistro2.setEnabled(true);
        btnRegistro2.addActionListener(this);
        btnRegistro2.setForeground(Color.WHITE);
        btnRegistro2.setBackground(new Color(0x0094ff));
        btnRegistro2.setBorder(null);
        pest2.add(btnRegistro2);
        
        
        btn_actualizar2 = new JButton("Actualizar");
        btn_actualizar2.setBounds(800,70,100,30);
        btn_actualizar2.setVisible(true);
        btn_actualizar2.addActionListener(this);
        btn_actualizar2.setForeground(Color.WHITE);
        btn_actualizar2.setBackground(new Color(0x0094ff));
        btn_actualizar2.setBorder(null);
        pest2.add(btn_actualizar2);
        
        btn_eliminar2 = new JButton("Eliminar");
        btn_eliminar2.setBounds(800,115,100,30);
        btn_eliminar2.setVisible(true);
        btn_eliminar2.addActionListener(this);
        btn_eliminar2.setForeground(Color.WHITE);
        btn_eliminar2.setBackground(new Color(0x0094ff));
        btn_eliminar2.setBorder(null);
        pest2.add(btn_eliminar2);
        
        String[] columnNames2 = {"Codigo", "Nombre", "Apellido", "Genero","Especialidad", "Telefono","Edad"}; 
        
        
        
        JLabel lbl5 = new JLabel("Listado Doctores");
        lbl5.setBounds(25, 25, 750, 50);
        lbl5.setBounds(25, 25, 750, 50);
        lbl5.setBackground(new Color(0x0094ff));
        lbl5.setOpaque(true);
        lbl5.setForeground(Color.WHITE);
        lbl5.setVisible(true);
        pest2.add(lbl5);
        
        table_Doctor = new JTable(ProyectoLabIPC.convertirDatosDoctores_tabla(),columnNames2);
        
        JScrollPane scrollPanes2 = new JScrollPane(table_Doctor);
        scrollPanes2.setBounds(25, 80, 750, 570);
        pest2.add(scrollPanes2);
        
        //Penstaña 3

        btnRegistro3 = new JButton("Crear");
        btnRegistro3.setBounds(800,25,100,30);
        btnRegistro3.setVisible(true);
        btnRegistro3.setEnabled(true);
        btnRegistro3.addActionListener(this);
        btnRegistro3.setForeground(Color.WHITE);
        btnRegistro3.setBackground(new Color(0x0094ff));
        btnRegistro3.setBorder(null);
        pest3.add(btnRegistro3);
        
        btn_actualizar3 = new JButton("Actualizar");
        btn_actualizar3.setBounds(800,70,100,30);
        btn_actualizar3.setVisible(true);
        btn_actualizar3.addActionListener(this);
        btn_actualizar3.setForeground(Color.WHITE);
        btn_actualizar3.setBackground(new Color(0x0094ff));
        btn_actualizar3.setBorder(null);
        pest3.add(btn_actualizar3);
        
        btn_eliminar3 = new JButton("Eliminar");
        btn_eliminar3.setBounds(800,115,100,30);
        btn_eliminar3.setVisible(true);
        btn_eliminar3.addActionListener(this);
        btn_eliminar3.setForeground(Color.WHITE);
        btn_eliminar3.setBackground(new Color(0x0094ff));
        btn_eliminar3.setBorder(null);
        pest3.add(btn_eliminar3);
        
        String[] columnNames3 = {"Codigo", "Nombre", "cantidad","Descipcion", "Precio"}; 
        
        table_producto = new JTable(ProyectoLabIPC.convertirDatosProductos_tabla(),columnNames3);
        
        JScrollPane scrollPane3 = new JScrollPane(table_producto);
        scrollPane3.setBounds(25, 80, 750, 570);
        pest3.add(scrollPane3);
                
        JLabel lbl6 = new JLabel("Listado Oficial");
        lbl6.setBounds(25, 25, 750, 50);
        lbl6.setBackground(new Color(0x0094ff));
        lbl6.setOpaque(true);
        lbl6.setForeground(Color.WHITE);
        lbl6.setVisible(true);
        pest3.add(lbl6);
        
        
       
        
       

        getContentPane().add(tabbedPane);
        this.setSize(1200,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        this.setBackground(Color.WHITE);
        
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        if (e.getSource() == btnRegistro) {
            CrearPaciente vtn_Registro = new CrearPaciente();
            this.dispose();
        }
        
        if(e.getSource()== btn_actualizar){
        ProyectoLabIPC.idInput = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario: ")); 
        ActualizarPaciente vtn_actualizar = new ActualizarPaciente();
            this.dispose();
            
        }
        
        if(e.getSource() == btn_eliminar){
            ProyectoLabIPC.idInput = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario: ")); 
            
            for(int i = 0; i < ProyectoLabIPC.listaPacientes.size() ; i++){
                
                if (ProyectoLabIPC.listaPacientes.get(i).getCodigo()  == ProyectoLabIPC.idInput){
                    ProyectoLabIPC.listaPacientes.remove(i);
                }
            }
            this.dispose();

            ventanaAdmin nuevaVentana = new ventanaAdmin();
            nuevaVentana.setVisible(true);
        }
        
        if (e.getSource() == btnRegistro2) {
            RegistroDoctor vtn_Registro2 = new RegistroDoctor();
            this.dispose();
        }
        
        if(e.getSource()== btn_actualizar2){
        ProyectoLabIPC.idInput = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario: ")); 
        ActualizarDoctor vtn_actualizar2 = new ActualizarDoctor();
            this.dispose();
            
        }
        
        if(e.getSource() == btn_eliminar2){
            ProyectoLabIPC.idInput = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario: ")); 
            
            for(int i = 0; i < ProyectoLabIPC.listaDoctores.size() ; i++){
                
                if (ProyectoLabIPC.listaDoctores.get(i).getCodigo()  == ProyectoLabIPC.idInput){
                   
                    ProyectoLabIPC.listaDoctores.remove(i);
                }
            }
            this.dispose();

            ventanaAdmin nuevaVentana = new ventanaAdmin();
            nuevaVentana.setVisible(true);
        }
        
        if (e.getSource() == btnRegistro3) {
            RegistroProducto vtn_Registro3 = new RegistroProducto();
            this.dispose();
        }
        
        if(e.getSource()== btn_actualizar3){
        //InicioSesion vtn2 = new InicioSesion();
        ProyectoLabIPC.idInput = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario: ")); 
        ActualizarProducto vtn_actualizar3 = new ActualizarProducto();
            this.dispose();
        }
        
        if(e.getSource() == btn_eliminar3){
            
            ProyectoLabIPC.idInput = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario: ")); 
            
            for(int i = 0; i < ProyectoLabIPC.listaProductos.size() ; i++){
                
                if (ProyectoLabIPC.listaProductos.get(i).getCodigo()  == ProyectoLabIPC.idInput){
                    ProyectoLabIPC.listaProductos.remove(i);
                }
            }
            this.dispose();

            ventanaAdmin nuevaVentana = new ventanaAdmin();
            nuevaVentana.setVisible(true);
            
        }
    
    
    }
}
