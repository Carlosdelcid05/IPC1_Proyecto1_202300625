package proyectolabipc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectolabipc.Paciente.*;
import static proyectolabipc.ProyectoLabIPC.listaPacientes;

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

  public void contraPaciente(){
        
      int j = listaPacientes.size();
        for (int i = 0; i > j; i++ ){
            String username = codigoField.getText();
        if(ProyectoLabIPC.listaPacientes.get(i).getCodigo()  == Integer.parseInt(username)){
        }
            
    }  
  }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getActionCommand().equals("Iniciar Sesión")) {
            String username = codigoField.getText();
            char[] password = passwordField.getPassword();
            String pwd = new String(password);

            System.out.println("Usuario: " + username);
            System.out.println("Contraseña: " + pwd);

            if (username.equals("202300625") && pwd.equals("proyecto1IPC1")) {
               ventanaAdmin vtn_admin = new ventanaAdmin();
                this.dispose();
            } else {if(false) {
            
            }else {if(false) {
                
            } else{
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos.", "Error en el inicio de sesión", JOptionPane.ERROR_MESSAGE);
            }
        }}}

        if (e.getActionCommand().equals("¿No tienes cuenta? Regístrate")) {
            Register ventana1 = new Register(); 
            this.dispose();
            System.out.println("Abrir ventana de registro");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InicioSesion());
        
        
    }
}



