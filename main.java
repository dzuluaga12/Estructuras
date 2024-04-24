package Estructuras;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class main{
    public static void main(String[] args) {
        LinkedList lista = new LinkedList<>();
        LinkedList<empleado> ListaEmpleado = new LinkedList<empleado>();
        lista.add("pedro");
        lista.add(234);
        System.out.println(lista);

        for (int i = 0; i < 2; i++) {
            empleado e = new empleado(null, null, null, i, null);
            e.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
            e.setApellido(JOptionPane.showInputDialog("Ingrese el apellido"));
            e.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion"));
            e.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
            e.setCargo(JOptionPane.showInputDialog("Ingrese el cargo"));
            ListaEmpleado.add(e);
        }
        System.out.println(ListaEmpleado);
        String cadena = "";
        for (empleado e : ListaEmpleado) {
            cadena = cadena + e.getNombre() + "\n" +e.getApellido() + "\n" + e.getDireccion() + "\n" + e.getEdad() + "\n" + e.getCargo() + "\n";
        }
        JOptionPane.showMessageDialog(null, cadena, "Lista Empleados", 0);

    }
}