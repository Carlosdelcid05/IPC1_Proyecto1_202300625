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
    public static ArrayList<Cita> listaCitas = new ArrayList<>();
    public static ArrayList<Horario> listaHorarioCitas = new ArrayList<>();
    public static int codigo = 202300001;
    public static int codigo2 = 1;
    public static int idInput;
    public static int no;
    public static int codigoSesion;
    public static int Numero = 0;

    public static void main(String[] args) {
       
        InicioSesion ventana = new InicioSesion();
        
        
        //Agregar pacientes a la lista
        String[] hora = {"01:00","09:00","14:00"};
        
        listaPacientes.add(new Paciente(202300001, "Pedro", "Picapierda", "123", "Masculino",43));
        listaPacientes.add(new Paciente(202300006, "Juan", "Picapierda", "123", "Masculino",43));
        listaPacientes.add(new Paciente(202300007, "Paco", "Picapierda", "123", "Masculino",43));
        listaPacientes.add(new Paciente(202300008, "María", "Martínez", "456", "Femenino", 35));
        listaPacientes.add(new Paciente(202300009, "Laura", "Gutiérrez", "789", "Femenino", 28));
        listaPacientes.add(new Paciente(202300010, "Ana", "López", "101", "Femenino", 40));
        listaPacientes.add(new Paciente(202300011, "Sofía", "Hernández", "112", "Femenino", 55));

        listaDoctores.add(new Doctor(202300002, "María", "Gómez", "Masculino", "Medico", "2131892", 43, "123", hora));
        listaDoctores.add(new Doctor(202300003, "Pancho", "Gómez", "Masculino", "Pediatra", "31242442", 43, "123",hora));
        listaDoctores.add(new Doctor(202300004, "Pepito", "Gómez", "Masculino", "Doctor", "31242442", 43, "123",hora));
        listaDoctores.add(new Doctor(202300005, "Juan", "Gómez", "Masculino", "Medico", "31242442", 43, "123", hora));
        listaDoctores.add(new Doctor(202300006, "Carlos", "Rodríguez", "Masculino", "Oftalmólogo", "555-1234", 50, "456", hora));
        listaDoctores.add(new Doctor(202300007, "Luisa", "Gómez", "Femenino", "Dermatóloga", "555-5678", 45, "789", hora));
        listaDoctores.add(new Doctor(202300008, "Andrés", "Martínez", "Masculino", "Psiquiatra", "555-9101", 60, "101", hora));

     
       
        listaCitas.add(new Cita("Me siento enfermo jajaja",202300002 ,"22/03/2024", "00:00", "Pancho", "Pediente",202300001));
        listaCitas.add(new Cita("Me duele la cabeza Dxdx",202300002,"13/05/2024", "01:00", "Pancho", "Pendiente",202300001));      
        listaCitas.add(new Cita("Me siento enfermo jajaja",202300002 ,"51/05/2024", "01:00", "Pancho", "Pendiente",202300001));  
        listaCitas.add(new Cita("Me siento enfermo jajaja",202300002 ,"65/05/2024", "01:00", "Pancho", "Pendiente",202300001));  
        
        listaHorarioCitas.add(new Horario(1,"00:10",202300002));
        listaHorarioCitas.add(new Horario(1,"00:20",202300002));
        listaHorarioCitas.add(new Horario(1,"00:30",202300002));
        listaHorarioCitas.add(new Horario(1,"00:40",202300002));
        listaHorarioCitas.add(new Horario(1,"00:00",202300003));
        listaHorarioCitas.add(new Horario(1,"00:00",202300004));
        listaHorarioCitas.add(new Horario(1,"00:00",202300005));
        
        listaProductos.add(new Producto(2, "Paracetamol", 5, "Analgesico y antipiretico", "Q.50.00"));
        listaProductos.add(new Producto(3, "Amoxicilina", 8, "Antibiótico", "Q.80.00"));
        listaProductos.add(new Producto(4, "Ibuprofeno", 7, "Antiinflamatorio y analgésico", "Q.60.00"));
        listaProductos.add(new Producto(5, "Omeprazol", 6, "Antiácido y antiulceroso", "Q.70.00"));
        listaProductos.add(new Producto(6, "Loratadina", 9, "Antihistamínico", "Q.45.00"));
        listaProductos.add(new Producto(7, "Salbutamol", 4, "Broncodilatador", "Q.55.00"));
        listaProductos.add(new Producto(8, "Hidroclorotiazida", 10, "Diurético", "Q.65.00"));
        listaProductos.add(new Producto(9, "Simvastatina", 12, "Hipolipemiante", "Q.75.00"));
           listaProductos.add(new Producto(1, "Cataflan", 4, "Medicamento para el dolor", "Q.500.00"));
    }

    
    public static Object[][] convertirDatosCitas_tabla() {
        // Crear el arreglo bidimensional de objetos
        int filas = listaCitas.size();
        Object[][] arreglo = new Object[filas][4];

        for (int i = 0; i < filas; i++) {
            if (codigoSesion == listaCitas.get(i).getPaciente()){
            Cita cita = listaCitas.get(i);
            arreglo[i][0] = i +1;
            arreglo[i][1] = cita.getEstado();
            arreglo[i][2] = cita.getFecha();
            arreglo[i][3] = cita.getHora();
            
        }
        }

        return arreglo;
    }
   
    public static void Agregar_cita(String motivo, int doctor, String fecha, String hora, String pacienteNombre, String estado, int paciente) {
        Cita new_date = new Cita(motivo, doctor, fecha, hora, pacienteNombre, estado, paciente);
        listaCitas.add(new_date);
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
    
     public static void Agregar_doctor(int codigo, String nombre, String apellido, String especialidad,String telefono, String genero, int edad, String password, String[] hora) {
        Doctor new_date = new Doctor(codigo, nombre, apellido, especialidad, telefono, genero, edad, password, hora);
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
     
public static ArrayList<Doctor> bubblesortEdadDoctores() {
        // Crear una copia de la lista para no modificar la lista original
        ArrayList<Doctor> copiaLista = new ArrayList<>(listaDoctores);

        // Obtener la cantidad de elementos en la lista
        int n = copiaLista.size();

        // Variable para controlar si se ha realizado algún intercambio en la iteración
        boolean cambiado;
        
        // Ciclo principal del algoritmo de ordenamiento burbuja
        do {
            // Inicializar la variable 'cambiado' en falso al principio de cada iteración
            cambiado = false;

            // Iterar a través de la lista
            for (int i = 1; i < n; i++) {
                // Comparar elementos adyacentes en la lista por sus notas
                if (copiaLista.get(i - 1).getEdad() < copiaLista.get(i).getEdad()) {
                    // Intercambiar los elementos si el elemento anterior tiene una nota menor que el siguiente
                    Doctor temp = copiaLista.get(i - 1);
                    copiaLista.set(i - 1, copiaLista.get(i));
                    copiaLista.set(i, temp);

                    // Marcar que se ha realizado un intercambio en esta iteración
                    cambiado = true;
                }
            }

            // Decrementar el valor de 'n' para reducir el rango de la lista en cada iteración
            n--;
        } while (cambiado); // Continuar el ciclo mientras se sigan realizando intercambios

        // Devolver la lista ordenada
        return copiaLista;
    } 

public static ArrayList<Producto> bubblesortCantidadProducto() {
        // Crear una copia de la lista para no modificar la lista original
        ArrayList<Producto> copiaLista1 = new ArrayList<>(listaProductos);

        // Obtener la cantidad de elementos en la lista
        int n = copiaLista1.size();

        // Variable para controlar si se ha realizado algún intercambio en la iteración
        boolean cambiado;
        
        // Ciclo principal del algoritmo de ordenamiento burbuja
        do {
            // Inicializar la variable 'cambiado' en falso al principio de cada iteración
            cambiado = false;

            // Iterar a través de la lista
            for (int i = 1; i < n; i++) {
                // Comparar elementos adyacentes en la lista por sus notas
                if (copiaLista1.get(i - 1).getCantidad()< copiaLista1.get(i).getCantidad()) {
                    // Intercambiar los elementos si el elemento anterior tiene una nota menor que el siguiente
                    Producto temp = copiaLista1.get(i - 1);
                    copiaLista1.set(i - 1, copiaLista1.get(i));
                    copiaLista1.set(i, temp);

                    // Marcar que se ha realizado un intercambio en esta iteración
                    cambiado = true;
                }
            }

            // Decrementar el valor de 'n' para reducir el rango de la lista en cada iteración
            n--;
        } while (cambiado); // Continuar el ciclo mientras se sigan realizando intercambios

        // Devolver la lista ordenada
        return copiaLista1;
    }

public static void Agregar_horarios(int Numero, String Hora, int doctor){
      Horario new_date5 = new Horario(Numero, Hora, doctor);
        listaHorarioCitas.add(new_date5);
        Numero++;
    }
         
         
         
         public static Object[][] convertirHorarioDoc_tabla() {
        // Crear el arreglo bidimensional de objetos
        int filas = listaHorarioCitas.size();
        Object[][] arreglo = new Object[filas][2];

        
        for (int i = 0; i < filas; i++) {
            if(codigoSesion == listaHorarioCitas.get(i).getDoctor()){
            Horario asigna = listaHorarioCitas.get(i);
            arreglo[i][0] = i+1;
            arreglo[i][1] = asigna.getHora();

           
        }}
    
        return arreglo;
    }


}