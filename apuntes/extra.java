import java.util.Objects;

public abstract class Producto {
    // Atributos
    private String codigo;
    private String referencia;
    private String marca; // Ejemplo: Samsung, LG
    private String color;
    private String resolucion; // Ejemplo: HD, Full HD
    private double precio;
    private int unidadesDisponibles;

    // Constructor
    public Producto(String codigo, String referencia, String marca, String color, 
                    String resolucion, double precio, int unidadesDisponibles) {
        this.codigo = codigo;
        this.referencia = referencia;
        this.marca = marca;
        this.color = color;
        this.resolucion = resolucion;
        this.precio = precio;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    // Métodos (Getters y Setters)
    // ... (Se omiten por brevedad, pero son necesarios para acceder a los atributos)
    public String getCodigo() { return codigo; }
    public double getPrecio() { return precio; }
    public int getUnidadesDisponibles() { return unidadesDisponibles; }

    // Método para actualizar la cantidad disponible
    public void actualizarStock(int cantidadVendida) {
        if (this.unidadesDisponibles >= cantidadVendida) {
            this.unidadesDisponibles -= cantidadVendida;
            System.out.println("Stock de " + this.referencia + " actualizado. Restantes: " + this.unidadesDisponibles);
            verificarStockMinimo();
        } else {
            System.out.println("ERROR: No hay suficientes unidades de " + this.referencia + " disponibles.");
        }
    }

    // Método para generar alerta de stock
    private void verificarStockMinimo() {
        if (this.unidadesDisponibles < 10) {
            System.out.println("!!! ALERTA DE STOCK: La cantidad de " + this.referencia + " es menor a 10. Unidades: " + this.unidadesDisponibles);
        }
    }
    
    // Método abstracto para asegurar que las subclases lo implementen
    public abstract String obtenerDetalles();

    // Sobrescritura de equals y hashCode (importante para colecciones)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
