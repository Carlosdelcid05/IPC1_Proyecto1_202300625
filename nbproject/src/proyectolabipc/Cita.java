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

  
    
    private int no;
    private String motivo;
    private int doctorCodigo;
    private String fecha;
    private String hora;
    private String pacienteNombre;
    
    public Cita(int no, String motivo, int doctorCodigo, String fecha, String hora, String pacienteNombre){
    
        this.no = no;
        this.motivo = motivo;
        this.doctorCodigo = doctorCodigo;
        this.fecha = fecha;
        this.hora = hora;
        this.pacienteNombre = pacienteNombre;
    
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getDoctorCodigo() {
        return doctorCodigo;
    }

    public void setDoctorCodigo(int doctorCodigo) {
        this.doctorCodigo = doctorCodigo;
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
   
    
    
}

