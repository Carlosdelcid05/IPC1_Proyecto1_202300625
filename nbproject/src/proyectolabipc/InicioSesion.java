package proyectolabipc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static proyectolabipc.ProyectoLabIPC.listaPacientes;
import static proyectolabipc.ProyectoLabIPC.listaDoctores;

public final class InicioSesion extends JFrame implements ActionListener {

    private JTextField codigoField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;

    
    public InicioSesion() {
        initComponents();
    }

    public void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(null); // Usando layout absoluto
        panel.setBackground(Color.WHITE);
        this.add(panel);

        JLabel titulo = new JLabel("Iniciar sesión");
        titulo.setBounds(200, 30, 200, 200);
        titulo.setFont(new Font("MV Boli", Font.PLAIN, 20));
        panel.add(titulo);

        ImageIcon icono = new ImageIcon(getClass().getResource("img/usuario.png"));
        Image imageDimension = icono.getImage().getScaledInstance(120, 110, Image.SCALE_SMOOTH);
        ImageIcon adjustarImagen = new ImageIcon(imageDimension);
        JLabel imageLabel = new JLabel(adjustarImagen);
        imageLabel.setBounds(190, 10, 120, 110);
        panel.add(imageLabel);

        JLabel codigoLabel = new JLabel("Codigo");
        codigoLabel.setBounds(70, 140, 80, 25);
        panel.add(codigoLabel);

        codigoField = new JTextField();
        codigoField.setBounds(130, 140, 260, 25);
        panel.add(codigoField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(50, 180, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 180, 260, 25);
        panel.add(passwordField);

        loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(80, 220, 150, 25);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(0x0094ff));
        loginButton.addActionListener(this);
        panel.add(loginButton);
        
        
        
        registerButton = new JButton("¿No tienes cuenta? Regístrate");
        registerButton.setBounds(250, 220, 250, 25);
        registerButton.setBackground(Color.WHITE);
        registerButton.addActionListener(this);
        registerButton.setForeground(new Color(0x0094ff));
        registerButton.setBorder(null);
        panel.add(registerButton);

        this.setTitle("Iniciar Sesión");
        this.setSize(500, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

  private boolean ingresoPaciente(String username, String password){
        int j = listaPacientes.size();
        boolean existe = false;
        for (int i = 0; i < j; i++ ){ 
        if(ProyectoLabIPC.listaPacientes.get(i).getCodigo()  == Integer.parseInt(username) && ProyectoLabIPC.listaPacientes.get(i).getPassword().equals(password) ){
            existe = true;
            

            
            System.out.print("El usuario sí existe");
            
        } else {System.out.print("El usuario no existe");}
    }  
        return existe;
  }
  
  private boolean ingresoDoctor(String username, String password){
      int j = listaDoctores.size();
      boolean existe = false;
        for (int i = 0; i < j; i++ ){
        if(ProyectoLabIPC.listaDoctores.get(i).getCodigo()  == Integer.parseInt(username) && ProyectoLabIPC.listaDoctores.get(i).getPassword().equals(password) ){
            existe = true;
            System.out.print("El usuario sí existe");
        }else {System.out.print("El usuario no existe");}
            
    }  
        return existe;
  }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getActionCommand().equals("Iniciar Sesión")) {
            String username = codigoField.getText();
            var password = passwordField.getPassword();
            String pwd = new String(password);
            
            ingresoPaciente(username, pwd);
            ingresoDoctor(username, pwd);
            
            System.out.println("Usuario: " + username);
            System.out.println("Contraseña: " + pwd);

            if (username.equals("123") && pwd.equals("123")) {
                ventanaAdmin vtn_Admin = new ventanaAdmin();
                this.dispose();
                } else if (ingresoPaciente(username, pwd)) {
                   System.out.println("Ha ingresado un Paciente");
                    ProyectoLabIPC.codigoSesion = Integer.parseInt(username);
                    ProyectoLabIPC.passwordSesion = pwd;
                    System.out.println(ProyectoLabIPC.passwordSesion);

                    ventanaPaciente vtnPaciente = new ventanaPaciente();
                   
            this.dispose();
                   
                } else if (ingresoDoctor(username, pwd)) {
                    System.out.println("Ha ingresado un Doctor");
                } else {
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos.", "Error en el inicio de sesión",   JOptionPane.ERROR_MESSAGE);
                }

        if (e.getActionCommand().equals("¿No tienes cuenta? Regístrate")) {
            Register ventana1 = new Register(); 
            this.dispose();
            System.out.println("Abrir ventana de registro");
        }
    }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InicioSesion());
        
        
    }
}



