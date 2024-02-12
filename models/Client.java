package models;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String prenom;
    private String adresse;
    private String telephone;
    private String codePostal;
    private List<Commande> commandes;

    public Client(String prenom, String adresse, String telephone, String codePostal) {
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.codePostal = codePostal;
        this.commandes = new ArrayList<>();
    }

    public void passeCommande(Commande commande) {
        commandes.add(commande);
        System.out.println("Commande passée avec succès par " + prenom);
    }

    public void paieCommande(Commande cmd) {
        System.out.println("La commande " + cmd.getNum() + " a été payée par " + prenom);
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}