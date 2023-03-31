package Ej2;

public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador(String nombre, String cedula, int edad, boolean esCasado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, cedula, edad, esCasado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public Programador() {
    }

    @Override
    public String toString() {
        return "\n<Programador> " + super.toString() +
                "LineasDeCodigoPorHora=" + lineasDeCodigoPorHora + "\n" +
                "LenguajeDominante='" + lenguajeDominante + '\''+ "\n";
    }
}
