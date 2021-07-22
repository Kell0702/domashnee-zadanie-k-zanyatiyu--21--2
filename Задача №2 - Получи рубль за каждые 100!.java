public class Main {
    public static void main(String[] agre) {
        int score = 100;
        int deposits = 1100;
        int scorenomber;

        int bonus = 1 * deposits / 100;
        if (deposits >= 1000) {
            scorenomber = score + deposits + bonus;
        }else {
            scorenomber = score + deposits;
        }

        System.out.println(scorenomber);
    }

}