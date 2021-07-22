public class BonusMilesService {
    public int calculate(int cost){
        int bonus = 20;
        int miles;
        miles = cost / bonus;
        return miles;
    }
}
