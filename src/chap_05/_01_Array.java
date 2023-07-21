package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String[] coffees = new String[5];
        String coffees2[] = new String[5];

        coffees[0] = "Americano";
        coffees[1] = "CafeLatte";
        coffees[2] = "Steamed Milk";
        coffees[3] = "Hot coffee";
        coffees[4] = "Mocha Blended";

        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]);
        }

        String[] juices = new String[] {"Orange", "Apple"};
        for (int i = 0; i < juices.length; i++) {
            System.out.println(juices[i]);
        }

        String[] games = {"Lol", "Overwatch", "Maplestory", ""};
        games[3] = "dd";
        System.out.println(games.length);

        int[] nums = {1, 2, 34, 5};
        System.out.println(nums);
        double[] doubles = {1.3, 2.5, 6.7};
        System.out.println(doubles);
    }
}
