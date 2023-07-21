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

public class Service {
    void create(JTextField numServ, JTextField Serv, JTextField prix) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "insert into Service values(?, ?, ?);";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        String _numServ = numServ.getText();
        String _Serv  = Serv.getText();
        String _prix = prix.getText();
        statement.setString(1, _numServ);
        statement.setString(2, _Serv);
        statement.setInt(3, parseInt(_prix));
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
        String query = "SELECT * FROM Service order by numServ";
        ResultSet resultSet = statement.executeQuery(query); 
        conn.deconnecter();
        return resultSet;
    }
    
    void update(String numServ, String Serv, int prix) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "UPDATE Service SET Serv = ?, prix = ? WHERE numServ = ?";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        statement.setString(1, Serv);
        statement.setInt(2, prix);
        statement.setString(3, numServ);
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
    
    void delete(String numServ) throws SQLException {
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String sql = "DELETE FROM Service WHERE numServ = ?";
        PreparedStatement statement = conn.connection.prepareStatement(sql);
        statement.setString(1, numServ);
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
    void loadId(JComboBox IdServ) throws SQLException{
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        Statement statement = conn.connection.createStatement();
        String query = "SELECT numServ FROM Service order by numServ";
        ResultSet resultSet = statement.executeQuery(query);
        IdServ.removeAllItems();
        while(resultSet.next()){
            IdServ.addItem(resultSet.getString("numServ"));
        }
        conn.deconnecter();
    }
    void searchTuple(JComboBox IdServ, JTextField numServ, JTextField Serv, JTextField prix) throws SQLException{
        
        ConnexionDB conn = new ConnexionDB();
        conn.connecter();
        String tableName = IdServ.getSelectedItem().toString();
        String query = "SELECT * FROM Service WHERE numServ=" +"'" +tableName+"'";
        Statement statement = conn.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            numServ.setText(resultSet.getString("numServ"));
            Serv.setText(resultSet.getString("Serv"));
            prix.setText(resultSet.getString("prix"));
        }

        resultSet.close();
        statement.close();
        conn.deconnecter();
    }
    void Fetch(JTable tableau) throws SQLException{
        ResultSet resService = this.read();
        
        DefaultTableModel df =(DefaultTableModel)tableau.getModel();
        df.setRowCount(0);
        while(resService.next()){
            Vector v = new Vector();
            v.add(resService.getString("numServ"));
            v.add(resService.getString("Serv"));
            v.add(resService.getString("prix"));
            df.addRow(v);
        }
    }
    void clear(JTextField numServ, JTextField Serv, JTextField prix) {
        numServ.setText("");
        Serv.setText("");
        prix.setText("");
    }
}

