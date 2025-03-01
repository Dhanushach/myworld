package javapracticing;
import java.math.BigDecimal;
import java.util.Map;
public class CartCheckout {
 public String billGenerator(Map<String, BigDecimal> cart, Double taxPercent) {
 if (cart.isEmpty()) {
 return "The cart Map is empty";
 }
 if (taxPercent == null) {
 return "The taxPercent cannot be null";
 }
 if (taxPercent < 0) {
 return "The taxPercent cannot be negative";
 }
 for (BigDecimal value : cart.values()) {
	 if (value == null || value.toString().trim().isEmpty()) {
		 return "The cart contains invalid value";
		 }
		 }
		 BigDecimal total = cart.values().stream()
		 .reduce(BigDecimal.ZERO, BigDecimal::add);
		 multiply(BigDecimal.valueOf(1 + taxPercent / 100));
		 return total.toString();
		 }
		 private void multiply(BigDecimal valueOf) {
	// TODO Auto-generated method stub
	
}
		public static void main(String[] args) {
		 CartCheckout checkout = new CartCheckout();
		 Map<String, BigDecimal> cart = Map.of(
		 "Apple", BigDecimal.valueOf(54),
		 "Grapes", BigDecimal.valueOf(36.78),
		 "Papaya", BigDecimal.valueOf(27.89),
		 "Orange", BigDecimal.valueOf(23.6),
		 "Banana", BigDecimal.valueOf(10.2)
		 );
		 Double taxPercent = -10.5;
		 System.out.println(checkout.billGenerator(cart, taxPercent));
		 }
		 
 }