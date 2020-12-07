public class CatPrinter {
    public static void main(String[] args) {
        if (args.length == 1) {
            printCat(Integer.parseInt(args[0]));
        } else if (args.length == 2) {
            printCat(Integer.parseInt(args[0]), args[1]);
        } else {
            System.out.println("Invalid arguments, exiting....");
            System.exit(0);
        }

    }

    public static void printCat(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Cat");
        }
    }
//hejhejhej
    public static void printCat(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println("The cat says " + word + "!");
        }
    }
}
