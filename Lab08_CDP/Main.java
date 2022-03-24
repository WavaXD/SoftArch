package first;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, XMLStreamException {

        
        // Current usage
        /*BookMetadataFormatter formatter = null;
        try {
            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.JSON);
            formatter.append(TestData.dragonBook);
            formatter.append(TestData.dinosaurBook);
            System.out.print(formatter.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }*/

          BookMetadataExporter jsonExporter = new JSONBookMetadataExporter();
          jsonExporter.add(TestData.dragonBook);
          jsonExporter.add(TestData.dinosaurBook);
          jsonExporter.export(System.out);
          
          BookMetadataExporter xmlExporter = new XMLBookMetadataExporter();
          xmlExporter.add(TestData.dragonBook);
          xmlExporter.add(TestData.dinosaurBook);
          xmlExporter.export(System.out);

          BookMetadataExporter csvExporter = new CSVBookMetadataExporter();
          csvExporter.add(TestData.dragonBook);
          csvExporter.add(TestData.dinosaurBook);
          csvExporter.export(System.out);
    }
}
