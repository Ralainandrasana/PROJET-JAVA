import java.sql.*;

public class ConnexionDB {
    String jdbcURL = "jdbc:postgresql://localhost:5432/Projet_Java";
        String username = "postgres";
        String password = "mijoro";
        Connection connection = null;

    public void connecter() {  
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);
            if (connection != null) {
                System.out.println("Connexion réussie à la base de données PostgreSQL !");  
            }
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Pilote PostgreSQL introuvable !");
        } 
        catch (SQLException e) {
            System.out.println("Erreur lors de la connexion à la base de données !");
        }
    }
    
    public void deconnecter() throws SQLException{
        if (connection != null){
            connection.close();
        }
    }
}
