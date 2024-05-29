package AdvanceJava;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {

        try {

            // CREATE FILE
            File myFile = new File ("testfile.txt");

            if (myFile.createNewFile()){
            System.out.println("File created");
            }
            else
                System.out.println("File already exists");

            // WRITE FILE
            FileWriter myWriter = new FileWriter ("testfile.txt");
            myWriter.write("This is a test file. \nThis is new line\n");
            myWriter.close();
            System.out.println("File written");

            // READ FILE
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

            // DELETE FILE
            File Obj = new File("deletefiletest.txt");
            if (myFile.createNewFile()){
                System.out.println("File created");
            }
            else
                System.out.println("File already exists");

            FileWriter myWriter1 = new FileWriter ("deletefiletest.txt");
            myWriter1.write("This is a test file to check DELETE operation. \nThis is new line\n");
            myWriter1.close();
            System.out.println("File written");

            if (Obj.delete()) {
                System.out.println("The deleted file is : "
                        + Obj.getName());
            }
            else {
                System.out.println(
                        "Failed in deleting the file.");
            }

            // FILE OPERATION
            System.out.println("File name: " + myFile.getName());
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("Writeable: " + myFile.canWrite());
            System.out.println("Readable " + myFile.canRead());
            System.out.println("File size in bytes " + myFile.length());
        }
        catch (Exception e){
        System.out.println(e);
        }


    }
}
