import com.toedter.calendar.JDateChooser;
import static java.lang.Integer.parseInt;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

 class Achat {
    void create(JTextField numAchat, JTextField numProd, JTextField nbrLitre, JTextField nomClient, JDateChooser dateAchat) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "insert into ACHAT values(?, ?, ?, ?, ?);";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        String _numAchat = numAchat.getText();
        String _numProd = numProd.getText();
        String _nomClient = nomClient.getText();
        String _nbrLitre = nbrLitre.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String _dateAchat  = sdf.format(dateAchat.getDate());
        java.sql.Date date = java.sql.Date.valueOf(_dateAchat);
        statement.setString(1, _numAchat);
        statement.setString(2, _numProd);
        statement.setString(3, _nomClient);
        statement.setInt(4, parseInt(_nbrLitre));
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
        String query = "SELECT * FROM Achat order by numAchat";
        ResultSet resultSet = statement.executeQuery(query); 
        conn.deconnecter();
        return resultSet;
    }
    
    void update(JTextField numAchat, JTextField numProd, JTextField nbrLitre, JTextField nomClient, JDateChooser dateAchat) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "UPDATE Achat SET numProd = ?, nomClient = ?, nbrLitre = ?, dateAchat = ?  WHERE numAchat = ?";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        statement.setString(1, numProd.getText());
        statement.setString(2, nomClient.getText());
        statement.setInt(3, parseInt(nbrLitre.getText()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String _dateAchat  = sdf.format(dateAchat.getDate());
        java.sql.Date date = java.sql.Date.valueOf(_dateAchat);
        statement.setDate(4, date);
        statement.setString(5, numAchat.getText());
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
    
    void delete(String numAchat) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "DELETE FROM Achat WHERE numAchat = ?";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        statement.setString(1, numAchat);
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
    void loadId(JComboBox IdAchat) throws SQLException{
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        Statement statement = conn.connection.createStatement();
        String query = "SELECT numAchat FROM Achat order by numAchat";
        ResultSet resultSet = statement.executeQuery(query);
        IdAchat.removeAllItems();
        while(resultSet.next()){
            IdAchat.addItem(resultSet.getString("numAchat"));
        }
        conn.deconnecter();
    }
    void searchTuple(JComboBox IdAchat, JTextField numAchat, JTextField numProd, JTextField nbrLitre, JTextField nomClient, JDateChooser dateAchat) throws SQLException{
        
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String tableName = IdAchat.getSelectedItem().toString();
        String query = "SELECT * FROM Achat WHERE numAchat=" +"'" +tableName+"'";
        Statement statement = conn.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            numAchat.setText(resultSet.getString("numAchat"));
            numProd.setText(resultSet.getString("numProd"));
            nomClient.setText(resultSet.getString("nomClient"));
            nbrLitre.setText(resultSet.getString("nbrLitre"));
            dateAchat.setDate(new java.util.Date(resultSet.getDate("dateAchat").getTime()));
        }

        resultSet.close();
        statement.close();
        conn.deconnecter();
    }
    void Fetch(JTable Tableau) throws SQLException{
        ResultSet resAchat = this.read();
        
        DefaultTableModel df =(DefaultTableModel)Tableau.getModel();
        df.setRowCount(0);
        while(resAchat.next()){
            Vector v = new Vector();
            v.add(resAchat.getString("numAchat"));
            v.add(resAchat.getString("numProd"));
            v.add(resAchat.getString("nomClient"));
            v.add(resAchat.getString("nbrLitre"));
            v.add(resAchat.getString("dateAchat"));
            df.addRow(v);
        }
    }
    void clear(JComboBox IdAchat, JTextField numAchat, JTextField numProd, JTextField nbrLitre, JTextField nomClient, JDateChooser dateAchat){
        numAchat.setText("");
        numProd.setText("");
        nomClient.setText("");
        nbrLitre.setText("");
        dateAchat.setCalendar(null);
    }
    void searchClient(String nomClient, JTable Tableau) throws SQLException{
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        Statement statement = conn.connection.createStatement();
        String query = "SELECT * FROM Achat WHERE UPPER(nomClient) LIKE UPPER('%"+nomClient+"%') order by numAchat";
        ResultSet resAchat = statement.executeQuery(query); 
        DefaultTableModel df =(DefaultTableModel)Tableau.getModel();
        df.setRowCount(0);
        while(resAchat.next()){
            Vector v = new Vector();
            v.add(resAchat.getString("numAchat"));
            v.add(resAchat.getString("numProd"));
            v.add(resAchat.getString("nomClient"));
            v.add(resAchat.getString("nbrLitre"));
            v.add(resAchat.getString("dateAchat"));
            df.addRow(v);
        }
        conn.deconnecter();
    }
}

