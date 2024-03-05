package proyectolabipc;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static proyectolabipc.ProyectoLabIPC.listaProductos;


public class ActualizarProducto extends JFrame implements ActionListener {
        
    private JTextField firstNameField;
    private JTextField cantidad;
    private JTextField descripcion;
    private JTextField precio;


    private JButton registerButton;
    
    public ActualizarProducto() {
         initComponents();
    }
    
    private void initComponents() {
        JLabel titleLabel = new JLabel("Actualizar producto");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(200, 10, 100, 100);
        this.add(titleLabel);

        JLabel firstNameLabel = new JLabel("Nombre:");
        firstNameLabel.setBounds(70, 50, 80, 25);
        this.add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(130, 50, 260, 25);
        this.add(firstNameField);

        JLabel cantidadLabel = new JLabel("Cantidad");
        cantidadLabel.setBounds(70, 90, 80, 25);
        this.add(cantidadLabel);

        cantidad = new JTextField();
        cantidad.setBounds(130, 90, 260, 25);
        this.add(cantidad);

        JLabel descripcionLabel = new JLabel("Descripcion:");
        descripcionLabel.setBounds(70, 130, 80, 25);
        this.add(descripcionLabel);

        descripcion = new JTextField();
        descripcion.setBounds(160, 130, 230, 25);
        this.add(descripcion);

        JLabel precioLabel = new JLabel("Precio:");
        precioLabel.setBounds(70, 170, 80, 25);
        this.add(precioLabel);
        
        precio = new JTextField();
        precio.setBounds(160, 170, 230, 25);
        this.add(precio);
        
        JLabel codigoLabel = new JLabel("Codigo:");
        codigoLabel.setBounds(70, 220, 80, 25);
        this.add(codigoLabel);
        
        JLabel codigo = new JLabel(String.valueOf(ProyectoLabIPC.idInput));
        codigo.setBounds(160, 220, 220, 25);
        this.add(codigo);


        registerButton = new JButton("Actualizar");
        registerButton.setBounds(180, 240, 150, 25);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(0x0094ff));
        registerButton.addActionListener(this);
        this.add(registerButton);

        this.setTitle("Actualizar");
        this.setBounds(650, 400, 500, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.WHITE);
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Actualizar")) {
            
            String firstName = firstNameField.getText();
            String precio1 = precio.getText();
            String descripcion1 = descripcion.getText();
            int cantidad1 = Integer.parseInt(cantidad.getText());

            for(int i = 0; i < ProyectoLabIPC.listaProductos.size() ; i++){
                
                if (ProyectoLabIPC.listaProductos.get(i).getCodigo()  == ProyectoLabIPC.idInput){
                    ProyectoLabIPC.listaProductos.remove(i);
                     Producto new_date = new Producto(ProyectoLabIPC.idInput, firstName, cantidad1, descripcion1, precio1);
                   listaProductos.add(new_date);
                    
                    
                }
            }
    
            this.dispose();
            
            ventanaAdmin vtn_admin= new ventanaAdmin();
        }
        
        
        
    } 

    
}