import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


public class PdfGenerator {
    void GenerateRecu() throws DocumentException {
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(j);
        
        if(x==JFileChooser.APPROVE_OPTION){
            path = j.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        try {
            PdfWriter.getInstance( doc, new FileOutputStream(path+"/recu.pdf"));
            
            doc.open();
            PdfPTable tbl = new PdfPTable(2);
            
            tbl.addCell("Service");
            tbl.addCell("Montant");
            
            tbl.addCell("Lavage");
            tbl.addCell("12000");
            
            doc.add(tbl);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PdfGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();
    }
}
