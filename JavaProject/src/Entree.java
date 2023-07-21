import com.toedter.calendar.JDateChooser;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Entree {
    void create(JTextField numEntree, JTextField numProd, JTextField stockEntree, JDateChooser dateEntree) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "insert into ENTREE values(?, ?, ?, ?);";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        String _numEntree = numEntree.getText();
        String _numProd = numProd.getText();
        String _stockEntree = stockEntree.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String _dateEntree  = sdf.format(dateEntree.getDate());
        java.sql.Date date = java.sql.Date.valueOf(_dateEntree);
        statement.setString(1, _numEntree);
        statement.setString(2, _numProd);
        statement.setInt(3, parseInt(_stockEntree));
        statement.setDate(4, date);
        int k = statement.executeUpdate();
        if(k==1){
            //System.out.println("Ajout en succes !");
            JOptionPane.showMessageDialog(null, "Ajout en succes !");
        }
        else{
            System.out.println("Ajout en echec !");
        }
        statement.close();
        conn.deconnecter();
    }
    
    ResultSet read() throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        Statement statement = conn.connection.createStatement();
        String query = "SELECT * FROM Entree order by numEntree";
        ResultSet resultSet = statement.executeQuery(query); 
        conn.deconnecter();
        return resultSet;
    }
    
    void update(JTextField numEntree, JTextField numProd, JTextField stockEntree, JDateChooser dateEntree) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "UPDATE Entree SET numProd = ?, stockEntree = ?,dateEntre = ?  WHERE numEntree = ?";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        statement.setString(1, numProd.getText());
        statement.setInt(2, parseInt(stockEntree.getText()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String _dateEntree  = sdf.format(dateEntree.getDate());
        java.sql.Date date = java.sql.Date.valueOf(_dateEntree);
        statement.setDate(3, date);
        statement.setString(4, numEntree.getText());
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
    
    void delete(String numEntree) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "DELETE FROM Entree WHERE numEntree = ?";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        statement.setString(1, numEntree);
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
    void loadId(JComboBox IdEntree) throws SQLException{
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        Statement statement = conn.connection.createStatement();
        String query = "SELECT numEntree FROM Entree order by numEntree";
        ResultSet resultSet = statement.executeQuery(query);
        IdEntree.removeAllItems();
        while(resultSet.next()){
            IdEntree.addItem(resultSet.getString("numEntree"));
        }
        conn.deconnecter();
    }
    void searchTuple(JComboBox IdEntree, JTextField numEntree, JTextField numProd, JTextField stockEntree, JDateChooser dateEntree) throws SQLException{
        
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String tableName = IdEntree.getSelectedItem().toString();
        String query = "SELECT * FROM Entree WHERE numEntree=" +"'" +tableName+"'";
        Statement statement = conn.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            numEntree.setText(resultSet.getString("numEntree"));
            numProd.setText(resultSet.getString("numProd"));
            stockEntree.setText(resultSet.getString("stockEntree"));
            dateEntree.setDate(new java.util.Date(resultSet.getDate("dateEntre").getTime()));
        }

        resultSet.close();
        statement.close();
        conn.deconnecter();
    }
    void Fetch(JTable Tableau) throws SQLException{
        ResultSet resEntree = this.read();
        
        DefaultTableModel df =(DefaultTableModel)Tableau.getModel();
        df.setRowCount(0);
        while(resEntree.next()){
            Vector v = new Vector();
            v.add(resEntree.getString("numEntree"));
            v.add(resEntree.getString("numProd"));
            v.add(resEntree.getString("stockEntree"));
            v.add(resEntree.getString("dateEntre"));
            df.addRow(v);
        }
    }
    void clear(JComboBox IdEntree, JTextField numEntree, JTextField numProd, JTextField stockEntree, JDateChooser dateEntree) {
        numEntree.setText("");
        numProd.setText("");
        dateEntree.setCalendar(null);
        stockEntree.setText("");
    }
}

