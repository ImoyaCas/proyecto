package com.moya.ivan.planapp.Modelo;

/**
 * Created by ivan on 14/2/17.
 */

public class Follower {
    int id;
    String nombre, apellidos, email, movil, avatar, provincia;

    public static String nombreFLVista, emailFLVista, urlImgFLVista;
    public static int idFLVista;

    public static int numFollower;

    public Follower() {
        numFollower++;
    }

    public Follower(String nombre, String apellidos, String email, String provincia) {
        numFollower++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.provincia = provincia;
    }

    public Follower(int id, String nombre, String apellidos, String email, String movil, String avatar, String provincia) {
        numFollower++;
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.movil = movil;
        this.avatar = avatar;
        this.provincia = provincia;
    }

    public static int getNumFollower() {
        return numFollower;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        idFLVista = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        nombreFLVista = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        emailFLVista = email;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
        urlImgFLVista = avatar;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
