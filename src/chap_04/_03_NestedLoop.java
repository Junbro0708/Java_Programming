package chap_04;

public class _03_NestedLoop {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; ++i){
            for (int x = 5; x > i; --x) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
