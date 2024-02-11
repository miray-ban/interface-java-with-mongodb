package models;

public class Client {
    private String prenom;
    private String adresse;
    private String telephone;
    private String codePostal;

    // Constructeur
    public Client(String prenom, String adresse, String telephone, String codePostal) {
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.codePostal = codePostal;
    }

    // Getters and setters
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
}
