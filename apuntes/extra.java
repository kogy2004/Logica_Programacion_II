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

[8/10, 12:37 p.m.] K.G.: import java.util.Objects;

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
[8/10, 12:37 p.m.] K.G.: public class Televisor extends Producto {
    // Atributos específicos
    private int tamanoPulgadas; // 10-39, 40-49, 50-59, 60-75, 76 o más
    private String tipoPantalla; // LED, NanoCell, OLED, QLED, MiniLED, QNED
    private String sistemaOperativo; // Android TV, Google TV, Tizen, Web OS, Roku TV

    // Constructor
    public Televisor(String codigo, String referencia, String marca, String color, 
                     String resolucion, double precio, int unidadesDisponibles,
                     int tamanoPulgadas, String tipoPantalla, String sistemaOperativo) {
        super(codigo, referencia, marca, color, resolucion, precio, unidadesDisponibles);
        this.tamanoPulgadas = tamanoPulgadas;
        this.tipoPantalla = tipoPantalla;
        this.sistemaOperativo = sistemaOperativo;
    }

    // Método específico (override)
    @Override
    public String obtenerDetalles() {
        return "Televisor - Ref: " + getReferencia() + ", Tamaño: " + tamanoPulgadas + "in, Tipo: " + tipoPantalla + ", SO: " + sistemaOperativo;
    }
    
    // Getters y Setters específicos
    // ...
    public String getReferencia() { // Añadido para el método obtenerDetalles
        return super.referencia;
    }
}
[8/10, 12:37 p.m.] K.G.: public class Proyector extends Producto {
    // Atributos específicos
    private String tipoUso; // Hogar o Empresarial
    private String tecnologiaVisualizacion; // LCD, LED o DLP

    // Constructor
    public Proyector(String codigo, String referencia, String marca, String color, 
                     String resolucion, double precio, int unidadesDisponibles,
                     String tipoUso, String tecnologiaVisualizacion) {
        super(codigo, referencia, marca, color, resolucion, precio, unidadesDisponibles);
        this.tipoUso = tipoUso;
        this.tecnologiaVisualizacion = tecnologiaVisualizacion;
    }

    // Método específico (override)
    @Override
    public String obtenerDetalles() {
        return "Proyector - Ref: " + getReferencia() + ", Uso: " + tipoUso + ", Tecno: " + tecnologiaVisualizacion;
    }
    
    // Getters y Setters específicos
    // ...
    public String getReferencia() { // Añadido para el método obtenerDetalles
        return super.referencia;
    }
}
[8/10, 12:37 p.m.] K.G.: import java.time.LocalDate;
import java.util.Objects;

public class Cliente {
    // Atributos
    private String numDocumentoIdentidad;
    private String nombre;
    private LocalDate fechaNacimiento;

    // Constructor
    public Cliente(String numDocumentoIdentidad, String nombre, LocalDate fechaNacimiento) {
        this.numDocumentoIdentidad = numDocumentoIdentidad;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos (Getters y Setters)
    public String getNumDocumentoIdentidad() { return numDocumentoIdentidad; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    
    // Método para verificar si es el cumpleaños del cliente
    public boolean esCumpleanosHoy() {
        LocalDate hoy = LocalDate.now();
        // Compara solo el día y el mes
        return hoy.getMonth() == fechaNacimiento.getMonth() && 
               hoy.getDayOfMonth() == fechaNacimiento.getDayOfMonth();
    }

    // Sobrescritura de equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(numDocumentoIdentidad, cliente.numDocumentoIdentidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numDocumentoIdentidad);
    }
}
[8/10, 12:38 p.m.] K.G.: public class DetalleCompra {
    // Atributos
    private Producto producto;
    private int unidadesCompradas;
    private double subtotal;

    // Constructor
    public DetalleCompra(Producto producto, int unidadesCompradas) {
        this.producto = producto;
        this.unidadesCompradas = unidadesCompradas;
        this.subtotal = producto.getPrecio() * unidadesCompradas;
    }

    // Getters
    public Producto getProducto() { return producto; }
    public int getUnidadesCompradas() { return unidadesCompradas; }
    public double getSubtotal() { return subtotal; }
}
[8/10, 12:38 p.m.] K.G.: import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    // Atributos
    private LocalDate fecha;
    private Cliente cliente;
    private List<DetalleCompra> productosComprados; // Composición
    private double totalCompra;
    private double valorDescuento;
    private double valorAPagar;
    private static final double PORCENTAJE_DESCUENTO = 0.20; // 20%

    // Constructor
    public Compra(Cliente cliente) {
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.productosComprados = new ArrayList<>();
        this.totalCompra = 0.0;
        this.valorDescuento = 0.0;
        this.valorAPagar = 0.0;
    }

    // Métodos
    public void agregarProducto(Producto producto, int cantidad) {
        // 1. Verificar stock
        if (producto.getUnidadesDisponibles() < cantidad) {
            System.out.println("ERROR: No se puede agregar " + producto.getReferencia() + ". Stock insuficiente.");
            return;
        }

        // 2. Agregar detalle
        DetalleCompra detalle = new DetalleCompra(producto, cantidad);
        this.productosComprados.add(detalle);
        this.totalCompra += detalle.getSubtotal();
        
        System.out.println("Agregado: " + cantidad + " x " + producto.getReferencia());
    }

    public void finalizarCompra() {
        // 1. Aplicar descuento si aplica
        if (cliente.esCumpleanosHoy()) {
            this.valorDescuento = this.totalCompra * PORCENTAJE_DESCUENTO;
            System.out.println("🎉 ¡Felicidades! Descuento de cumpleaños del 20% aplicado.");
        } else {
            this.valorDescuento = 0.0;
        }

        // 2. Calcular valor a pagar
        this.valorAPagar = this.totalCompra - this.valorDescuento;

        // 3. Actualizar stock de todos los productos
        for (DetalleCompra detalle : productosComprados) {
            detalle.getProducto().actualizarStock(detalle.getUnidadesCompradas());
        }

        // 4. Imprimir resumen
        imprimirResumen();
    }
    
    // Método auxiliar para imprimir el resumen de la compra
    private void imprimirResumen() {
        System.out.println("\n--- Resumen de Compra ---");
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Cliente: " + this.cliente.getNumDocumentoIdentidad() + " - " + this.cliente.getNombre());
        System.out.println("Productos:");
        for (DetalleCompra d : productosComprados) {
            System.out.printf("  - %d x %s (Precio U: %.2f) - Subtotal: %.2f\n", 
                              d.getUnidadesCompradas(), 
                              d.getProducto().getReferencia(), 
                              d.getProducto().getPrecio(), 
                              d.getSubtotal());
        }
        System.out.printf("Total Bruto: %.2f\n", this.totalCompra);
        System.out.printf("Descuento Aplicado: %.2f\n", this.valorDescuento);
        System.out.printf("Total a Pagar: %.2f\n", this.valorAPagar);
        System.out.println("-------------------------\n");
    }

    // Getters
    public LocalDate getFecha() { return fecha; }
    public double getValorAPagar() { return valorAPagar; }
}
