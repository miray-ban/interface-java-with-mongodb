package ui;

import db.MongoDBConnection;
import models.Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientInterface extends JFrame {
    private JTextField prenomField, adresseField, telephoneField, codePostalField;

    public ClientInterface() {
        super("Interface Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        prenomField = new JTextField(20);
        adresseField = new JTextField(20);
        telephoneField = new JTextField(20);
        codePostalField = new JTextField(20);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Prénom:"));
        panel.add(prenomField);

        panel.add(new JLabel("Adresse:"));
        panel.add(adresseField);

        panel.add(new JLabel("Téléphone:"));
        panel.add(telephoneField);

        panel.add(new JLabel("Code Postal:"));
        panel.add(codePostalField);

        JButton addButton = new JButton("Ajouter Client");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ajouterClient();
            }
        });
        panel.add(addButton);

        getContentPane().add(panel);
        setVisible(true);
    }

    private void ajouterClient() {
        String prenom = prenomField.getText();
        String adresse = adresseField.getText();
        String telephone = telephoneField.getText();
        String codePostal = codePostalField.getText();

        // Création du client
        Client client = new Client(prenom, adresse, telephone, codePostal);
        
        // Enregistrement du client dans la base de données MongoDB
        MongoDBConnection.saveClient(client);

        // Affichage d'un message de succès
        JOptionPane.showMessageDialog(null, "Client ajouté avec succès !");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClientInterface::new);
    }
}
