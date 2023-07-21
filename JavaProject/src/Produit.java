import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class Produit {
    void create(JTextField numProd, JTextField design, JTextField stock) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "insert into PRODUIT values(?, ?, ?);";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        String _numProd = numProd.getText();
        String _design  = design.getText();
        String _stock = stock.getText();
        statement.setString(1, _numProd);
        statement.setString(2, _design);
        statement.setInt(3, parseInt(_stock));
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
        String query = "SELECT * FROM Produit order by numProd";
        ResultSet resultSet = statement.executeQuery(query); 
        conn.deconnecter();
        return resultSet;
    }
    
    void update(String numProd, String design, int stock) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "UPDATE Produit SET design = ?, stock = ? WHERE numProd = ?";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        statement.setString(1, design);
        statement.setInt(2, stock);
        statement.setString(3, numProd);
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
    
    void delete(String numProd) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "DELETE FROM Produit WHERE numProd = ?";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        statement.setString(1, numProd);
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
    void loadId(JComboBox IdProd) throws SQLException{
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        Statement statement = conn.connection.createStatement();
        String query = "SELECT numProd FROM Produit order by numProd";
        ResultSet resultSet = statement.executeQuery(query);
        IdProd.removeAllItems();
        while(resultSet.next()){
            IdProd.addItem(resultSet.getString("numProd"));
        }
        conn.deconnecter();
    }
    void searchTuple(JComboBox IdProd, JTextField numProd, JTextField design, JTextField stock) throws SQLException{
        
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String tableName = IdProd.getSelectedItem().toString();
        String query = "SELECT * FROM Produit WHERE numProd=" +"'" +tableName+"'";
        Statement statement = conn.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            numProd.setText(resultSet.getString("numProd"));
            design.setText(resultSet.getString("design"));
            stock.setText(resultSet.getString("stock"));
        }

        resultSet.close();
        statement.close();
        conn.deconnecter();
    }
    void Fetch(JTable tableau) throws SQLException{
        ResultSet resProduit = this.read();
        
        DefaultTableModel df =(DefaultTableModel)tableau.getModel();
        df.setRowCount(0);
        while(resProduit.next()){
            Vector v = new Vector();
            v.add(resProduit.getString("numProd"));
            v.add(resProduit.getString("design"));
            v.add(resProduit.getString("stock"));
            df.addRow(v);
        }
    }
    void clear(JTextField numProd, JTextField design, JTextField stock) {
        numProd.setText("");
        design.setText("");
        stock.setText("");
    }
    void signalMoinDe10Litre() throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String query = "SELECT design FROM Produit WHERE stock < 10";
        Statement statement = conn.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String design = resultSet.getString("design");
            System.out.println(design+ ": moin de 10 Litre");
            JOptionPane.showMessageDialog(null, design + ": moin de 10 Litre", "Alert", JOptionPane.WARNING_MESSAGE);
        }

        resultSet.close();
        statement.close();
        conn.deconnecter();
    }
}

