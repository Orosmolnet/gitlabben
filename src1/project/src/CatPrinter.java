public class CatPrinter {
    public static void main(String[] args) {
        printCat(Integer.parseInt(args[0]));
    }

    public static void printCat(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Cat");
        }
    }
}
