package descuentos;

/**
 * Clase ProductoConDescuento. Obtención del precio final de la compra
 *
 * @author Nahuel Ade
 */
public class ProductoConDescuento {

    /**
     * Método Main. Cálculo del precio final a partir del precio y la cantidad
     * @param args Argumentos en línea de comandos proporcionados al programa
     */
    public static void main(String[] args) {
        DescuentoProducto miCarrito = new DescuentoProducto();

        miCarrito.aplicarDescuento(100, 5);
    }

}
