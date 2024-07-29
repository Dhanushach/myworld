import java.math.BigDecimal;
import java.util.Map;

public class CartCheckout {

    public static String billGenerator(Map<String, BigDecimal> cart, Double taxRate) {
        // Validate input map and taxRate
        if (cart == null || cart.isEmpty()) {
            return "Error: The cart is empty or null.";
        }
        if (taxRate == null || taxRate < 0) {
            return "Error: The tax rate is null or negative.";
        }
        
        // Validate values in the map
        for (Map.Entry<String, BigDecimal> entry : cart.entrySet()) {
            if (entry.getKey() == null || entry.getKey().trim().isEmpty() || entry.getValue() == null) {
                return "Error: The cart contains null, empty or blank space as a value.";
            }
        }

        // Calculate total purchase cost including taxes
        BigDecimal totalCost = cart.values().stream()
            .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal taxAmount = totalCost.multiply(BigDecimal.valueOf(taxRate));
        BigDecimal totalCostWithTax = totalCost.add(taxAmount);

        return "Total purchase cost including taxes: " + totalCostWithTax;
    }

    public static void main(String[] args) {
        // Example usage
        Map<String, BigDecimal> cart = Map.of(
            "Item1", new BigDecimal("10.00"),
            "Item2", new BigDecimal("20.00"),
            "Item3", new BigDecimal("30.00")
        );
        Double taxRate = 0.1; // 10% tax rate

        String result = billGenerator(cart, taxRate);
        System.out.println(result);
    }
}