package Vibe;

class PhoneShop {
    public static void main(String[] args) {
        PHONES[] stock = {
                new RuggedFeaturePhone("CAT S22", 99.0, "IP68", 1.8, 14),
                new SeniorFeaturePhone("Emporia SMART.3", 119.0, 1.5, true, true),
                new BasicFeaturePhone("Nokia 105", 29.9, "Calls/SMS", false, true),
                new ProGamingPhone("ROG 7", 999.0, true, "Vapor-Chamber", 165),
                new BudgetGamingPhone("POCO X5", 249.0, 2.2, 6, true),
                new CloudGamingPhone("Logitech G Cloud", 299.0, "Wi-Fi 6E",
                        new String[]{"n78", "n79"}, "Xbox Game Pass Ultimate")
        };

        for (PHONES p : stock)
            System.out.println(p.getClass().getSimpleName() + "  " + p);
    }
}