package com.insoftar.crud.model;

public class Mensaje {

    String mensaje;
    int codigo;

    public Mensaje(String mensaje, int codigo) {
        this.mensaje = mensaje;
        this.codigo = codigo;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
}
