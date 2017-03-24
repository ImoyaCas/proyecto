package com.moya.ivan.planapp.Modelo;

/**
 * Created by ivan on 14/2/17.
 */

public class Plan {

    int id, idPlaner, plazas, plazasOcupadas;
    String nombre, categoria, direccion, fecha, hora, localidad, provincia, portada, descripcion;
    double precio, latitud, longitud, puntuacion;

    public static int numPlanes;

    public Plan() {
        numPlanes++;
    }

    public Plan(int idPlaner, int plazas, String nombre, String categoria, String descripcion, String direccion, String fecha, String hora, double precio, String localidad, String provincia, double latitud, double longitud, String portada) {
        numPlanes++;
        this.idPlaner = idPlaner;
        this.plazas = plazas;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.provincia = provincia;
        this.localidad = localidad;
        this.latitud = latitud;
        this.longitud = longitud;
        this.portada = portada;
    }

    public Plan(int idPlaner, int plazas, String nombre, String categoria, String descripcion, String direccion, String fecha, String hora, String localidad, String provincia, double latitud, double longitud, String portada) {
        numPlanes++;
        this.idPlaner = idPlaner;
        this.plazas = plazas;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.fecha = fecha;
        this.hora = hora;
        this.provincia = provincia;
        this.localidad = localidad;
        this.latitud = latitud;
        this.longitud = longitud;
        this.portada = portada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static int getNumPlanes() {
        return numPlanes;
    }
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public static void setNumPlanes(int numPlanes) {
        Plan.numPlanes = numPlanes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPlaner() {
        return idPlaner;
    }

    public void setIdPlaner(int idPlaner) {
        this.idPlaner = idPlaner;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
        this.plazasOcupadas = plazasOcupadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
