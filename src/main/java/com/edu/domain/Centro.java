package com.edu.domain;

public class Centro {
    
    private int id;
    private String nombre;
    private Titularidad titularidad;

    public Centro(){
        super();
    }

    /** 
     * @param id
     * @param nombre
     * @param titularidad
     * @return Centro
     */
    public Centro initialize(int id, String nombre, Titularidad titularidad) {
        setId(id);
        setNombre(nombre);
        setTitularidad(titularidad);

        return this;
    }

    public Centro (int id, String nombre, Titularidad titularidad) {
        initialize(id, nombre, titularidad);
    }

    /** 
     * @return int
     */
    public int getId() {
        return id;
    }

    /** 
     * @param id
     */
    public void setId(int id) {
        if (this.id != 0) throw new IllegalStateException("El identificador no puede modificarse");
        this.id = id;
    }

    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** 
     * @return Titularidad
     */
    public Titularidad getTitularidad() {
        return titularidad;
    }

    /** 
     * @param titularidad
     */
    public void setTitularidad(Titularidad titularidad) {
        this.titularidad = titularidad;
    }

    /** 
     * @return String
     */
    @Override
    public String toString() {
        return String.format("%d [%s, %s]", id, nombre, titularidad);
    }


}
