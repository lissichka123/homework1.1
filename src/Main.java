public class Main {
    public static void main(String[] args) {
        int initial = 100;
        int deposit = 1100;
        int bonus = deposit / 100;
        int total;
        if (deposit >= 1000) {
            total = initial + deposit + bonus;
        } else {
            total = initial + deposit;
        }

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        System.out.println("Итоговый баланс: " + total);
        System.out.println("Колличество бонусных рублей: " + bonus);
    }
}