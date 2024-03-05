
package project.demo;




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InventoryPage extends javax.swing.JFrame {


    public InventoryPage() {

        initComponents();
        setLocationRelativeTo(null);
        loadTableDataFromFile();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lbQuant = new javax.swing.JLabel();
        tfQuant = new javax.swing.JTextField();
        lbPrice = new javax.swing.JLabel();
        tfPrice = new javax.swing.JTextField();
        errorMessage = new javax.swing.JLabel();
        btAdd = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDisplay = new javax.swing.JTable();
        btDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        totalField = new javax.swing.JLabel();
        editPanel = new javax.swing.JPanel();
        tfSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        taMessage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
        );

        addPanel.setPreferredSize(new java.awt.Dimension(450, 330));

        lbName.setText("Name:");



        lbQuant.setText("Quantity:");



        lbPrice.setText("Price:");



        btAdd.setBackground(new java.awt.Color(153, 0, 153));
        btAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAdd.setForeground(new java.awt.Color(255, 255, 255));
        btAdd.setText("ADD");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btUpdate.setBackground(new java.awt.Color(153, 0, 153));
        btUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
                addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addPanelLayout.createSequentialGroup()
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                                                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                                                                .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(tfPrice)
                                                                        .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(lbQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(105, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
                addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbName)
                                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbQuant)
                                        .addComponent(tfQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbPrice)
                                        .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(errorMessage)
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        tableDisplay.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Name", "Quantity", "Price"
                }
        ));
        jScrollPane1.setViewportView(tableDisplay);

        btDelete.setBackground(new java.awt.Color(204, 0, 0));
        btDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btDelete.setForeground(new java.awt.Color(255, 255, 255));
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Total: ");

        totalField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
                tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tablePanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(tablePanelLayout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(20, Short.MAX_VALUE))
                                        .addGroup(tablePanelLayout.createSequentialGroup()
                                                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61))))
        );
        tablePanelLayout.setVerticalGroup(
                tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(totalField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(158, 158, 158))
        );

        btSearch.setBackground(new java.awt.Color(153, 0, 153));
        btSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSearch.setForeground(new java.awt.Color(255, 255, 255));
        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        taMessage.setColumns(20);
        taMessage.setRows(5);
        jScrollPane3.setViewportView(taMessage);

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
                editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
                editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editPanelLayout.createSequentialGroup()
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(editPanelLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(editPanelLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                        .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>



    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String name = tfName.getText();
        int quantity = Integer.parseInt(tfQuant.getText());
        double price = Double.parseDouble(tfPrice.getText());
        saveToFile(name, quantity, price);
        addToTable(name, quantity, price);


    }
    public void saveToFile(String name, int quant, double price) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("inventory.txt", true))) {
            writer.write( name + "," + quant + "," + price );
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String searchCriteria = tfSearch.getText();
        if (searchCriteria != null && !searchCriteria.isEmpty()) {
            searchEntries(searchCriteria);
        }

    }


    private void searchEntries(String searchCriteria) {
        try (BufferedReader reader = new BufferedReader(new FileReader("inventory.txt"))) {
            String line;
            boolean foundMatch = false;
            StringBuilder searchResults = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3 && parts[0].equalsIgnoreCase(searchCriteria)) {
                    searchResults.append("Name: ").append(parts[0]).append("\n");
                    searchResults.append("Quantity: ").append(parts[1]).append("\n");
                    searchResults.append("Price: ").append(parts[2]).append("\n\n");
                    foundMatch = true;
                }
            }

            if (foundMatch) {
                taMessage.setText(searchResults.toString());
            } else {
                taMessage.setText("No matching results found.");
            }
        } catch (IOException e) {
            taMessage.setText("An error occurred while searching for the entries.");
        }
    }




    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableDisplay.getModel();
        int selectedRow = tableDisplay.getSelectedRow();
        if (selectedRow != -1) {
            String name = (String) model.getValueAt(selectedRow, 0);
            model.removeRow(selectedRow);
            deleteFromFile(name);
        } else {
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            }
        }
    }


    private void deleteFromFile(String name) {
        try {
            File inputFile = new File("inventory.txt");
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            boolean entryFound = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3 && parts[0].equalsIgnoreCase(name)) {
                    entryFound = true;
                    continue; // Skip the line if it matches the name
                }
                writer.write(line);
                writer.newLine();
            }

            writer.close();
            reader.close();

            if (entryFound) {
                if (inputFile.delete()) {
                    tempFile.renameTo(inputFile);
                    JOptionPane.showMessageDialog(this, "Entry deleted successfully.");
                } else {
                    JOptionPane.showMessageDialog(this, "An error occurred while deleting the entry.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No matching entry found.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while deleting the entry.");
        }
    }


    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {

        updateOrder();
    }

    private void updateOrder() {
        int selectedRow = tableDisplay.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String name = tfName.getText();
        String quantityString = tfQuant.getText();
        String priceString = tfPrice.getText();

        // Validate input
        if (name.isEmpty() || quantityString.isEmpty() || priceString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        int quantity = Integer.parseInt(quantityString);
        double price = Double.parseDouble(priceString);

        // Update table
        tableDisplay.setValueAt(name, selectedRow, 0);
        tableDisplay.setValueAt(quantity, selectedRow, 1);
        tableDisplay.setValueAt(price, selectedRow, 2);

        // Update file
        updateOrderInFile(name, quantity, price);

        // Clear input fields
        clearFields();
    }

    private void updateOrderInFile(String name, int quantity, double price) {
        try {
            File inputFile = new File("inventory.txt");
            File tempFile = new File("temp.txt");

            if (!inputFile.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3 && parts[0].equalsIgnoreCase(name)) {
                    writer.write(name + "," + quantity + "," + price + "\n");
                } else {
                    writer.write(line);
                }
                writer.newLine();
            }

            reader.close();
            writer.close();

            if (!inputFile.delete()) {
                System.out.println("Failed to delete the file.");
                return;
            }

            if (!tempFile.renameTo(inputFile)) {
                System.out.println("Failed to rename the temporary file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void addToTable(String name, int quantity, double price) {

        DefaultTableModel model = (DefaultTableModel) tableDisplay.getModel();
        model.addRow(new Object[]{ name, quantity, price});
        clearFields();

    }

    private void loadTableDataFromFile() {
        DefaultTableModel model = (DefaultTableModel) tableDisplay.getModel();
        model.setRowCount(0); // Clear existing data in the table

        try (BufferedReader reader = new BufferedReader(new FileReader("inventory.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    String quant = parts[1];
                    String price = parts[2];

                    model.addRow(new Object[]{name, quant, price});
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while loading data from the file.");
        }
    }



    public void clearFields(){
        tfQuant.setText("");
        tfPrice.setText("");
        tfName.setText("");
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InventoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryPage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btUpdate;
    private javax.swing.JPanel editPanel;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbQuant;
    private javax.swing.JTextArea taMessage;
    private static javax.swing.JTable tableDisplay;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfQuant;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JLabel totalField;
    // End of variables declaration
}
