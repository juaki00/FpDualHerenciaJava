package Ej2;

public class Empleado {

    private String nombre;
    private String cedula;
    private int edad;
    private boolean esCasado;
    private double salario;

    public Empleado(String nombre, String cedula, int edad, boolean esCasado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.esCasado = esCasado;
        this.salario = salario;
    }

    public Empleado() {
        this.nombre = "<Sin nombre>";
        this.cedula = "";
        this.edad = 18;
        this.esCasado = false;
        this.salario = 1500;
    }

    public String clasificacion() {
        String resultado;
        if (edad <= 21) {
            resultado = "Principiante";
        } else if (edad <= 35) {
            resultado = "Intermedio";
        } else {
            resultado = "Senior";
        }

        return resultado;
    }

    public void aumentarSalario(int porcentaje) {
        this.salario = this.salario + (this.salario * porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Empleado:" + "\n" +
                "nombre='" + nombre + '\'' + "\n" +
                "Cedula='" + cedula + '\'' + "\n" +
                "Edad=" + edad + "\n" +
                "Casado=" + esCasado + "\n" +
                "Salario=" + salario+ "\n";
    }
}
