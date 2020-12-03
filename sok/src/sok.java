
import java.io.File;
import java.util.*;
import java.io.*;
import java.lang.*;


public class sok {
    public void parseFile(String fileName, String searchStr) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        int count = 1;

        while (scan.hasNext()) {

            String line = scan.nextLine().toLowerCase().toString();

            if (line.contains(searchStr)) {
                System.out.println("Line " + count);
            }
            count++;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        sok fileSearch = new sok();
        fileSearch.parseFile("/Users/simon/Documents/GitHub/gitlabben/sok/input.txt", "katt");
    }

}