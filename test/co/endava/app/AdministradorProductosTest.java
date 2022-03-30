package co.endava.app;

import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    public void main() {
        double Descuento;
        Descuento = 1000;
        Comida p3 = new Comida(103, "Pastel",20000,LocalDate.now().plusDays(2));
        assertEquals(Descuento, p3.getDescuento());

    }
}