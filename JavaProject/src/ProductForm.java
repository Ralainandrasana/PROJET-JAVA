
import com.itextpdf.text.DocumentException;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ProductForm extends javax.swing.JFrame {
    Produit Prod = new Produit();
    Entree Entr = new Entree();
    Achat Ach = new Achat();
    Service service = new Service();
    Entretien Ett = new Entretien();
    
    public ProductForm() throws SQLException, DocumentException {
        initComponents();
        Prod.loadId(IdSelectProduit);
        Prod.Fetch(TableauProduit);
        
        Entr.loadId(IdSelectEntree);
        Entr.Fetch(TableauEntree);
        
        Ach.loadId(IdSelectAchat);
        Ach.Fetch(TableauAchat);
        
        service.loadId(IdSelectService);
        service.Fetch(TableauService);
        
        Ett.loadId(IdSelectEntretien);
        Ett.Fetch(TableauEntretien);
        Ett.recetteEntretien(recetteTotal);
        Ett.generateRecuPdf(TableauAchat, PDFbutton);
        
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        recetteTotal = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableauProduit = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        numProd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        design = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAddProduit = new javax.swing.JButton();
        btnSupprimerProduit = new javax.swing.JButton();
        btnUpdateProduit = new javax.swing.JButton();
        btnNewProduit = new javax.swing.JButton();
        IdSelectProduit = new javax.swing.JComboBox<>();
        btnAfficherProduit = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TableauEntree = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        numProdEntree = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        btnAddEntree = new javax.swing.JButton();
        btnSupprimerEntree = new javax.swing.JButton();
        btnUpdateEntree = new javax.swing.JButton();
        btnNewEntree = new javax.swing.JButton();
        IdSelectEntree = new javax.swing.JComboBox<>();
        btnAfficherEntree = new javax.swing.JButton();
        numEntree = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        stockEntree = new javax.swing.JTextField();
        dateEntree = new com.toedter.calendar.JDateChooser();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TableauAchat = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        numProdAchat = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        btnAddAchat = new javax.swing.JButton();
        btnDeleteAchat = new javax.swing.JButton();
        btnUpdateAchat = new javax.swing.JButton();
        btnnewAchat = new javax.swing.JButton();
        searchCustomersName = new javax.swing.JTextField();
        btnFindAchat = new javax.swing.JButton();
        IdSelectAchat = new javax.swing.JComboBox<>();
        btnReadAchat = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        numAchat = new javax.swing.JTextField();
        nbrLitre = new javax.swing.JTextField();
        nomClient = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        dateAchat = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TableauService = new javax.swing.JTable();
        numServ = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnAddService = new javax.swing.JButton();
        btnDeleteService = new javax.swing.JButton();
        btnUpdateService = new javax.swing.JButton();
        btnNewService = new javax.swing.JButton();
        IdSelectService = new javax.swing.JComboBox<>();
        btnReadService = new javax.swing.JButton();
        Serv = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        prix = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableauEntretien = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        numEntr = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        numServEntr = new javax.swing.JTextField();
        immatVoiture = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAddEntretien = new javax.swing.JButton();
        btnDeleteEntretien = new javax.swing.JButton();
        btnUpdateEntretien = new javax.swing.JButton();
        btnNewEntretien = new javax.swing.JButton();
        searchClient = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        IdSelectEntretien = new javax.swing.JComboBox<>();
        btnReadEntretien = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nomClientEntr = new javax.swing.JTextField();
        dateEntretien = new com.toedter.calendar.JDateChooser();
        PDFbutton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(12, 166, 105));
        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION STATION ESSENCE");
        jLabel1.setOpaque(true);

        jPanel6.setBackground(new java.awt.Color(250, 252, 254));

        jPanel2.setBackground(new java.awt.Color(12, 166, 105));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(12, 166, 105));

        jLabel17.setFont(new java.awt.Font("FreeMono", 3, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(181, 228, 210));
        jLabel17.setText("2.  RABARY Koto");

        jLabel18.setFont(new java.awt.Font("FreeMono", 3, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(181, 228, 210));
        jLabel18.setText("1.  RAKOTO Paul");

        jLabel19.setFont(new java.awt.Font("FreeMono", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(181, 228, 210));
        jLabel19.setText("3.  ZANAKALA Bema");

        jLabel20.setFont(new java.awt.Font("FreeMono", 3, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(181, 228, 210));
        jLabel20.setText("4.  VOAVY Paulin");

        jLabel21.setFont(new java.awt.Font("FreeMono", 3, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(181, 228, 210));
        jLabel21.setText("5.  PHILLIPE Jean");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel3.setText("Histogramme");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel5.setText("Recette Total");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel4.setText("top 5 Client");

        jPanel10.setBackground(new java.awt.Color(12, 166, 105));

        recetteTotal.setFont(new java.awt.Font("FreeMono", 3, 13)); // NOI18N
        recetteTotal.setForeground(new java.awt.Color(181, 228, 210));
        recetteTotal.setText("1,000,000 Ar");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(recetteTotal)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(recetteTotal)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(75, 75, 75))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(483, 483, 483))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(53, 53, 53))
        );

        jTabbedPane1.setBackground(new java.awt.Color(181, 228, 210));
        jTabbedPane1.setForeground(new java.awt.Color(12, 166, 105));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setRequestFocusEnabled(false);
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(250, 252, 254));
        jPanel5.setAlignmentX(2.0F);
        jPanel5.setAlignmentY(2.0F);
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setDoubleBuffered(false);
        jPanel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel5FocusGained(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        TableauProduit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "numProd", "design", "stock"
            }
        ));
        TableauProduit.setFocusable(false);
        TableauProduit.setRowHeight(25);
        TableauProduit.setRowMargin(10);
        TableauProduit.setSelectionBackground(new java.awt.Color(181, 228, 210));
        TableauProduit.setSelectionForeground(new java.awt.Color(12, 166, 105));
        TableauProduit.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableauProduit);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );

        jLabel6.setForeground(new java.awt.Color(12, 166, 105));
        jLabel6.setText("numProd");

        numProd.setForeground(new java.awt.Color(242, 112, 98));

        jLabel7.setForeground(new java.awt.Color(12, 166, 105));
        jLabel7.setText("design");

        design.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(12, 166, 105));
        jLabel8.setText("stock");

        jLabel11.setText("Produit");

        btnAddProduit.setBackground(new java.awt.Color(229, 242, 255));
        btnAddProduit.setForeground(new java.awt.Color(12, 166, 105));
        btnAddProduit.setText("Ajouter");
        btnAddProduit.setFocusable(false);
        btnAddProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProduitActionPerformed(evt);
            }
        });

        btnSupprimerProduit.setBackground(new java.awt.Color(229, 242, 255));
        btnSupprimerProduit.setForeground(new java.awt.Color(12, 166, 105));
        btnSupprimerProduit.setText("Supprimer");
        btnSupprimerProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerProduitActionPerformed(evt);
            }
        });

        btnUpdateProduit.setBackground(new java.awt.Color(229, 242, 255));
        btnUpdateProduit.setForeground(new java.awt.Color(12, 166, 105));
        btnUpdateProduit.setText("Editer");
        btnUpdateProduit.setFocusable(false);
        btnUpdateProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProduitActionPerformed(evt);
            }
        });

        btnNewProduit.setBackground(new java.awt.Color(229, 242, 255));
        btnNewProduit.setForeground(new java.awt.Color(12, 166, 105));
        btnNewProduit.setText("Nouveau");
        btnNewProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProduitActionPerformed(evt);
            }
        });

        IdSelectProduit.setBackground(new java.awt.Color(229, 242, 255));
        IdSelectProduit.setForeground(new java.awt.Color(242, 112, 98));
        IdSelectProduit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        IdSelectProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdSelectProduitActionPerformed(evt);
            }
        });

        btnAfficherProduit.setBackground(new java.awt.Color(229, 242, 255));
        btnAfficherProduit.setForeground(new java.awt.Color(12, 166, 105));
        btnAfficherProduit.setText("Afficher");
        btnAfficherProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherProduitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(design, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stock, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddProduit)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdateProduit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSupprimerProduit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewProduit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                        .addComponent(IdSelectProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAfficherProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProduit)
                    .addComponent(btnUpdateProduit)
                    .addComponent(btnNewProduit)
                    .addComponent(IdSelectProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAfficherProduit)
                    .addComponent(btnSupprimerProduit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(design, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Produit", jPanel5);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        TableauEntree.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "numEntree", "numProd", "stockEntree", "dateEntree"
            }
        ));
        jScrollPane9.setViewportView(TableauEntree);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel39.setText("numEntree");

        numProdEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numProdEntreeActionPerformed(evt);
            }
        });

        jLabel40.setText("stockEntree");

        jLabel42.setText("Entree");

        btnAddEntree.setText("Ajouter");
        btnAddEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEntreeActionPerformed(evt);
            }
        });

        btnSupprimerEntree.setText("Supprimer");
        btnSupprimerEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerEntreeActionPerformed(evt);
            }
        });

        btnUpdateEntree.setText("Editer");
        btnUpdateEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEntreeActionPerformed(evt);
            }
        });

        btnNewEntree.setText("Nouveau");
        btnNewEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewEntreeActionPerformed(evt);
            }
        });

        IdSelectEntree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAfficherEntree.setText("Afficher");
        btnAfficherEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherEntreeActionPerformed(evt);
            }
        });

        jLabel41.setText("numProd");

        jLabel43.setText("dateEntree");

        stockEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockEntreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numProdEntree, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numEntree, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(stockEntree)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel43))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dateEntree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(btnAddEntree)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdateEntree)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSupprimerEntree)
                        .addGap(12, 12, 12)
                        .addComponent(btnNewEntree)
                        .addGap(515, 515, 515))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IdSelectEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAfficherEntree, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSupprimerEntree, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddEntree)
                        .addComponent(btnUpdateEntree)
                        .addComponent(btnNewEntree)
                        .addComponent(IdSelectEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAfficherEntree)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numProdEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stockEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Entree", jPanel22);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        TableauAchat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "numAchat", "numProd", "nomClient", "nbrLitre", "dateAchat"
            }
        ));
        jScrollPane8.setViewportView(TableauAchat);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel35.setText("numAchat");

        numProdAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numProdAchatActionPerformed(evt);
            }
        });

        jLabel38.setText("Achat");

        btnAddAchat.setText("Ajouter");
        btnAddAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAchatActionPerformed(evt);
            }
        });

        btnDeleteAchat.setText("Supprimer");
        btnDeleteAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAchatActionPerformed(evt);
            }
        });

        btnUpdateAchat.setText("Editer");
        btnUpdateAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAchatActionPerformed(evt);
            }
        });

        btnnewAchat.setText("Nouveau");
        btnnewAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewAchatActionPerformed(evt);
            }
        });

        searchCustomersName.setText("Nom Client...");
        searchCustomersName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomersNameActionPerformed(evt);
            }
        });

        btnFindAchat.setText("Trouver");
        btnFindAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAchatActionPerformed(evt);
            }
        });

        IdSelectAchat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnReadAchat.setText("Afficher");
        btnReadAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadAchatActionPerformed(evt);
            }
        });

        jLabel37.setText("nbrLitre");

        numAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAchatActionPerformed(evt);
            }
        });

        nbrLitre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbrLitreActionPerformed(evt);
            }
        });

        jLabel44.setText("nomClient");

        jLabel45.setText("numProd");

        jLabel46.setText("dateAchat");

        jButton2.setText("Actualiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel44)
                    .addComponent(numAchat, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jLabel37)
                    .addComponent(nbrLitre, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel45)
                    .addComponent(numProdAchat, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(nomClient, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jLabel46)
                    .addComponent(dateAchat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                .addComponent(btnAddAchat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdateAchat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteAchat)
                                .addGap(12, 12, 12)
                                .addComponent(btnnewAchat))
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(IdSelectAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReadAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(searchCustomersName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFindAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(btnFindAchat)
                    .addComponent(searchCustomersName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteAchat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddAchat)
                        .addComponent(btnUpdateAchat)
                        .addComponent(btnnewAchat)
                        .addComponent(IdSelectAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReadAchat)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numProdAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nbrLitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Achat", jPanel20);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        TableauService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "numServ", "serv", "prix"
            }
        ));
        jScrollPane7.setViewportView(TableauService);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel32.setText("serv");

        jLabel34.setText("Service");

        btnAddService.setText("Ajouter");
        btnAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServiceActionPerformed(evt);
            }
        });

        btnDeleteService.setText("Supprimer");
        btnDeleteService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteServiceActionPerformed(evt);
            }
        });

        btnUpdateService.setText("Editer");
        btnUpdateService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateServiceActionPerformed(evt);
            }
        });

        btnNewService.setText("Nouveau");
        btnNewService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewServiceActionPerformed(evt);
            }
        });

        IdSelectService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnReadService.setText("Afficher");
        btnReadService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadServiceActionPerformed(evt);
            }
        });

        jLabel36.setText("prix");

        jLabel33.setText("numServ");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(numServ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                                .addComponent(btnAddService)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdateService)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteService)
                                .addGap(12, 12, 12)
                                .addComponent(btnNewService))
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IdSelectService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReadService, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteService, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddService)
                        .addComponent(btnUpdateService)
                        .addComponent(btnNewService)
                        .addComponent(IdSelectService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReadService)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Service", jPanel18);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        TableauEntretien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "numEntr", "numServ", "immatVoiture", "nomClient", "dateEntretien"
            }
        ));
        TableauEntretien.setFocusable(false);
        jScrollPane2.setViewportView(TableauEntretien);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );

        jLabel10.setText("numEntr");

        jLabel12.setText("numServ");

        numServEntr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numServEntrActionPerformed(evt);
            }
        });

        immatVoiture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immatVoitureActionPerformed(evt);
            }
        });

        jLabel13.setText("immatVoiture");

        jLabel14.setText("Entretien");

        btnAddEntretien.setText("Ajouter");
        btnAddEntretien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEntretienActionPerformed(evt);
            }
        });

        btnDeleteEntretien.setText("Supprimer");
        btnDeleteEntretien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEntretienActionPerformed(evt);
            }
        });

        btnUpdateEntretien.setText("Editer");
        btnUpdateEntretien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEntretienActionPerformed(evt);
            }
        });

        btnNewEntretien.setText("Nouveau");
        btnNewEntretien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewEntretienActionPerformed(evt);
            }
        });

        searchClient.setText("Nom Client...");
        searchClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchClientActionPerformed(evt);
            }
        });

        jButton12.setText("Trouver");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        IdSelectEntretien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnReadEntretien.setText("Afficher");
        btnReadEntretien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadEntretienActionPerformed(evt);
            }
        });

        jLabel15.setText("nomClient");

        jLabel16.setText("dateEntretien");

        nomClientEntr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomClientEntrActionPerformed(evt);
            }
        });

        PDFbutton.setBackground(new java.awt.Color(242, 112, 98));
        PDFbutton.setForeground(new java.awt.Color(255, 255, 255));
        PDFbutton.setText("PDF");
        PDFbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFbuttonActionPerformed(evt);
            }
        });

        jButton3.setText("Actualiser");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nomClientEntr, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(numServEntr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(numEntr, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(immatVoiture)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(dateEntretien, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 71, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnAddEntretien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdateEntretien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteEntretien)
                                .addGap(12, 12, 12)
                                .addComponent(btnNewEntretien)
                                .addGap(515, 515, 515))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3)
                                        .addGap(28, 28, 28)
                                        .addComponent(searchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(PDFbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(139, 139, 139)
                                        .addComponent(IdSelectEntretien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnReadEntretien, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jButton12)
                    .addComponent(searchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteEntretien, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddEntretien)
                        .addComponent(btnUpdateEntretien)
                        .addComponent(btnNewEntretien)
                        .addComponent(IdSelectEntretien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReadEntretien)
                        .addComponent(PDFbutton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numEntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numServEntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(immatVoiture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomClientEntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateEntretien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Entretien", jPanel8);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel2.setText("@marsonmijoro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfficherProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficherProduitActionPerformed
        try {
            // TODO add your handling code here:
            Prod.searchTuple(IdSelectProduit, numProd, design, stock);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAfficherProduitActionPerformed

    private void btnUpdateProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProduitActionPerformed
        try {
            // TODO add your handling code here:
            Prod.update(numProd.getText().toString(), design.getText().toString(), parseInt(stock.getText()));
            Prod.loadId(IdSelectProduit);
            Prod.clear(numProd, design, stock);
            Prod.Fetch(TableauProduit);
            Prod.signalMoinDe10Litre();

        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateProduitActionPerformed

    private void btnSupprimerProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerProduitActionPerformed
        try {
            // TODO add your handling code here:
            Prod.delete(numProd.getText().toString());
            Prod.loadId(IdSelectProduit);
            Prod.clear(numProd, design, stock);
            Prod.Fetch(TableauProduit);
            Prod.signalMoinDe10Litre();
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSupprimerProduitActionPerformed

    private void btnAddProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProduitActionPerformed
        // TODO add your handling code here:
        try {
            Prod.create(numProd, design, stock);
            Prod.clear(numProd, design, stock);
            Prod.loadId(IdSelectProduit);
            Prod.Fetch(TableauProduit);
            Prod.signalMoinDe10Litre();
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddProduitActionPerformed

    private void designActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designActionPerformed

    private void numServEntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numServEntrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numServEntrActionPerformed

    private void btnAddEntretienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEntretienActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Ett.create(numEntr, numServEntr, immatVoiture, nomClientEntr, dateEntretien);
            Ett.loadId(IdSelectEntretien);
            Ett.clear(IdSelectEntretien, numEntr, numServEntr, immatVoiture, nomClientEntr, dateEntretien);
            Ett.Fetch(TableauEntretien);
            Ett.recetteEntretien(recetteTotal);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddEntretienActionPerformed

    private void btnDeleteEntretienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEntretienActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Ett.delete(numEntr.getText().toString());
            Ett.loadId(IdSelectEntretien);
            Ett.clear(IdSelectEntretien, numEntr, numServEntr, immatVoiture, nomClientEntr, dateEntretien);
            Ett.Fetch(TableauEntretien);
            Ett.recetteEntretien(recetteTotal);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteEntretienActionPerformed

    private void btnUpdateEntretienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEntretienActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Ett.update(numEntr, numServEntr, immatVoiture, nomClientEntr, dateEntretien);
            Ett.loadId(IdSelectEntretien);
            Ett.clear(IdSelectEntretien, numEntr, numServEntr, immatVoiture, nomClientEntr, dateEntretien);
            Ett.Fetch(TableauEntretien);
            Ett.recetteEntretien(recetteTotal);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateEntretienActionPerformed

    private void searchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchClientActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
           Ett.searchClient(searchClient.getText().toString(), TableauEntretien);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnReadEntretienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadEntretienActionPerformed
        // TODO add your handling code here:
        try {
            Ett.searchTuple(IdSelectEntretien, numEntr,  numServEntr, immatVoiture,  nomClientEntr,  dateEntretien);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReadEntretienActionPerformed

    private void btnAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServiceActionPerformed
        // TODO add your handling code here:
        try {
            service.create(numServ, Serv, prix);
            service.clear(numServ, Serv, prix);
            service.loadId(IdSelectService);
            service.Fetch(TableauService);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddServiceActionPerformed

    private void btnDeleteServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteServiceActionPerformed
        // TODO add your handling code here:
        try {
            service.delete(numServ.getText().toString());
            service.clear(numServ, Serv, prix);
            service.loadId(IdSelectService);
            service.Fetch(TableauService);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteServiceActionPerformed

    private void btnUpdateServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateServiceActionPerformed
        // TODO add your handling code here:
        try {
            service.update(numServ.getText().toString(), Serv.getText().toString(), parseInt(prix.getText().toString()));
            service.clear(numServ, Serv, prix);
            service.loadId(IdSelectService);
            service.Fetch(TableauService);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateServiceActionPerformed

    private void btnReadServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadServiceActionPerformed
        try {
            // TODO add your handling code here:
            service.searchTuple(IdSelectService, numServ,  Serv,  prix);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReadServiceActionPerformed

    private void btnAddAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAchatActionPerformed
        try {
            // TODO add your handling code here:
            Ach.create(numAchat, numProdAchat,  nbrLitre, nomClient, dateAchat);
            Ach.loadId(IdSelectAchat);
            Ach.clear(IdSelectAchat, numAchat, numProdAchat, nbrLitre, nomClient, dateAchat);
            Ach.Fetch(TableauAchat);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddAchatActionPerformed

    private void btnDeleteAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAchatActionPerformed
        try {
            // TODO add your handling code here:
            Ach.delete(numAchat.getText().toString());
            Ach.loadId(IdSelectAchat);
            Ach.clear(IdSelectAchat, numAchat, numProdAchat, nbrLitre, nomClient, dateAchat);
            Ach.Fetch(TableauAchat);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnDeleteAchatActionPerformed

    private void btnUpdateAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAchatActionPerformed
        // TODO add your handling code here:
        
        try {
            Ach.update(numAchat, numProdAchat, nbrLitre, nomClient, dateAchat);
            Ach.loadId(IdSelectAchat);
            Ach.clear(IdSelectAchat, numAchat, numProdAchat, nbrLitre, nomClient, dateAchat);
            Ach.Fetch(TableauAchat);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnUpdateAchatActionPerformed

    private void searchCustomersNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomersNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchCustomersNameActionPerformed

    private void btnFindAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAchatActionPerformed
        try {
            // TODO add your handling code here:
            Ach.searchClient(searchCustomersName.getText().toString(), TableauAchat);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFindAchatActionPerformed

    private void btnReadAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadAchatActionPerformed
        // TODO add your handling code here:
        try {
            Ach.searchTuple(IdSelectAchat, numAchat,  numProdAchat, nbrLitre,  nomClient,  dateAchat);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReadAchatActionPerformed

    private void IdSelectProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdSelectProduitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdSelectProduitActionPerformed

    private void btnAfficherEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficherEntreeActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            Entr.searchTuple(IdSelectEntree, numEntree, numProdEntree, stockEntree, dateEntree);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAfficherEntreeActionPerformed

    private void btnUpdateEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEntreeActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            Entr.update(numEntree, numProdEntree, stockEntree, dateEntree);
            Entr.loadId(IdSelectProduit);
            Entr.clear(IdSelectEntree, numEntree, numProdEntree, stockEntree, dateEntree);
            Entr.Fetch(TableauEntree);

        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateEntreeActionPerformed

    private void btnSupprimerEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerEntreeActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Entr.delete(numEntree.getText().toString());
            Entr.loadId(IdSelectEntree);
            Entr.clear(IdSelectEntree, numEntree, numProdEntree, stockEntree, dateEntree);
            Entr.Fetch(TableauEntree);

        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSupprimerEntreeActionPerformed

    private void btnAddEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEntreeActionPerformed
        // TODO add your handling code here:
        try {
            Entr.create(numEntree, numProdEntree, stockEntree, dateEntree);
            Entr.clear(IdSelectEntree, numEntree, numProdEntree, stockEntree, dateEntree);
            Entr.loadId(IdSelectEntree);
            Entr.Fetch(TableauEntree);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddEntreeActionPerformed

    private void numProdEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numProdEntreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numProdEntreeActionPerformed

    private void stockEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockEntreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockEntreeActionPerformed

    private void immatVoitureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immatVoitureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_immatVoitureActionPerformed

    private void nomClientEntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomClientEntrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomClientEntrActionPerformed

    private void nbrLitreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbrLitreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbrLitreActionPerformed

    private void numAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAchatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAchatActionPerformed

    private void numProdAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numProdAchatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numProdAchatActionPerformed

    private void btnNewProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProduitActionPerformed
        // TODO add your handling code here:
       Prod.clear(numProd, design, stock);
    }//GEN-LAST:event_btnNewProduitActionPerformed

    private void btnNewEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewEntreeActionPerformed
        // TODO add your handling code here:
       Entr.clear(IdSelectEntree, numEntree, numProdEntree, stockEntree, dateEntree);
    }//GEN-LAST:event_btnNewEntreeActionPerformed

    private void btnnewAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewAchatActionPerformed
        try {
            // TODO add your handling code here:
            Ach.loadId(IdSelectAchat);
            Ach.clear(IdSelectAchat, numAchat, numProdAchat, nbrLitre, nomClient, dateAchat);
            Ach.Fetch(TableauAchat);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnnewAchatActionPerformed

    private void btnNewServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewServiceActionPerformed
        // TODO add your handling code here:
        service.clear(numServ, Serv, prix);    
    }//GEN-LAST:event_btnNewServiceActionPerformed

    private void btnNewEntretienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewEntretienActionPerformed
        // TODO add your handling code here:
            Ett.clear(IdSelectEntretien, numEntr, numServEntr, immatVoiture, nomClientEntr, dateEntretien);
    }//GEN-LAST:event_btnNewEntretienActionPerformed

    private void PDFbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFbuttonActionPerformed
        
    }//GEN-LAST:event_PDFbuttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            Ach.Fetch(TableauAchat);
            Ach.loadId(IdSelectAchat);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Ett.Fetch(TableauEntretien);
            Ett.loadId(IdSelectEntretien);
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jPanel5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5FocusGained

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProductForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DocumentException ex) {
                    Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> IdSelectAchat;
    private javax.swing.JComboBox<String> IdSelectEntree;
    private javax.swing.JComboBox<String> IdSelectEntretien;
    private javax.swing.JComboBox<String> IdSelectProduit;
    private javax.swing.JComboBox<String> IdSelectService;
    private javax.swing.JButton PDFbutton;
    private javax.swing.JTextField Serv;
    private javax.swing.JTable TableauAchat;
    private javax.swing.JTable TableauEntree;
    private javax.swing.JTable TableauEntretien;
    private javax.swing.JTable TableauProduit;
    private javax.swing.JTable TableauService;
    private javax.swing.JButton btnAddAchat;
    private javax.swing.JButton btnAddEntree;
    private javax.swing.JButton btnAddEntretien;
    private javax.swing.JButton btnAddProduit;
    private javax.swing.JButton btnAddService;
    private javax.swing.JButton btnAfficherEntree;
    private javax.swing.JButton btnAfficherProduit;
    private javax.swing.JButton btnDeleteAchat;
    private javax.swing.JButton btnDeleteEntretien;
    private javax.swing.JButton btnDeleteService;
    private javax.swing.JButton btnFindAchat;
    private javax.swing.JButton btnNewEntree;
    private javax.swing.JButton btnNewEntretien;
    private javax.swing.JButton btnNewProduit;
    private javax.swing.JButton btnNewService;
    private javax.swing.JButton btnReadAchat;
    private javax.swing.JButton btnReadEntretien;
    private javax.swing.JButton btnReadService;
    private javax.swing.JButton btnSupprimerEntree;
    private javax.swing.JButton btnSupprimerProduit;
    private javax.swing.JButton btnUpdateAchat;
    private javax.swing.JButton btnUpdateEntree;
    private javax.swing.JButton btnUpdateEntretien;
    private javax.swing.JButton btnUpdateProduit;
    private javax.swing.JButton btnUpdateService;
    private javax.swing.JButton btnnewAchat;
    private com.toedter.calendar.JDateChooser dateAchat;
    private com.toedter.calendar.JDateChooser dateEntree;
    private com.toedter.calendar.JDateChooser dateEntretien;
    private javax.swing.JTextField design;
    private javax.swing.JTextField immatVoiture;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nbrLitre;
    private javax.swing.JTextField nomClient;
    private javax.swing.JTextField nomClientEntr;
    private javax.swing.JTextField numAchat;
    private javax.swing.JTextField numEntr;
    private javax.swing.JTextField numEntree;
    private javax.swing.JTextField numProd;
    private javax.swing.JTextField numProdAchat;
    private javax.swing.JTextField numProdEntree;
    private javax.swing.JTextField numServ;
    private javax.swing.JTextField numServEntr;
    private javax.swing.JTextField prix;
    private javax.swing.JLabel recetteTotal;
    private javax.swing.JTextField searchClient;
    private javax.swing.JTextField searchCustomersName;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField stockEntree;
    // End of variables declaration//GEN-END:variables
}
