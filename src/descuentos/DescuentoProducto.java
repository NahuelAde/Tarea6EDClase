package descuentos;

/**
 * Clase DescuentoProducto. Cálculo de descuentos que se aplica a productos
 *
 * @author Nahuel Ade
 */
public class DescuentoProducto {

    /**
     * Atributos de la clase DescuentoProducto: constantes de descuento que se aplican sobre los productos
     */
    public static final double DESC_PRODUCTO_NO_CERO = 0.8;
    public static final double DESC_PRODUCTO_OTROS = 0.95;

    /**
     * Método para aplicar descuento sobre producto dependiendo de la cantidad pedida
     *
     * @param precioProducto Precio del producto sobre el que se va a aplicar el descuento
     * @param numProductos Cantidad de producto
     */
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;
        precioProducto = precioTotal(numProductos, precioProducto);
        if (numProductos != 0) {
            Total = precioProducto * DESC_PRODUCTO_NO_CERO;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        } else {
            Total = precioProducto * DESC_PRODUCTO_OTROS;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        }
    }

    /**
     * Método para calcular el precio total del producto dependiendo de la cantidad pedida
     *
     * @param numProductos Cantidad de producto
     * @param precioProducto Precio unitario del producto
     * @return Precio del producto aplicando un descuento al comprar más de 3 unidades
     */
    public double precioTotal(int numProductos, double precioProducto) {
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        return precioProducto;
    }
}
