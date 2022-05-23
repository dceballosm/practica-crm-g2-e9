package src.gestionApp;

import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String cedula;
    private int cel;
    private ArrayList <Productos> Productos = new ArrayList <>();

    public Empleado(String nombre, String cedula, int cel){
        this.nombre = nombre;
        this.cedula = cedula;
        this.cel = cel;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCedula(){
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public int getCel(){
        return cel;
    }

    public void setCel(int cel){
        this.cel = cel;
    }

    
}
