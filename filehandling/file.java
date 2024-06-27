package filehandling;
import java.io.*;

public class file {
    public static void main(String[] args) throws IOException {
        File myfile = new File("data.txt");
        try {
            if (myfile.createNewFile()) {
                System.out.println("file create successfully");
            }
        }catch (Exception e){
            System.out.println(e);
        }

        //writing in the created file
        FileWriter writer = new FileWriter(myfile);
        writer.write("The Basic file created for example");
        writer.close();

        //reading an file
        FileReader reader = new FileReader("data.txt");
        int r;
        while((r = reader.read())!= -1){
            System.out.println((char)r);
        }
        reader.close();

        // check file exists
        try{
            if(myfile.exists()){
                System.out.println("fie already exists");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        //delete the file

        try{
            if(myfile.delete()){
                System.out.println("file deleted successfully");
            }
        }catch (Exception a){
            System.out.println(a + "file is not deleted");
        }
    }
}
