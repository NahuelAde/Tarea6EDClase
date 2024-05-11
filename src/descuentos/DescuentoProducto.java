package descuentos;

public class DescuentoProducto {

    public static final double DESC_PRODUCTO_NO_CERO = 0.8;
    public static final double DESC_PRODUCTO_OTROS = 0.95;

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

    public double precioTotal(int numProductos, double precioProducto) {
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        return precioProducto;
    }
}
