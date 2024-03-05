package proyectolabipc;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static proyectolabipc.ProyectoLabIPC.listaPacientes;


public class ActualizarPaciente extends JFrame implements ActionListener {
        
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField passField;
    private JTextField edadField;
    private JComboBox<String> genderComboBox;

    private JButton registerButton;
    
    public ActualizarPaciente() {
         initComponents();
    }
    
    private void initComponents() {
        JLabel titleLabel = new JLabel("Crear paciente");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(200, 10, 100, 30);
        this.add(titleLabel);

        JLabel firstNameLabel = new JLabel("Nombre:");
        firstNameLabel.setBounds(70, 50, 80, 25);
        this.add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(130, 50, 260, 25);
        this.add(firstNameField);

        JLabel lastNameLabel = new JLabel("Apellido:");
        lastNameLabel.setBounds(70, 90, 80, 25);
        this.add(lastNameLabel);

        lastNameField = new JTextField();
        lastNameField.setBounds(130, 90, 260, 25);
        this.add(lastNameField);

        JLabel passLabel = new JLabel("Contraseña:");
        passLabel.setBounds(70, 130, 80, 25);
        this.add(passLabel);

        passField = new JPasswordField();
        passField.setBounds(160, 130, 230, 25);
        this.add(passField);

        JLabel genderLabel = new JLabel("Género:");
        genderLabel.setBounds(70, 170, 80, 25);
        this.add(genderLabel);

        String[] genders = {"Masculino", "Femenino"};
        genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(130, 170, 175, 25);
        this.add(genderComboBox);
        
        
        JLabel edadLabel = new JLabel("Edad");
        edadLabel.setBounds(70, 200, 80, 25);
        this.add(edadLabel);

        edadField = new JTextField();
        edadField.setBounds(130, 200, 260, 25);
        this.add(edadField);
        
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
            String lastName = lastNameField.getText();
            String pass = passField.getText();
            int edad = Integer.parseInt(edadField.getText());
            String selectedGender = (String) genderComboBox.getSelectedItem();

            for(int i = 0; i < ProyectoLabIPC.listaPacientes.size() ; i++){
                
                if (ProyectoLabIPC.listaPacientes.get(i).getCodigo()  == ProyectoLabIPC.idInput){
                    ProyectoLabIPC.listaPacientes.remove(i);
                     Paciente new_date = new Paciente(ProyectoLabIPC.idInput, firstName, lastName, pass, selectedGender, edad);
        listaPacientes.add(new_date);
                    
                    
                }
            }
    
            this.dispose();
            
            ventanaAdmin vtn_admin= new ventanaAdmin();
        }
        
        
        
    } 

    
}