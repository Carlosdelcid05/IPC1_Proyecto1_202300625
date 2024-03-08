package proyectolabipc;

public class Doctor {
    private int codigo;
    private String nombre;
    private String apellido;
    private String password;
    private String genero;
    private String especialidad;
    private String telefono;
    private String[] hora;
    private int edad;

    public Doctor(int codigo, String nombre, String apellido, String genero,String especialidad, String telefono, int edad, String password, String[] hora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.especialidad = especialidad;
        this.telefono = telefono; 
        this.edad = edad; 
        this.password = password;
        this.hora = hora;
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

    
    public String getEspecialidad() {
        return especialidad;
    }

    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String getTelefono() {
        return telefono;
    }

    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
    
        public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHora() {
        return hora;
    }

    public void setHora(String[] hora) {
        this.hora = hora;
    }
    
    
    
}