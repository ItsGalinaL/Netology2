public class BonusMilesService {

    public int calculate(int cost) {
        int milePrice = 20; // Количество рублей за каждую милю
        return cost / milePrice; // Находим количество бонусных миль
    }
}
