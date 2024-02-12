package ui;
import models.Client;
import models.Commande;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandeInterface extends JFrame {
    private JTextField numeroField, dateField, adresseField;
    private JButton validerButton, ajouterArticleButton, modifierButton, payerButton;

    public CommandeInterface(Client client) {
        super("Interface Commande");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        numeroField = new JTextField(20);
        dateField = new JTextField(20);
        adresseField = new JTextField(20);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Numéro de commande:"));
        panel.add(numeroField);

        panel.add(new JLabel("Date de commande (dd/MM/yyyy):"));
        panel.add(dateField);

        panel.add(new JLabel("Adresse de livraison:"));
        panel.add(adresseField);

        validerButton = new JButton("Valider");
        validerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validerCommande();
            }
        });
        panel.add(validerButton);

        ajouterArticleButton = new JButton("Ajouter article");
        ajouterArticleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ajouterArticle();
            }
        });
        panel.add(ajouterArticleButton);

        modifierButton = new JButton("Modifier");
        modifierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modifierCommande();
            }
        });
        panel.add(modifierButton);

        payerButton = new JButton("Payer");
        payerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                payerCommande();
            }
        });
        panel.add(payerButton);

        getContentPane().add(panel);
        setVisible(true);
    }

    private void validerCommande() {
        String numero = numeroField.getText();
        String date = dateField.getText();
        String adresse = adresseField.getText();

        if (numero.isEmpty() || date.isEmpty() || adresse.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.");
            return;
        }

        JOptionPane.showMessageDialog(this, "Commande validée !");
    }

    private void ajouterArticle() {
        
        String articleNom = JOptionPane.showInputDialog(this, "Entrez le nom de l'article:");
        if (articleNom == null || articleNom.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nom de l'article vide. Veuillez entrer un nom valide.");
            return; 
        }
    
       
        String prixString = JOptionPane.showInputDialog(this, "Entrez le prix de l'article:");
        double prix;
        try {
            prix = Double.parseDouble(prixString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Prix de l'article invalide. Veuillez entrer un nombre valide.");
            return; 
        }
    
        
        String rayon = JOptionPane.showInputDialog(this, "Entrez le rayon de l'article:");
        if (rayon == null || rayon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Rayon de l'article vide. Veuillez entrer un rayon valide.");
            return; 
        }
    
        
        String sousRayon = JOptionPane.showInputDialog(this, "Entrez le sous-rayon de l'article:");
        if (sousRayon == null || sousRayon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Sous-rayon de l'article vide. Veuillez entrer un sous-rayon valide.");
            return; 
        }
    
        String messageConfirmation = "L'article '" + articleNom + "' a été ajouté avec succès.\n" +
                "Prix: " + prix + "\n" +
                "Rayon: " + rayon + "\n" +
                "Sous-rayon: " + sousRayon;
        JOptionPane.showMessageDialog(this, messageConfirmation);
    }
    
    

    private void modifierCommande() {
        JTextField numeroField = new JTextField(20);
        JTextField dateField = new JTextField(20);
        JTextField adresseField = new JTextField(20);
    
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Nouveau numéro de commande:"));
        panel.add(numeroField);
        panel.add(new JLabel("Nouvelle date de commande (dd/MM/yyyy):"));
        panel.add(dateField);
        panel.add(new JLabel("Nouvelle adresse de livraison:"));
        panel.add(adresseField);
    
        int result = JOptionPane.showConfirmDialog(null, panel, "Modifier la commande", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String nouveauNumero = numeroField.getText();
            String nouvelleDate = dateField.getText();
            String nouvelleAdresse = adresseField.getText();
    
            if (!nouveauNumero.isEmpty() && !nouvelleDate.isEmpty() && !nouvelleAdresse.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Commande modifiée avec succès !");
            } else {
                JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.");
            }
        }
    }
    

    private void payerCommande() {
        double montantTotal = 100.0; 
    
        String resumeCommande = "Montant total à payer : $" + montantTotal + "\n";
        resumeCommande += "Voulez-vous vraiment payer cette commande ?";
    
        int confirmation = JOptionPane.showConfirmDialog(this, resumeCommande, "Confirmation de paiement", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.YES_OPTION) {
            String numeroCarte = JOptionPane.showInputDialog(this, "Entrez votre numéro de carte de crédit :");
    
          
        }
    }
    
    
    
    
}
