/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolabipc;

/**
 *
 * @author carlo
 */
public class Horario {
 private int numero;
    private String hora;
    private int doctorCodigo;
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Horario(int numero, String hora) {
        this.numero = numero;
        this.hora = hora;
    }


    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getDoctor() {
        return doctorCodigo;
    }

    public void setDoctor(int doctor) {
        this.doctorCodigo = doctor;
    }

    public Horario(int numero, String hora, int doctor) {
        this.numero = numero;
        this.hora = hora;
        this.doctorCodigo = doctor;
    }


    
}