public class Question4 {
    public static void main(String[] args) {
        String[] productName = {"Cheese", "Bread", "Milk", "Cookie"};
        double[] productValue = { 12.45, 9.30, 10.00, 2.45 };

        for (int i = 0; i < productName.length; i++) {
            String name = productName[i];
            double price = productValue[i];
            System.out.println("Produto: " + name + ", Preço: R$ " + String.format("%.2f", price));
        }
    }
}