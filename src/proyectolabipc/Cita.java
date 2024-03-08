/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolabipc;

/**
 *
 * @author carlo
 */
public class Cita {

  
    
    //private int no;
    private String motivo;
    private int doctor;
    private String fecha;
    private String hora;
    private String pacienteNombre;
    private String estado;
    private int paciente;
    
    public Cita(/*int no,*/ String motivo, int doctor, String fecha, String hora, String pacienteNombre, String estado, int paciente){
    
        //this.no = no;
        this.motivo = motivo;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
        this.pacienteNombre = pacienteNombre;
        this.paciente = paciente;
        this.estado = estado;
    
    }

   /* public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }*/

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getDoctor() {
        return doctor;
    }

    public void setDoctor(int doctor) {
        this.doctor = doctor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPacienteNombre() {
        return pacienteNombre;
    }

    public void setPacienteNombre(String pacienteNombre) {
        this.pacienteNombre = pacienteNombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }
   
    
    
}

