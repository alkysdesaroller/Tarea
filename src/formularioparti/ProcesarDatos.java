/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formularioparti;

/**
 *
 * @author alna7
 */
public class ProcesarDatos {
     private String nombre;
    private String apellido;
    private int edad;

    // Método para capturar los datos
    public void capturarDatos(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Método para presentar los datos
    public String presentarDatos() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad;
    }
}
