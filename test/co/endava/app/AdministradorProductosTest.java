package co.endava.app;

import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    public void testDescuentoComida() {
        double Descuento;
        Comida p3 = new Comida(103, "Pastel", 20000, LocalDate.now().plusDays(0));
        Descuento = p3.getPrecio() * 0.1d;
        assertEquals(Descuento, p3.getDescuento());
    }
}

