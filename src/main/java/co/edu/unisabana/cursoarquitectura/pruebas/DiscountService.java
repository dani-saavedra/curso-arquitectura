package co.edu.unisabana.cursoarquitectura.pruebas;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    public double calculatePrice(double originalPrice, String customerType) {
        double discount = 0.0;
        if (customerType == null) {
            throw new IllegalArgumentException("Customer type required");
        }
        if (customerType.equals("regular") && originalPrice > 10000) {
            throw new IllegalArgumentException("Cliente no es digno de esta boleta ");
        }
        switch (customerType.toLowerCase()) {
            case "vip":
                if (originalPrice > 1000) {
                    discount = 0.20;
                } else {
                    discount = 0.10;
                }
                break;
            case "regular":
                if (originalPrice > 500) {
                    discount = 0.05;
                }
                break;
            default:
                discount = 0.0;
        }

        return originalPrice - (originalPrice * discount);
    }
}
