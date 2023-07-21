import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Entretien {
    void create(JTextField numEntr, JTextField numServ, JTextField immatriculation_voiture, JTextField nomClient, JDateChooser dateEntretien) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "insert into Entretien values(?, ?, ?, ?, ?);";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        String _numEntr = numEntr.getText();
        String _numServ = numServ.getText();
        String _nomClient = nomClient.getText();
        String _immatriculation_voiture = immatriculation_voiture.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String _dateEntretien  = sdf.format(dateEntretien.getDate());
        java.sql.Date date = java.sql.Date.valueOf(_dateEntretien);
        statement.setString(1, _numEntr);
        statement.setString(2, _numServ);
        statement.setString(3, _immatriculation_voiture);
        statement.setString(4, _nomClient);
        statement.setDate(5, date);
        int k = statement.executeUpdate();
        if(k==1){
            //System.out.println("Ajout en succes !");
            JOptionPane.showMessageDialog(null, "Ajout en succes !");
        }
        else{
            JOptionPane.showMessageDialog(null, "Ajout en echec !");
        }
        statement.close();
        conn.deconnecter();
    }
    
    ResultSet read() throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        Statement statement = conn.connection.createStatement();
        String query = "SELECT * FROM Entretien order by numEntr";
        ResultSet resultSet = statement.executeQuery(query); 
        conn.deconnecter();
        return resultSet;
    }
    
    void update(JTextField numEntr, JTextField numServ, JTextField immatriculation_voiture, JTextField nomClient, JDateChooser dateEntretien) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "UPDATE Entretien SET numServ = ?, nomClient = ?, immatriculation_voiture = ?, dateEntretien = ?  WHERE numEntr = ?";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        statement.setString(1, numServ.getText());
        statement.setString(2, nomClient.getText());
        statement.setString(3, immatriculation_voiture.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String _dateEntretien  = sdf.format(dateEntretien.getDate());
        java.sql.Date date = java.sql.Date.valueOf(_dateEntretien);
        statement.setDate(4, date);
        statement.setString(5, numEntr.getText());
        int k = statement.executeUpdate();
        if(k==1){
            //System.out.println("Ajout en succes !");
            JOptionPane.showMessageDialog(null, "Mis à jour en succes !");
        }
        else{
            System.out.println("Ajout en echec !");
        }
        statement.close();
        conn.deconnecter();
    }
    
    void delete(String numEntr) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "DELETE FROM Entretien WHERE numEntr = ?";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        statement.setString(1, numEntr);
        int k = statement.executeUpdate();
        if(k==1){
            //System.out.println("Ajout en succes !");
            JOptionPane.showMessageDialog(null, "Suppression en succes !");
        }
        else{
            System.out.println("Ajout en echec !");
        }
        statement.close();
        conn.deconnecter();
    }
    void loadId(JComboBox IdEntretien) throws SQLException{
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        Statement statement = conn.connection.createStatement();
        String query = "SELECT numEntr FROM Entretien order by numEntr";
        ResultSet resultSet = statement.executeQuery(query);
        IdEntretien.removeAllItems();
        while(resultSet.next()){
            IdEntretien.addItem(resultSet.getString("numEntr"));
        }
        conn.deconnecter();
    }
    void searchTuple(JComboBox IdEntretien, JTextField numEntr, JTextField numServ, JTextField immatriculation_voiture, JTextField nomClient, JDateChooser dateEntretien) throws SQLException{
        
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String tableName = IdEntretien.getSelectedItem().toString();
        String query = "SELECT * FROM Entretien WHERE numEntr=" +"'" +tableName+"'";
        Statement statement = conn.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            numEntr.setText(resultSet.getString("numEntr"));
            numServ.setText(resultSet.getString("numServ"));
            nomClient.setText(resultSet.getString("nomClient"));
            immatriculation_voiture.setText(resultSet.getString("immatriculation_voiture"));
            dateEntretien.setDate(new java.util.Date(resultSet.getDate("dateEntretien").getTime()));
        }

        resultSet.close();
        statement.close();
        conn.deconnecter();
    }
    void Fetch(JTable Tableau) throws SQLException{
        ResultSet resEntretien = this.read();
        
        DefaultTableModel df =(DefaultTableModel)Tableau.getModel();
        df.setRowCount(0);
        while(resEntretien.next()){
            Vector v = new Vector();
            v.add(resEntretien.getString("numEntr"));
            v.add(resEntretien.getString("numServ"));
            v.add(resEntretien.getString("immatriculation_voiture"));
            v.add(resEntretien.getString("nomClient"));
            v.add(resEntretien.getString("dateEntretien"));
            df.addRow(v);
        }
    }
    void clear(JComboBox IdEntretien, JTextField numEntr, JTextField numServ, JTextField immatriculation_voiture, JTextField nomClient, JDateChooser dateEntretien){
        numEntr.setText("");
        numServ.setText("");
        nomClient.setText("");
        immatriculation_voiture.setText("");
        dateEntretien.setCalendar(null);
    }
    void searchClient(String nomClient, JTable Tableau) throws SQLException{
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        Statement statement = conn.connection.createStatement();
        String query = "SELECT * FROM Entretien WHERE UPPER(nomClient) LIKE UPPER('%"+nomClient+"%') order by numEntr";
        ResultSet resEntretien = statement.executeQuery(query); 
        DefaultTableModel df =(DefaultTableModel)Tableau.getModel();
        df.setRowCount(0);
        while(resEntretien.next()){
            Vector v = new Vector();
            v.add(resEntretien.getString("numEntr"));
            v.add(resEntretien.getString("numServ"));
            v.add(resEntretien.getString("immatriculation_voiture"));
            v.add(resEntretien.getString("nomClient"));
            v.add(resEntretien.getString("dateEntretien"));
            df.addRow(v);
        }
        conn.deconnecter();
    }
    void generateRecuPdf(JTable Tableau, JButton buttonPDF) throws DocumentException{
        ArrayList<Object[]> selectedData = new ArrayList<>();
        Tableau.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Tableau.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                buttonPDF.setEnabled(true);
            }
        });
        buttonPDF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] selectedRows = Tableau.getSelectedRows();

                // Récupérer les données des lignes sélectionnées
                
                for (int row : selectedRows) {
                    Object[] rowData = new Object[Tableau.getColumnCount()+2];
                    for (int col = 0; col <= Tableau.getColumnCount(); col++) {
                        if(col == Tableau.getColumnCount()){
                            ConnexionDB conn = new ConnexionDB();
                            conn.connecter();
                            Statement statement;
                            try {
                                statement = conn.connection.createStatement();
                                String query = "SELECT Prix,Serv FROM Service WHERE numServ = '"+rowData[1]+"';";
                                ResultSet resEntretien = statement.executeQuery(query); 
                                resEntretien.next();
                                //System.out.println(resEntretien.getInt("Recette"));
                                conn.deconnecter();
                                rowData[col] = resEntretien.getString("Serv");
                                rowData[col+1] = resEntretien.getInt("prix");
                            } catch (SQLException ex) {
                                Logger.getLogger(Entretien.class.getName()).log(Level.SEVERE, null, ex);
                            }   
                        }
                            
                        else
                            rowData[col] = Tableau.getValueAt(row, col);
                    }
                    selectedData.add(rowData);
                }
                //GENERATE PDF --------------------------------------------
                    /*String path = "";
                    JFileChooser j = new JFileChooser();
                    j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    int x = j.showSaveDialog(j);

                    if(x==JFileChooser.APPROVE_OPTION){
                        path = j.getSelectedFile().getPath();
                    }

                    Document doc = new Document();
                    String date = (String) selectedData.get(0)[4];
                    String nomClient = (String) selectedData.get(0)[3];
                    String immatVoiture = (String) selectedData.get(0)[2];
                    int Total = 0;
                    try {
                        PdfWriter.getInstance( doc, new FileOutputStream(path+"/recu.pdf"));
                        doc.open();
                        /*Paragraph dateParagraph = new Paragraph("Date : "+date.toString());
                        doc.add(dateParagraph);
                        Paragraph nomClientParagraph = new Paragraph("Nom du Client : "+nomClient.toString());
                        doc.add(nomClientParagraph);
                        Paragraph immatVoitureParagraph = new Paragraph("Voiture : "+immatVoiture.toString());
                        doc.add(immatVoitureParagraph);
                        PdfPTable tbl = new PdfPTable(2);

                        tbl.addCell("Service");
                        tbl.addCell("Montant");

                        for (Object[] rowData1 : selectedData) {
                            tbl.addCell( rowData1[5].toString());
                            tbl.addCell( rowData1[6].toString()+" Ar");
                            Total+=parseInt(rowData1[6].toString());
                        }

                        String total = "" + Total;
                        tbl.addCell("Total");
                        tbl.addCell(total+" Ar");

                        doc.add(tbl);

                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(PdfGenerator.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (DocumentException ex) {
                        Logger.getLogger(Entretien.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    doc.close();*/
                    System.out.println(selectedData.get(0)[0]);
            }
        });
        
    }

    void recetteEntretien(JLabel recetteTotal) throws SQLException{
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        Statement statement = conn.connection.createStatement();
        String query = "SELECT SUM(Service.PRIX) AS Recette FROM Entretien LEFT JOIN Service ON Entretien.numServ = Service.numServ;";
        ResultSet resEntretien = statement.executeQuery(query); 
        resEntretien.next();
        //System.out.println(resEntretien.getInt("Recette"));
        recetteTotal.setText(resEntretien.getString("Recette")+" Ar");
        conn.deconnecter();
    }
}

