/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectolabipc;

/**
 *
 * @author carlo
 */

 import java.util.ArrayList;

 

public class ProyectoLabIPC {

    public static ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public static ArrayList<Doctor> listaDoctores = new ArrayList<>();
    public static ArrayList<Producto> listaProductos = new ArrayList<>();
    public static int codigo = 202300001;
    public static int codigo2 = 1;
    public static int idInput;

    public static void main(String[] args) {
       
        InicioSesion ventana = new InicioSesion();
        
        //Agregar pacientes a la lista
        listaPacientes.add(new Paciente(202300001, "Pedro", "Picapierda", "123", "Masculino",43));
        listaDoctores.add(new Doctor(2, "María", "Gómez", "Medico", "23242525", "Masculino", 43, "123"));
        listaProductos.add(new Producto(1, "Cataflan", 4, "Medicamento para el dolor", "Q.500.00"));
  

    }

    public static Object[][] convertirDatosPacientes_tabla() {
        // Crear el arreglo bidimensional de objetos
        int filas = listaPacientes.size();
        Object[][] arreglo = new Object[filas][6];

        for (int i = 0; i < filas; i++) {
            Paciente paciente = listaPacientes.get(i);
            arreglo[i][0] = paciente.getCodigo();
            arreglo[i][1] = paciente.getNombre();
            arreglo[i][2] = paciente.getApellido();
            arreglo[i][3] = paciente.getPassword();
            arreglo[i][4] = paciente.getGenero();
            arreglo[i][5] = paciente.getEdad();
        }

        return arreglo;
    }
   
    public static void Agregar_paciente(int codigo, String nombre, String apellido, String password, String genero, int edad) {
        Paciente new_date = new Paciente(codigo, nombre, apellido, password, genero, edad);
        listaPacientes.add(new_date);
    }
    
    public static Object[][] convertirDatosDoctores_tabla() {
        // Crear el arreglo bidimensional de objetos
        int filas = listaDoctores.size();
        Object[][] arreglo = new Object[filas][8];

        for (int i = 0; i < filas; i++) {
            Doctor doctor = listaDoctores.get(i);
            arreglo[i][0] = doctor.getCodigo();
            arreglo[i][1] = doctor.getNombre();
            arreglo[i][2] = doctor.getApellido();
            arreglo[i][3] = doctor.getEspecialidad();
            arreglo[i][4] = doctor.getTelefono();
            arreglo[i][5] = doctor.getGenero();
            arreglo[i][6] = doctor.getEdad();
            arreglo[i][7] = doctor.getPassword();
        }

        return arreglo;
    }
    
     public static void Agregar_doctor(int codigo, String nombre, String apellido, String especialidad,String telefono, String genero, int edad, String password) {
        Doctor new_date = new Doctor(codigo, nombre, apellido, especialidad, telefono, genero, edad, password);
        listaDoctores.add(new_date);
    }

     
     public static Object[][] convertirDatosProductos_tabla() {
        // Crear el arreglo bidimensional de objetos
        int filas = listaProductos.size();
        Object[][] arreglo = new Object[filas][5];

        for (int i = 0; i < filas; i++) {
            Producto producto = listaProductos.get(i);
            arreglo[i][0] = producto.getCodigo();
            arreglo[i][1] = producto.getNombre();
            arreglo[i][2] = producto.getCantidad();
            arreglo[i][3] = producto.getDescripcion();
            arreglo[i][4] = producto.getPrecio();
        }

        return arreglo;
    }
    
     public static void Agregar_producto(int codigo, String nombre, int cantidad, String descripcion,String precio) {
        Producto new_date = new Producto(codigo, nombre, cantidad, descripcion, precio);
        listaProductos.add(new_date);
    }    
     
  public static void Eliminar_paciente(int codigo){
     
}   

}