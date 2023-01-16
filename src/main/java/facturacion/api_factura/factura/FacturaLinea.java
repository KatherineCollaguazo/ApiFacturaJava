package facturacion.api_factura.factura;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import facturacion.api_factura.producto.Producto;

@Data
@Entity
public class FacturaLinea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Producto producto;

    private BigDecimal cantidad;
    private BigDecimal precio;
}
