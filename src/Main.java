import Ej1.*;
import Ej2.Empleado;
import Ej2.Programador;

public class Main {
    public static void main(String[] args) {

//        Ejercicio1
//        Producto congeladoPorAgua = new ProductoCongeladoPorAgua("2/02/2024", 12, -20, false);
//        Producto congeladoPorAire = new ProductoCongeladoPorAire("23/12/2023", 12, -20, 2);
//        Producto congeladoPorNitrogeno = new ProductoCongeladoPorNitrogeno("20/07/2023", 12, -20, 24523);
//        Producto fresco = new ProductoFresco("12/12/2023",3,"Pescado");
//        Producto refrigerado = new ProductoRefrigerado("01/01/2024",10,7);


        Empleado empleado1 = new Empleado("Jose Perez","Cedula", 24, false, 2000);
        empleado1.aumentarSalario(10);
        Programador programador1 = new Programador("Antonio Garcia","Cedula", 18, false, 1000,100,"Java");
        programador1.aumentarSalario(20);

        System.out.println(empleado1.toString() + "Clasificacion: " + empleado1.clasificacion());
        System.out.println(programador1.toString() + "Clasificacion: " + programador1.clasificacion());
    }
}