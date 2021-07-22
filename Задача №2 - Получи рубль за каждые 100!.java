public class Main {
    public static void main(String[] agre) {
        int score = 100;
        int deposits = 1100;
        int scorenomber;


        if (deposits >= 1000) {
            scorenomber = score + deposits + (1 * deposits / 100);
        }else {
            scorenomber = score + deposits;
        }

        System.out.println(scorenomber);
    }

}
