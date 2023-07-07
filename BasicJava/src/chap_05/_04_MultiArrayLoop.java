package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"A1", "A2", "A3", "A4", "A5"},
                {"A1", "A2", "A3", "A4", "A5"},
                {"A1", "A2", "A3", "A4", "A5", "A6"},
                {"A1", "A2", "A3", "A4"}
        };

//        for (int i = 0; i < seats.length; i++) {
//            for (int j = 0; j < seats[i].length; j++) {
//                System.out.print(seats[i][j] + " ");
//            }
//            System.out.println();
//        }

        int ascii = 65;
        String[][] seats2 = new String[5][10];
        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                seats2[i][j] = String.valueOf((char)ascii) + String.valueOf(j + 1);
                System.out.print(seats2[i][j] + " ");
            }
            ascii++;
            System.out.println();
        }
    }
}
