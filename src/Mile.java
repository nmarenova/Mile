class BonusMilesService {
    public int calculate(int cost) {
        return cost / 20;
    }
}

public class Mile {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
