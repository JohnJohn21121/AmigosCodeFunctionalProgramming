package org.example.fileiopractice;

import java.io.*;

public class FileIOMain {
    public static void main(String[] args) {
        String[] names = {"John", "Anya", "Petrikov", "Alan"};
        try {
            //Buffered writer will always work with implementations of the Writer class,
            //we should also take in account that as long as the file does not exist, in it´s first instance it will
            //create the file object , then as long as it is pointing to the same file it is going to overwrite it.
            //To create the file in a specific Folder you have to specify the absolut path, also use \\ to work.
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing this to a File, which I think its a good practice perhaps, I should use a StringBuffer");
            writer.write("\nThis is to show a way to add a new line.");
            writer.newLine();
            writer.write("This line has been written in a different... line thanks to the newLine method");
            for (String name : names) {
                writer.write("\n" + name);
            }
            //Never Forget to use the close() method as nothing will happen with the file.
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // reader added in another Try for explanation and practice purposes
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            //The best way to fully read the file is with a while loop
            String line;
            //In here what we are doing is  that as long as there are lines in the file, the line variable is going
            //Null, which means that it is going to complete the while condition.
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
