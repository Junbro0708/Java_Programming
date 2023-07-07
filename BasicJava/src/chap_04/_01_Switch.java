package chap_04;

public class _01_Switch {
    public static void main(String[] args) {
        int ranking = 1;

        switch (ranking){
            case 1:
                System.out.println("All");
                break;
            case 2, 3:
                System.out.println("Half");
                break;
            default:
                System.out.println("Nothing");
        }
    }
}
