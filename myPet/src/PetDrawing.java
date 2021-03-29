
public class PetDrawing {
	public static void main(String[] args) {
		System.out.println(
			String.format("\n%1$10d     %1$d" + 
						  "\n%2$8s  %3$4.2f  %2$s" +
					      "\n%2$7s           %2$s" +
						  "\n%2$6s    %4$s   %4$s    %2$s" +
						  "\n%2$7s     %5$s     %2$s" +
						  "\n%2$8s    %6$s    %2$s" +
						  "\n%7$12b %7$b", 
					       11, "X", 88.88, "D", "o", "U", true));
	}
}
