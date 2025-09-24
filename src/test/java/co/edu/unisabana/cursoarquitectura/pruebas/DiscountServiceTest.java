package co.edu.unisabana.cursoarquitectura.pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountServiceTest {

    DiscountService discountService = new DiscountService();

    @Test
    void Dado_ClienteRegular_Cuando_CalculatePrice_Entonces_DaDescuento5() {
        double precioBoleta = discountService.calculatePrice(1000, "regular");
        assertEquals(950, precioBoleta);
    }

    @Test
    void Dado_ClienteRegular_Cuando_CalculatePrice_Entonces_DaDescuento0_2() {
        double precioBoleta = discountService.calculatePrice(2000, "vip");
        assertEquals(1600, precioBoleta);
    }


    @Test
    void Dado_ClienteVIP_Cuando_CalculatePrice_Entonces_DaDescuento20() {
        double precioBoleta = discountService.calculatePrice(1000, "vip");
        assertEquals(900, precioBoleta);
    }

    @Test
    void Dado_ClienteVIP_Cuando_CalculatePrice_Entonces_DaDescuento10() {
        double precioBoleta = discountService.calculatePrice(500, "regular");
        assertEquals(500, precioBoleta);
    }
}