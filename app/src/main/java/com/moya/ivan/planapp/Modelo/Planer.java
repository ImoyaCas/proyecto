package com.moya.ivan.planapp.Modelo;

/**
 * Created by ivan on 14/2/17.
 */

public class Planer {

    private int id, numSeguidores, numPlanes, numSiguiendo;
    private String nombre, apellidos, username, direccion, email, movil, avatar, provincia, nivel, portada, localidad;
    public static String nombrePLVista, emailPLVista, urlImgPLVista;
    public static int idPLVista;

    public static int numPlaners;

    public Planer() {
        numPlaners++;
    }

    public Planer(String username, String direccion, String email, String movil, String provincia, String localidad) {
        numPlaners++;
        this.username = username;
        this.direccion = direccion;
        this.email = email;
        this.movil = movil;
        this.provincia = provincia;
        this.localidad = localidad;
    }

    public Planer(int id, String username, String direccion, String email, String movil, String provincia, String avatar, String nivel, String portada, int numSeguidores, int numPlanes) {
        numPlaners++;
        this.id = id;
        this.username = username;
        this.direccion = direccion;
        this.email = email;
        this.movil = movil;
        this.provincia = provincia;
        this.avatar = avatar;
        this.nivel = nivel;
        this.portada = portada;
        this.numSeguidores = numSeguidores;
        this.numPlanes = numPlanes;
    }

    public static int getNumPlaners() {
        return numPlaners;
    }

    public int getNumSiguiendo() {
        return numSiguiendo;
    }

    public void setNumSiguiendo(int numSiguiendo) {
        this.numSiguiendo = numSiguiendo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        idPLVista = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        nombrePLVista = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        emailPLVista = email;
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
        urlImgPLVista = avatar;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public int getNumSeguidores() {
        return numSeguidores;
    }

    public void setNumSeguidores(int numSeguidores) {
        this.numSeguidores = numSeguidores;
    }

    public int getNumPlanes() {
        return numPlanes;
    }

    public void setNumPlanes(int numPlanes) {
        this.numPlanes = numPlanes;
    }
}
