/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_guia8_extralarge.servicios;
import ejercicio6_guia8_extralarge.entidad.Producto;
import java.util.Scanner;


/**
 *
 * @author Joselo
 */
public class ProductoServicio {
    Scanner sc = new Scanner(System.in);
    private Producto producto;
    
    // Método crearProducto(), solicitando los datos al usuario.
    public void crearProducto() {
        System.out.println(" ");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Descripcion: ");
        String descripcion = sc.nextLine();
        System.out.print("Precio de venta: ");
        double precioVenta = sc.nextDouble();
        System.out.print("Stock: ");
        int stock = sc.nextInt();
        
        producto = new Producto(nombre, descripcion, precioVenta, stock);
    }
    
    // Método comprarProducto(int cantidad, double precio), recibe por parámetros la cantidad de productos
    // comprados y el precio unitario pagado. 
    // Debe modificar el stock de productos e imprimir por pantalla el monto total de la compra.
    public void comprarProducto(int cantidad, double precio) {
        producto.setStock(producto.getStock() + cantidad);
        double totalCompra = cantidad * precio;
        System.out.println("Monto total de la compra: " + totalCompra);
    }
    
    //  Método unidadesDisponibles(), debe imprimir el stock del producto.
    public void unidadesDisponibles() {
        System.out.println(" ");
        System.out.println("Stock del producto: " + producto.getStock());
    }
    
    // Método venderProducto(int cantidad), recibe por parámetro las unidades que solicita el cliente. 
    // Debe descontar las unidades vendidas del stock. Tener en cuenta que debe analizar las unidades disponibles, 
    // y en el caso que las mismas sean inferiores a la cantidad solicitada por el cliente, 
    // debe notificar al cliente que no tienen stock suficiente y solamente venderle las unidades disponibles hasta agotar stock.
    public void venderProducto(int cantidad) {
        if (cantidad > producto.getStock()) {
            System.out.println("No tiene stock suficiente. Solo puede comprar las unidades disponibles.");
            cantidad = producto.getStock();
        }
        producto.setStock(producto.getStock() - cantidad);
            System.out.println("Se vendieron: " + cantidad + " unidades del producto");
            System.out.println("Stock actual: "+ producto.getStock());
            System.out.println(" ");
            
    }
    
    // Método visualizarProducto(), debe imprimir los datos del producto.
    public void visualizarProducto() {
        System.out.println(" ");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("Precio de venta: " + producto.getPrecioVenta());
        System.out.println("Stock: " + producto.getStock());
    }
}

