/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first;

/**
 *
 * @author Asus
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class JSONBookMetadataExporter extends BookMetadataExporter{
    @Override
    public void export(PrintStream stream) throws IOException {
        ArrayList<Book> bookList = super.getBookList();
        JSONBookMetadataFormatter jsonFormatter = new JSONBookMetadataFormatter();
        FileWriter file = null;
        for (Book book : bookList){
            jsonFormatter.append(book);
        }
        try{
            file = new FileWriter("jsonText.txt");
            file.write(jsonFormatter.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            file.flush();
            file.close();
        }
    }
}