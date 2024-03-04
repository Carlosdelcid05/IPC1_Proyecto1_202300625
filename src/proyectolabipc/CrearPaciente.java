package proyectolabipc;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CrearPaciente extends JFrame implements ActionListener {
        
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField passField;
    private JTextField edadField;
    private JComboBox<String> genderComboBox;

    private JButton registerButton;
    
    public CrearPaciente() {
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

        registerButton = new JButton("Registrarse");
        registerButton.setBounds(180, 240, 150, 25);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(0x0094ff));
        registerButton.addActionListener(this);
        this.add(registerButton);

        this.setTitle("Registro");
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
        if (e.getActionCommand().equals("Registrarse")) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String pass = passField.getText();
            int edad = Integer.parseInt(edadField.getText());
            String selectedGender = (String) genderComboBox.getSelectedItem();
            
            ProyectoLabIPC.Agregar_paciente(ProyectoLabIPC.codigo, firstName, lastName, pass, selectedGender, edad);
            
            ProyectoLabIPC.codigo++;
            this.dispose();
            
            ventanaAdmin vtn_admin= new ventanaAdmin();
        }
        
        
        
    } 

    
}