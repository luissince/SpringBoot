package com.cursojava.curso.model;

import javax.persistence.*;

@Entity
@Table(name = "AlmacenTB")
public class Almacen {
    
    @Id
    @Column(name = "IdAlmacen")
    private int idAlmacen;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "IdUbigeo")
    private int idUbigeo;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Fecha")
    private String fecha;

    @Column(name = "Hora")
    private String hora;

    @Column(name = "IdUsuario")
    private String idUsuario;

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdUbigeo() {
        return idUbigeo;
    }

    public void setIdUbigeo(int idUbigeo) {
        this.idUbigeo = idUbigeo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    

}
