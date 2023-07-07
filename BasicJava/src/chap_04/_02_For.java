package chap_04;

public class _02_For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i){
            System.out.println(i);
        }

        for (int i = 1; i < 100; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
