
public class Kakezan {

	public static void main(String args[]) {
		// kukuを呼び出す。
		kuku();
		
		
	}
    public static void kuku() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
            	
                int num = i * j;
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

}
