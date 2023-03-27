public class Main {

    public static void main(String[] args) {
        int price = 4999; // Цена билета в рублях
        int milePrice = 20; // Количество рублей за каждую милю

        int miles = price / milePrice; // Находим количество бонусных миль

        System.out.println("Количество полученных бонусных миль: " + miles);
    }
}
