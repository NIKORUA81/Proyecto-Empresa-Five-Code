package com.fivecode.fcingresoegreso.entity;

public class Empleado {
    private long idEmpleado;
    private String nombre;
    private String correo;
    private int cedula;

  /*  public Empleado(long idEmpleado, String nombre, String correo, int cedula){
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
    }*/

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", cedula=" + cedula +
                '}';
    }
}

