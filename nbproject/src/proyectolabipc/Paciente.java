package proyectolabipc;

public class Paciente {
    private int codigo;
    private String nombre;
    private String apellido;
    private String password;
    private String genero;
    private int edad;

    public Paciente(int codigo, String nombre, String apellido, String password, String genero, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.genero = genero;
        this.edad = edad; 
        
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }

   
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

  
    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}