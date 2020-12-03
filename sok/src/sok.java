import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class sok
{
    public static void main(String[] args) throws IOException
    {
        File f1=new File("input.txt"); //Creation of File Descriptor for input file
        String[] words=null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        String input="sökord";   // Input word to be searched
        int count=0;   //Intialize the word to zero
        while((s=br.readLine())!=null)   //Reading Content from the file
        {
            words=s.split(" ");  //Split the word using space
            for (String word : words)
            {
                if (word.equals(input))   //Search for the given word
                {
                    count++;
                }
            }
        }
        if(count!=0)
        {
            System.out.println("The given word is present for "+count+ " Times in the file");
        }
        else
        {
            System.out.println("The given word is not present in the file");
        }

        fr.close();
    }


}