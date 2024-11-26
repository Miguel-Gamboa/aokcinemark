package es.tuterror.apkcinemark.model;

import android.database.Cursor;

import java.io.Serializable;

public class Usuario implements Serializable{
    int id;
    String Nombres, Apellidos, Correo, Telefono, Genero, FechaNacimiento;
    String Dni, Ciudad, Teatro, GeneroPelicula, Passwordd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getTeatro() {
        return Teatro;
    }

    public void setTeatro(String teatro) {
        Teatro = teatro;
    }

    public String getGeneroPelicula() {
        return GeneroPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        GeneroPelicula = generoPelicula;
    }

    public String getPasswordd() {
        return Passwordd;
    }

    public void setPasswordd(String passwordd) {
        Passwordd = passwordd;
    }

    public Usuario(Cursor cursor) {
        id = cursor.getInt(0);
        Nombres = cursor.getString(1);
        Apellidos = cursor.getString(2);
        Correo = cursor.getString(3);
        Telefono = cursor.getString(4);
        Genero = cursor.getString(5);
        FechaNacimiento = cursor.getString(6);
        Dni = cursor.getString(7);
        Ciudad = cursor.getString(8);
        Teatro = cursor.getString(9);
        GeneroPelicula = cursor.getString(10);
        Passwordd = cursor.getString(11);
    }
}