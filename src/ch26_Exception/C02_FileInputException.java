package ch26_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputException {
    public static void main(String[] args) throws IOException {

        String filePath = "/Users/rumeysaarsevenoglu/IdeaProjects/JavaTutorial/src/java lava";

        FileInputStream fis = new FileInputStream(filePath);

        int c ;
        while ((c = fis.read()) != -1){
            System.out.print((char)c);
        }

        System.out.println();
        System.out.println("fis = " + fis);


    }




}