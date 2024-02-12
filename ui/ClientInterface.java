package ui;

import models.Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientInterface extends JFrame {
    private JTextField prenomField, adresseField, telephoneField, codePostalField;
    private Client client;

    public ClientInterface() {
        super("Interface Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
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

        JButton passerCommandeButton = new JButton("Passer une commande");
        passerCommandeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passerCommande();
            }
        });
        panel.add(passerCommandeButton);

        getContentPane().add(panel);
        setVisible(true);
    }

    private void ajouterClient() {
        String prenom = prenomField.getText();
        String adresse = adresseField.getText();
        String telephone = telephoneField.getText();
        String codePostal = codePostalField.getText();

        if (prenom.isEmpty() || adresse.isEmpty() || telephone.isEmpty() || codePostal.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.");
            return;
        }
        
        client = new Client(prenom, adresse, telephone, codePostal);

        JOptionPane.showMessageDialog(this, "Client ajouté avec succès !");
    }

    private void passerCommande() {
        if (client != null) {
            CommandeInterface commandeInterface = new CommandeInterface(client);
            commandeInterface.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez ajouter un client d'abord.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClientInterface());
    }
}
