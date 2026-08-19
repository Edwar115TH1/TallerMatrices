public class ObjAlmacen {
String Nombre;
Double Precio;
int Cantidad;
public ObjAlmacen(String nombre, Double precio, int cantidad) {
    Nombre = nombre;
    Precio = precio;
    Cantidad = cantidad;
}
public String getNombre() {
    return Nombre;
}
public void setNombre(String nombre) {
    Nombre = nombre;
}
public Double getPrecio() {
    return Precio;
}
public void setPrecio(Double precio) {
    Precio = precio;
}
public int getCantidad() {
    return Cantidad;
}
public void setCantidad(int cantidad) {
    Cantidad = cantidad;
   
}
}
