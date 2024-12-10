public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int replenishment = 1100;

        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }

        int finalBalance = startBalance + replenishment + bonus;
        System.out.println("Итог: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}