public class Main {
    public static void main(String[] args) {
        int ticketPrice = 7500;
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(ticketPrice);

        System.out.println(miles);
    }
}
