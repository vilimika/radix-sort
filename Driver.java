import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.io.IOException;


public class Driver {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input file name: ");
        String f = sc.nextLine();
        File inf = f.isEmpty() ? new File("f.txt") : new File(f);

        System.out.println("Enter output file: ");
        f = sc.nextLine();
        List<String> lines = new ArrayList<String>();
        try {
            Scanner s = new Scanner(inf);
            while (s.hasNextLine()) {
                lines.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try{
            FileWriter outf = f.isEmpty() ? new FileWriter("g.txt") : new FileWriter(f);
            outf.flush();
            for(String str: lines){
                outf.write(str + System.lineSeparator());
            }
            outf.close();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
