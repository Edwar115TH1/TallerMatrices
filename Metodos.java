import java.util.Scanner;

public class Metodos {
    public ObjAlmacen[][] LlenarAlmacen(ObjAlmacen[][] a, Scanner sc) {
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.next();
                System.out.println("Ingrese el precio del producto: ");
                Double precio= sc.nextDouble();
                System.out.println("Ingrese la cantidad del producto: ");
                int cantidad= sc.nextInt();
                ObjAlmacen o = new ObjAlmacen(nombre, precio, cantidad);
                a[i][j] = o;
            }
        }    
        return a;
    }

    public void MostrarAlmacen(ObjAlmacen[][] a) {
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Nombre del producto: "   + a[i][j].getNombre());
                System.out.println("Precio del pro: "   + a[i][j].getPrecio());
                System.out.println("Cantidad del Producto: " + a[i][j].getCantidad());
            }
        }  
    }



}
